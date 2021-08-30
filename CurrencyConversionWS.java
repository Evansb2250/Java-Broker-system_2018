/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DOCwebServices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;


/**
 *
 * @author taha-m
 */
@WebService()
public class CurrencyConversionWS {

    public enum ExRate {
        AED ("UAE Dirham", 0.168577),
        ARS ("Argentine Peso", 0.15464),
        AUD ("Australian Dollar", 0.615118),
        BGN ("Bulgarian Lev", 0.437263),
        BRL ("Brazilian Real", 0.36452),
        BWP ("Botswana Pula", 0.0945012),
        CAD ("Canadian Dollar", 0.612737),
        CHF ("Swiss Franc", 0.628501),
        CLP ("Chilean Peso", 0.00130255),
        CNY ("Chinese Yuan", 0.0941966),
        COP ("Colombian Peso", 0.000333297),
        DKK ("Danish Krone", 0.114709),
        EEK ("Estonian Kroon", 0.0546572),
        EGP ("Egypt Pounds", 0.107657),
        EUR ("Euro", 0.855201),
        GBP ("British pound", 1.0),
        HKD ("Hong Kong Dollar", 0.0806557),
        HRK ("Croatian Kuna", 0.115641),
        HUF ("Hungarian Forint", 0.00311833),
        ILS ("Israeli New Shekel", 0.17155),
        INR ("Indian Rupee", 0.0137968),
        ISK ("Iceland Krona", 0.00554904),
        JPY ("Japanese Yen", 0.00749584),
        KRW ("South Korean Won", 0.000552922),
        KZT ("Kazakhstani Tenge", 0.00424244),
        LKR ("Sri Lanka Rupee", 0.00559926),
        LTL ("Lithuanian Litas", 0.247684),
        LVL ("Latvian Lat", 1.2057),
        LYD ("Libyan Dinar", 0.32365),
        MXN ("Mexican Peso", 0.0508402),
        MYR ("Malaysian Ringgit", 0.200469),
        NOK ("Norwegian Kroner", 0.104293),
        NPR ("Nepalese Rupee", 0.0086265),
        NZD ("New Zealand Dollar", 0.485357),
        OMR ("Omani Rial", 1.62658),
        PKR ("Pakistan Rupee", 0.00732149),
        QAR ("Qatari Rial", 0.171819),
        RON ("Romanian Leu", 0.198977),
        RUB ("Russian Ruble", 0.0201399),
        SAR ("Saudi Riyal", 0.166779),
        SDG ("Sudanese Pound",0.260967),
        SEK ("Swedish Krona", 0.091032),
        SGD ("Singapore Dollar", 0.481964),
        THB ("Thai Baht", 0.0208891),
        TRY ("Turkish Lira", 0.432246),
        TTD ("Trinidad/Tobago Dollar", 0.098396),
        TWD ("Taiwan Dollar", 0.0206288),
        UAH ("Ukrainian hryvnia", 0.077864),
        USD ("United States Dollar", 0.625421),
        VEB ("Venezuelan Bolivar", 0.145633),
        ZAR ("South African Rand", 0.0893935);

        private final double rateInGBP;
        private final String curName;
        ExRate(String curName,double rateInGBP) {
           
            this.rateInGBP = rateInGBP;
            this.curName = curName;
        }
        double rateInGBP()   { return rateInGBP; }
        String curName()   { return curName; }
    }

    public Double GetConversionRate(String cur1, String cur2) {
        try {  
            String origingalAPIOutput = RequestCurrency(cur1, cur2);
         
                           
               String  one =cur1;
               String  two =cur2;
              
              
              
                origingalAPIOutput =  origingalAPIOutput.replaceAll("\""," ");
                origingalAPIOutput =  origingalAPIOutput.replaceAll(":"," ");
                origingalAPIOutput =  origingalAPIOutput.replaceAll("}",",");
                one = origingalAPIOutput.substring(origingalAPIOutput.indexOf(one) );
                one = one.substring(0, one.indexOf(","));
                one = one.substring(3).trim();
                 
                two = origingalAPIOutput.substring(origingalAPIOutput.indexOf(two));
                two = two.substring(0, two.indexOf(","));
                two = two.substring(3).trim();
            
            
            
            

            
            double rate1 = Double.parseDouble(one) ; 
            double rate2 =  Double.parseDouble(two);
            
            return rate1/rate2;
    
        }
        catch (IllegalArgumentException iae) {
           return -1.0;
        }
    }

    public List<String> GetCurrencyCodes() {
        List<String> codes = new ArrayList();
        for (ExRate exr : ExRate.values()) {
            codes.add(exr.name() + " - " + exr.curName);
        }
        return codes;
    }

    /**
     * Web service operation
     */
    
    
    
    public String RequestCurrency(String currencyOne, String currencyTwo) {
        //TODO write your implementation code here:
             try {
         String secondAPI ="http://data.fixer.io/api/latest?access_key=e21fe1f06080074e817349c912966a57&symbols=";
         String oldAPI = "https://api.exchangeratesapi.io/latest?symbols=";
     //   cur1 ="USD";
     //   cur2="GBP";
   //  System.setProperty("https.protocols", "TLSv1");
   

            URL url = new URL( secondAPI+ currencyOne+ "," +currencyTwo );
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            //InputStreamReader j = new InputStreamReader(conn.getInputStream());
           BufferedReader ins = new BufferedReader(new InputStreamReader(conn.getInputStream()));
           String inString;
           String returnedString = "";
            //StringBuilder sb = new StringBuilder();
           while((inString = ins.readLine())!= null){
               returnedString += inString;
               
           }
 
           return returnedString;
               
        }  catch(MalformedURLException   e){
            return e.getMessage();
        }catch(IOException ioe){ return ioe.getMessage(); }
    }
    }
    
    
 


