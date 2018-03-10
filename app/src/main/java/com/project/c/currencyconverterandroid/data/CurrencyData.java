package com.project.c.currencyconverterandroid.data;

import android.widget.Toast;

import com.project.c.currencyconverterandroid.model.Currency;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by frank on 3/10/2018.
 */

public class CurrencyData {




    public static List<Currency> selectCurrencies(String base){
        List<Currency> currencies = new ArrayList<>();
        switch(base){
            case "USD": //Dollars
                currencies.add(new Currency("DOP",49.04,
                        "Dominican Pesos"));
                currencies.add(new Currency("AUD",1.2909,
                        "Australian dollar"));
                currencies.add(new Currency("BGN",1.5892,
                        "Bulgarian lev"));
                currencies.add(new Currency("BRL",3.258,
                        "Brazil real"));
                currencies.add(new Currency("CAD",1.2931,
                        "Canadian dollar"));
                currencies.add(new Currency("CHF",0.93841,
                        "Swiss franc"));
                currencies.add(new Currency("CNY",6.3403,
                        "Chinese yuan"));
                currencies.add(new Currency("CZK",20.642,
                        "Czech koruna"));
                currencies.add(new Currency("DKK",6.0509,
                        "Danish krone"));
                currencies.add(new Currency("EUR",0.81255,
                        "Euro"));
                currencies.add(new Currency("GBP",0.72373,
                        "British pound"));
                currencies.add(new Currency("HKD",7.8328,
                        "Hong Kong dollar"));
                currencies.add(new Currency("HRK",6.0375,
                        "Croatian kuna"));
                currencies.add(new Currency("HUF",254.94,
                        "Hungarian forint"));
                currencies.add(new Currency("IDR",13763.0,
                        "Indonesian rupiah"));
                currencies.add(new Currency("ILS",3.4598,
                        "Israeli shekel"));
                currencies.add(new Currency("INR",65.108,
                        "Indian rupee"));
                //FillingUp.add(new Currency("ISK",65.108));
                currencies.add(new Currency("JPY",105.65,
                        "Japanese yen"));
                currencies.add(new Currency("KRW",1079.6,
                        "South Korean won"));
                currencies.add(new Currency("MXN",18.899,
                        "Mexican peso"));
                currencies.add(new Currency("MYR",3.905,
                        "Malaysian ringgit"));
                currencies.add(new Currency("NOK",7.8277,
                        "Norwegian krone"));
                currencies.add(new Currency("NZD",1.3834,
                        "New Zealand dollar"));
                currencies.add(new Currency("PHP",51.965,
                        "Philippine peso"));
                currencies.add(new Currency("PLN",3.4053,
                        "Polish zloty"));
                currencies.add(new Currency("RON",3.7879,
                        "Romanian lei"));
                currencies.add(new Currency("RUB",57.12,
                        "Russian ruble"));
                currencies.add(new Currency("SEK",8.262,
                        "Swedish krona"));
                currencies.add(new Currency("SGD",1.3194,
                        "Singapore dollar"));
                currencies.add(new Currency("THB",31.42,
                        "Thai baht"));
                currencies.add(new Currency("TRY",3.814,
                        "Turkish lira"));
                currencies.add(new Currency("ZAR",11.878,
                        "South African rand"));
                break;
            case "EUR": //Euro
                currencies.add(new Currency("DOP",62.30,
                        "Dominican Pesos"));
                currencies.add(new Currency("AUD",1.5887,
                        "Australian dollar"));
                currencies.add(new Currency("BGN",1.9558,
                        "Bulgarian lev"));
                currencies.add(new Currency("BRL",4.0096,
                        "Brazil real"));
                currencies.add(new Currency("CAD",1.5914,
                        "Canadian dollar"));
                currencies.add(new Currency("CHF",1.1549,
                        "Swiss franc"));
                currencies.add(new Currency("CNY",7.803,
                        "Chinese yuan"));
                currencies.add(new Currency("CZK",25.404,
                        "Czech koruna"));
                currencies.add(new Currency("DKK",7.4468,
                        "Danish krone"));
                currencies.add(new Currency("USD",1.2307,
                        "United State Dollars"));
                currencies.add(new Currency("GBP",0.8907,
                        "British pound"));
                currencies.add(new Currency("HKD",9.6398,
                        "Hong Kong dollar"));
                currencies.add(new Currency("HRK",7.4303,
                        "Croatian kuna"));
                currencies.add(new Currency("HUF",313.76,
                        "Hungarian forint"));
                currencies.add(new Currency("IDR",16938,
                        "Indonesian rupiah"));
                currencies.add(new Currency("ILS",4.258,
                        "Israeli shekel"));
                currencies.add(new Currency("INR",80.128,
                        "Indian rupee"));
                //FillingUp.add(new Currency("ISK",65.108));
                currencies.add(new Currency("JPY",130.02,
                        "Japanese yen"));
                currencies.add(new Currency("KRW",1328.7,
                        "South Korean won"));
                currencies.add(new Currency("MXN",23.259,
                        "Mexican peso"));
                currencies.add(new Currency("MYR",4.80595,
                        "Malaysian ringgit"));
                currencies.add(new Currency("NOK",9.6335,
                        "Norwegian krone"));
                currencies.add(new Currency("NZD",1.7026,
                        "New Zealand dollar"));
                currencies.add(new Currency("PHP",63.953,
                        "Philippine peso"));
                currencies.add(new Currency("PLN",4.1909,
                        "Polish zloty"));
                currencies.add(new Currency("RON",4.6618,
                        "Romanian lei"));
                currencies.add(new Currency("RUB",70.298,
                        "Russian ruble"));
                currencies.add(new Currency("SEK",10.168,
                        "Swedish krona"));
                currencies.add(new Currency("SGD",1.6238,
                        "Singapore dollar"));
                currencies.add(new Currency("THB",38.669,
                        "Thai baht"));
                currencies.add(new Currency("TRY",4.6939,
                        "Turkish lira"));
                currencies.add(new Currency("ZAR",14.618,
                        "South African rand"));
                break;
            case "DOP": //Dominican Pesos
                currencies.add(new Currency("USD",0.02034,
                        "United State Dollars"));
                currencies.add(new Currency("EUR",0.0164620378,
                        "Euro"));
                currencies.add(new Currency("MXN",0.382043576,
                        "Mexican peso"));
                break;

            default:
                //Toast.makeText(getApplicationContext(),"Please select a currrency",Toast.LENGTH_SHORT).show();
                break;
        }

        return currencies;
    }
}
