package com.project.c.currencyconverterandroid.model;

/**
 * Created by frank on 3/6/2018.
 */

public class Currency {
    public String currencyCOD;
    public String currencyName;
    public double value;

    public Currency(String currencyCOD, double value, String currencyName) {
        this.currencyCOD = currencyCOD;
        this.value = value;
        this.currencyName = currencyName;
    }
}
