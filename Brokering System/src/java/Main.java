
import java.io.File;

import java.util.GregorianCalendar;
import javax.xml.datatype.*;

import java.util.List;
import AccountDetail.*;
import ShareOrder.*;
import javax.xml.bind.JAXBException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author N0707417
 */
public class Main {

    public static void main(String[] args) {
        /*
        // TODO code application logic here
        ListOfUserIDs database = new ListOfUserIDs();
        UserID newUser = new UserID();
        try {
            javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(database.getClass().getPackage().getName());
            javax.xml.bind.Unmarshaller unmarshaller = jaxbCtx.createUnmarshaller();
            database = (ListOfUserIDs) unmarshaller.unmarshal(new java.io.File("E:\\Cloud\\Brokering System\\accountDatabase.xml")); //NOI18N
        } catch (javax.xml.bind.JAXBException ex) {
            // XXXTODO Handle exception
            java.util.logging.Logger.getLogger("global").log(java.util.logging.Level.SEVERE, null, ex); //NOI18N
        }

           List<UserID> list = database.getUserList();
        newUser.setUserName("Jane");
        newUser.setPassword("dsds");
    
        list.add(newUser);
        
        try {            
            javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(database.getClass().getPackage().getName());
            javax.xml.bind.Marshaller marshaller = jaxbCtx.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8"); //NOI18N
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(database, new java.io.File("E:\\Cloud\\Brokering System\\accountDatabase.xml"));
        } catch (javax.xml.bind.JAXBException ex) {
            // XXXTODO Handle exception
            java.util.logging.Logger.getLogger("global").log(java.util.logging.Level.SEVERE, null, ex); //NOI18N
        }
        
       */

        try {

            Company company = new Company();
            ShareDetails shareInformation = new ShareDetails();
            AvailableShares shares = new AvailableShares();
            GregorianCalendar gCal = new GregorianCalendar();

            List<Company> companyList = shares.getSharesCollection();
            XMLGregorianCalendar date;
            gCal.set(2001, 05, 22);

            company.setCompanyname("Amazon");
            company.setSymbol("AMZ");
            company.setShareAmount(500);
            shareInformation.setPrice((float) 23.22);
            shareInformation.setCurrency("USD");
            company.setShares(shareInformation);

            date = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCal);
            shareInformation.setLastUpdate(date);

            companyList.add(company);

            company = new Company();
            shareInformation = new ShareDetails();
            gCal = new GregorianCalendar();
            date = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCal);

            company.setCompanyname("Google");
            company.setSymbol("GGLE");
            company.setShareAmount(1500);
            shareInformation.setPrice((float) 893.22);
            shareInformation.setCurrency("USD");
            company.setShares(shareInformation);
            companyList.add(1, company);

            company = new Company();
            shareInformation = new ShareDetails();
            gCal = new GregorianCalendar();
            date = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCal);
            shareInformation.setLastUpdate(date);

            company.setCompanyname("TeckStar");
            company.setSymbol("Tkstr");
            company.setShareAmount(200);
            shareInformation.setPrice((float) 49.22);
            shareInformation.setCurrency("AED");
            company.setShares(shareInformation);

            date = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCal);
            
            shareInformation.setLastUpdate(date);
            companyList.add(2, company);

            company = new Company();
            shareInformation = new ShareDetails();
            gCal = new GregorianCalendar();
            date = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCal);
            

            company.setCompanyname("lloyds Banking");
            company.setSymbol("LLDs");
            company.setShareAmount(2100);
            shareInformation.setPrice((float) 130.23);
            shareInformation.setCurrency("RON");
            company.setShares(shareInformation);
            companyList.add(3, company);

            company = new Company();
            shareInformation = new ShareDetails();
            gCal = new GregorianCalendar();
            date = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCal);

            company.setCompanyname("Samsung Group");
            company.setSymbol("SMG");
            company.setShareAmount(3000);
            shareInformation.setPrice((float) 370.54);
            shareInformation.setCurrency("EGP");
            company.setShares(shareInformation);
            companyList.add(4, company);

            company = new Company();
            shareInformation = new ShareDetails();
            gCal = new GregorianCalendar();
            date = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCal);

            company.setCompanyname("SABIC");
            company.setSymbol("SBC");
            company.setShareAmount(1100);
            shareInformation.setPrice((float) 600.32);
            shareInformation.setCurrency("TRY");
            company.setShares(shareInformation);
            companyList.add(5, company);
        
            
            javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(shares.getClass().getPackage().getName());
            javax.xml.bind.Marshaller marshaller = jaxbCtx.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8"); //NOI18N
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(shares, new File("Company.xml"));

        } catch (JAXBException ex) {
            java.util.logging.Logger.getLogger("global").log(java.util.logging.Level.SEVERE, null, ex); //NOI18N  
        } catch (DatatypeConfigurationException e) {
            // XXXTODO Handle exception

        }

        
       
    }
}
