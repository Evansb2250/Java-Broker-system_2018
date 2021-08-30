/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brokerclient;

import brokerclient.BrokerClient;
import brokerclient.*;

/**
 *
 * @author samue
 */
public class user_Interface {

    public static Boolean login(java.lang.String userName, java.lang.String password) {
        brokerclient.BrokerSystemFunctions_Service service = new brokerclient.BrokerSystemFunctions_Service();
        brokerclient.BrokerSystemFunctions port = service.getBrokerSystemFunctionsPort();
        return port.login(userName, password);
    }

    public static Boolean signUp(java.lang.String userName, java.lang.String password) {
        brokerclient.BrokerSystemFunctions_Service service = new brokerclient.BrokerSystemFunctions_Service();
        brokerclient.BrokerSystemFunctions port = service.getBrokerSystemFunctionsPort();
        return port.signUp(userName, password);
    }

    public static boolean buyShares(java.lang.String user, java.lang.String companyName, java.lang.String amount) {
        brokerclient.BrokerSystemFunctions_Service service = new brokerclient.BrokerSystemFunctions_Service();
        brokerclient.BrokerSystemFunctions port = service.getBrokerSystemFunctionsPort();
        return port.buyShares(user, companyName, amount);
    }

    public static UserID getUserDetails(java.lang.String userName) {
        brokerclient.BrokerSystemFunctions_Service service = new brokerclient.BrokerSystemFunctions_Service();
        brokerclient.BrokerSystemFunctions port = service.getBrokerSystemFunctionsPort();
        return port.getUserDetails(userName);
    }

    protected static Boolean sellStock(java.lang.String userName, java.lang.String companyName, int amount) {
        brokerclient.BrokerSystemFunctions_Service service = new brokerclient.BrokerSystemFunctions_Service();
        brokerclient.BrokerSystemFunctions port = service.getBrokerSystemFunctionsPort();
        return port.sellStock(userName, companyName, amount);
    }

    protected boolean passwordValidation(String pWord1, String pWord2) {
        boolean passedStatus = false;
        if(pWord1.length() >= 5){
        if (pWord1.length() == pWord2.length()) {

            if (pWord1.equals(pWord2)) {
                passedStatus = true;
            }
        }
        }
        return passedStatus;
    }

    protected static Boolean logOut(java.lang.String userName) {
        brokerclient.BrokerSystemFunctions_Service service = new brokerclient.BrokerSystemFunctions_Service();
        brokerclient.BrokerSystemFunctions port = service.getBrokerSystemFunctionsPort();
        return port.logOut(userName);
    }
    
    
    
        protected static java.util.List<brokerclient.Company> getCompanienames() {
        brokerclient.BrokerSystemFunctions_Service service = new brokerclient.BrokerSystemFunctions_Service();
        brokerclient.BrokerSystemFunctions port = service.getBrokerSystemFunctionsPort();
        return port.getCompanienames();
    }



    
    

}
