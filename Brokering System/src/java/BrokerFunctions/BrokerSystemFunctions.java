package BrokerFunctions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import ShareOrder.*;

import java.util.List;
import java.io.File;
import AccountDetail.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author N0707417
 */
@WebService(serviceName = "BrokerSystemFunctions")
@Stateless()
public class BrokerSystemFunctions {

    AccountDetail.ListOfUserIDs userID = new AccountDetail.ListOfUserIDs();
    AccountDetail.ListOfShares shareID = new AccountDetail.ListOfShares();

    /**
     * This is a sample web service operation
     */
    /**
     * Web service operation
     *
     * @param userName
     */
    @WebMethod(operationName = "buyShares")

    synchronized public boolean buyShares(@WebParam(name = "userName") String userName, @WebParam(name = "companyName") String companyName, @WebParam(name = "amount") String amount) {

        boolean boughtStock = false;
        boolean stockAvailable = true;
        userID = readXML();
        //This contains all the information regarding the account 
        List<UserID> list = userID.getUserList();
        List<CompanyShare> myShares = shareID.getShareList();
        //This adds a new stock to the customers account 
        CompanyShare newStockInfo = new CompanyShare();
 
try{
    
            //Checks to see if the purchase was made
          
          Calendar cal = Calendar.getInstance();
          XMLGregorianCalendar date;
          GregorianCalendar gCal = new GregorianCalendar();
          date = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCal);
          int day = date.getDay();
          int month = date.getMonth();
          int year = date.getYear();
          int hour = date.getHour();
          int minute = date.getMinute();
          int second = date.getSecond();

          gCal.set(year, month, day, hour, minute, second);
        
        if (stockAvailable) {
           AvailableShares aShares = readStockFile();

            List<Company> repository = aShares.getSharesCollection();

            for (int id = 0; id < repository.size(); id++) {

                if (repository.get(id).getCompanyname().equals(companyName)) {
                    
                    if( Integer.parseInt(amount) <= repository.get(id).getShareAmount()){
                    int stockAmount = repository.get(id).getShareAmount();
                    repository.get(id).setShareAmount(stockAmount - Integer.parseInt(amount));
                    repository.get(id).getShares().setLastUpdate(date);
                    updateStockFile(aShares);
                    }else
                        stockAvailable = false;
                    
                }
            }

            

        }
    

    if(stockAvailable){
     
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUserName().equals(userName)) {

                //adds aditional stocks to a company they have already invested in
                for (int d = 0; d < list.get(i).getMyShare().getShareList().size(); d++) {
                    if (list.get(i).getMyShare().getShareList().get(d).getCompanyName().equals(companyName)) {
                        int oldAmount = list.get(i).getMyShare().getShareList().get(d).getQuantity();
                        int newAmount = Integer.parseInt(amount);
                        list.get(i).getMyShare().getShareList().get(d).setQuantity(oldAmount + newAmount);
                       
                        boughtStock = true;

                    }

                }
                if (boughtStock != true) {
                    // creates a new stock entry for a company that the user hasn't invested in.
                    newStockInfo.setQuantity(Integer.parseInt(amount));
                    newStockInfo.setCompanyName(companyName);
                    list.get(i).getMyShare().getShareList().add(newStockInfo);

                    boughtStock = true;

                }

            } // end of if statement

        } // end of for loop
    }

}catch (DatatypeConfigurationException e) {
            // XXXTODO Handle exception

        }

        writeXML();
        return boughtStock;
    }

    
    
    
    
    
    
    synchronized private AvailableShares readStockFile() {

        //Creates a object of Availables shares  which is an element inside the xml type. It contains multiple instances of the complextype company and complextype of share_details
        AvailableShares aShares = new AvailableShares();

        //The section below converts an xml file into java objects. This is done by unmarshalling.
        try {
            javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(AvailableShares.class);
            javax.xml.bind.Unmarshaller unmarshaller = jaxbCtx.createUnmarshaller();
            aShares = (AvailableShares) unmarshaller.unmarshal(new File("E:\\Cloud\\Brokering System\\accountDatabase12.xml")); //NOI18N

        } catch (javax.xml.bind.JAXBException ex) {
            // XXXTODO Handle exception
            java.util.logging.Logger.getLogger("global").log(java.util.logging.Level.SEVERE, null, ex); //NOI18N
        }

        return aShares;

    }

    synchronized private void updateStockFile(AvailableShares aShares) {

        try {
            javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(aShares.getClass().getPackage().getName());
            javax.xml.bind.Marshaller marshaller = jaxbCtx.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8"); //NOI18N
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(aShares, new java.io.File("E:\\Cloud\\Brokering System\\accountDatabase12.xml"));
        } catch (javax.xml.bind.JAXBException ex) {
            // XXXTODO Handle exception
            java.util.logging.Logger.getLogger("global").log(java.util.logging.Level.SEVERE, null, ex); //NOI18N
        }

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getCompanienames")
    public List<Company> getCompanienames() {

        //Creates a object of Availables shares  which is an element inside the xml type. It contains multiple instances of the complextype company and complextype of share_details
        AvailableShares aShares = new AvailableShares();

        //The section below converts an xml file into java objects. This is done by unmarshalling.
        try {
            javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(AvailableShares.class);
            javax.xml.bind.Unmarshaller unmarshaller = jaxbCtx.createUnmarshaller();
            // aShares = (AvailableShares) unmarshaller.unmarshal(new File("E:\\Cloud\\Brokering System\\Company.xml")); //NOI18N
            aShares = (AvailableShares) unmarshaller.unmarshal(new File("E:\\Cloud\\Brokering System\\accountDatabase12.xml"));
        } catch (javax.xml.bind.JAXBException ex) {
            // XXXTODO Handle exception
            java.util.logging.Logger.getLogger("global").log(java.util.logging.Level.SEVERE, null, ex); //NOI18N
        }

        List<Company> compShares = aShares.getSharesCollection();

        return compShares;

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getUserDetails")
    public UserID getUserDetails(@WebParam(name = "userName") String userName) {
        //TODO write your implementation code here:

        userID = readXML();
        List<UserID> list = userID.getUserList();
        for (int i = 0; i < list.size(); i++) {
            //    System.out.println(list.get(i).getUserName());
            //     System.out.println(list.get(i).getPassword());
            if (list.get(i).getUserName().equals(userName)) {

                UserID user = list.get(i);
                return user;
            }

        }

        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Login")
    public Boolean Login(@WebParam(name = "userName") String userName, @WebParam(name = "password") String password) {
        //TODO write your implementation code here:
        boolean loggedIn = false;
        userID = readXML();
        List<UserID> list = userID.getUserList();

        for (int i = 0; i < list.size(); i++) {
            //    System.out.println(list.get(i).getUserName());
            //     System.out.println(list.get(i).getPassword());
            if (list.get(i).getUserName().equals(userName)) {

                if (list.get(i).getPassword().equals(password)) {
                    if(list.get(i).isLoggedOn() == false){
                    list.get(i).setLoggedOn(true);
                    loggedIn = true;
                    }
                }
            }

        }

        writeXML();
        return loggedIn;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Sign_up")
    synchronized public Boolean Sign_up(@WebParam(name = "userName") String userName, @WebParam(name = "password") String password) {
        //TODO write your implementation code here:
        boolean makeAccount = true;
        //Contains all the users in the system
        userID = readXML();
        List<UserID> list = userID.getUserList();
        //User information

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUserName().equals(userName)) {
                makeAccount = false;
                break;
            } else {
                makeAccount = true;
            }
        }

        if (makeAccount) {
            UserID newUser = new UserID();
            newUser.setUserName(userName);
            newUser.setPassword(password);
            List<CompanyShare> myShares = shareID.getShareList();
            newUser.setMyShare(shareID);
            list.add(newUser);
            writeXML();
        }

        return makeAccount;
    }

    private void writeXML() {
        try {
            javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(userID.getClass().getPackage().getName());
            javax.xml.bind.Marshaller marshaller = jaxbCtx.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8"); //NOI18N
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(userID, new File("E:\\Cloud\\Brokering System\\accountDatabase.xml"));
        } catch (javax.xml.bind.JAXBException ex) {
            // XXXTODO Handle exception
            java.util.logging.Logger.getLogger("global").log(java.util.logging.Level.SEVERE, null, ex); //NOI18N
        }
    }

    private AccountDetail.ListOfUserIDs readXML() {
        AccountDetail.ListOfUserIDs loadedList = new AccountDetail.ListOfUserIDs();

        try {
            javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(loadedList.getClass().getPackage().getName());
            javax.xml.bind.Unmarshaller unmarshaller = jaxbCtx.createUnmarshaller();
            loadedList = (ListOfUserIDs) unmarshaller.unmarshal(new File("E:\\Cloud\\Brokering System\\accountDatabase.xml")); //NOI18N
        } catch (javax.xml.bind.JAXBException ex) {
            // XXXTODO Handle exception
            java.util.logging.Logger.getLogger("global").log(java.util.logging.Level.SEVERE, null, ex); //NOI18N
        }

        return loadedList;

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sellStock")
   synchronized public Boolean sellStock(@WebParam(name = "userName") String userName, @WebParam(name = "companyName") String companyName, @WebParam(name = "amount") int amount) {
        //TODO write your implementation code here:
        boolean soldStock = false;

        userID = readXML();
        //This contains all the information regarding the account 
        List<UserID> list = userID.getUserList();
        List<CompanyShare> myShares = shareID.getShareList();
        //This adds a new stock to the customers account 
        CompanyShare newStockInfo = new CompanyShare();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUserName().equals(userName)) {

                //adds aditional stocks to a company they have already invested in
                for (int d = 0; d < list.get(i).getMyShare().getShareList().size(); d++) {
                    if (list.get(i).getMyShare().getShareList().get(d).getCompanyName().equals(companyName)) {
                        int oldAmount = list.get(i).getMyShare().getShareList().get(d).getQuantity();
                        int deductedAmount = amount;
                        list.get(i).getMyShare().getShareList().get(d).setQuantity(oldAmount - deductedAmount);
                        soldStock = true;

                    }

                }

            } // end of if statement

        } // end of for loop
        if (soldStock) {
            AvailableShares aShares = readStockFile();

            List<Company> repository = aShares.getSharesCollection();

            for (int id = 0; id < repository.size(); id++) {
                if (repository.get(id).getCompanyname().equals(companyName)) {
                    int stockAmount = repository.get(id).getShareAmount();
                    repository.get(id).setShareAmount(stockAmount + amount);
                }
            }

            updateStockFile(aShares);
        }
        writeXML();

        return soldStock;
    }

    /**
     * Web service operation
     */
    
    
    @WebMethod(operationName = "LogOut")
    public Boolean LogOut(@WebParam(name = "userName") String userName) {
        //TODO write your implementation code here:
        userID = readXML();
        List<UserID> list = userID.getUserList();
        boolean loggedOut = false;
        for (int i = 0; i < list.size(); i++) {
            //    System.out.println(list.get(i).getUserName());
            //     System.out.println(list.get(i).getPassword());
            if (list.get(i).getUserName().equals(userName)) {
                list.get(i).setLoggedOn(false);
                loggedOut = true;
                break;
            }

        }

        writeXML();
        return loggedOut;
    }


}
