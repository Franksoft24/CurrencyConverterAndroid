package com.project.c.currencyconverterandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.project.c.currencyconverterandroid.data.CurrencyData;
import com.project.c.currencyconverterandroid.model.Currency;
import com.project.c.currencyconverterandroid.adapter.currencyAdapter;

import java.util.ArrayList;
import java.util.List;

public class CurrencyRateListActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_rate_list);

        String currency ="";

        if(getIntent().hasExtra(MainActivity.CurrencySelected)){ //Validate It isn't empty
            currency = getIntent().getStringExtra(MainActivity.CurrencySelected);
        }else{
            Toast.makeText(this,"Result no found",Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this,MainActivity.class));
        }

        //Magic is in progress below this line::

        List<Currency> MyCurrencyList = CurrencyData.selectCurrencies(currency);

        ListView listView = (ListView) findViewById(R.id.MyRateList);
        currencyAdapter currencyAdapter_ = new currencyAdapter(this,MyCurrencyList);
        listView.setAdapter(currencyAdapter_);


    }

}
