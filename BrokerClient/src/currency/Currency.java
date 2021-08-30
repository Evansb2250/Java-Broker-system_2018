/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

/**
 *
 * @author samue
 */
public class Currency {

  
  public List<String> currencySymbols ;
  public Currency(){
    currencySymbols  = new ArrayList<>();
    currencySymbols  = getCurrencyCodes();
    
}
          

    public static double getConversionRate(java.lang.String arg0, java.lang.String arg1) {
        currency.CurrencyConversionWSService service = new currency.CurrencyConversionWSService();
        currency.CurrencyConversionWS port = service.getCurrencyConversionWSPort();
        return port.getConversionRate(arg0, arg1);
    }

    public static java.util.List<java.lang.String> getCurrencyCodes() {
        currency.CurrencyConversionWSService service = new currency.CurrencyConversionWSService();
        currency.CurrencyConversionWS port = service.getCurrencyConversionWSPort();
        return port.getCurrencyCodes();
    }
 
  
  
  
  
  
  
  


    


    
    
}
