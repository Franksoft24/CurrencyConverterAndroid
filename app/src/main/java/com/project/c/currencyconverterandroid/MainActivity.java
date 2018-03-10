package com.project.c.currencyconverterandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import com.project.c.currencyconverterandroid.data.CurrencyData;
import com.project.c.currencyconverterandroid.model.Currency;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private List<Currency> currencies;
    //private final List<Currency> forseCurrencies;
    public  static String Result = "Result";
    public  static String CurrencySelected = "CurrencySelected";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.ConvertBTN).setOnClickListener(this);

        List<String> BaseCurrencies = new ArrayList<>();

        BaseCurrencies.add(getString(R.string.DOP));
        BaseCurrencies.add(getString(R.string.USD));
        BaseCurrencies.add(getString(R.string.EUR));

        //Filling up From Spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_item, BaseCurrencies);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner = (Spinner) findViewById(R.id.spinnerFrom);
        spinner.setAdapter(adapter);

        final List<Currency> currencies_;

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Spinner spinner = (Spinner)findViewById(R.id.spinnerFrom);
                Spinner spinnerTo = (Spinner) findViewById(R.id.spinnerTo);
                String getUserSelection = spinner.getSelectedItem().toString();
                int getSpinnerPosition = spinner.getSelectedItemPosition();
                List<String> ReadObject = new ArrayList<>();

                EditText editText = (EditText) findViewById(R.id.FromET);

                //HardCoding to convert selected String on CurrencyCOD
                String currencySelected;
                if (getSpinnerPosition == 0){
                    currencySelected = "DOP";
                }else if(getSpinnerPosition == 1){
                    currencySelected = "USD";
                }else{
                    currencySelected = "EUR";
                }

                //Lets magic happens
                List<Currency> spinnerArray;
                spinnerArray = CurrencyData.selectCurrencies(currencySelected);
                currencies = spinnerArray;

                //this.currencies
                for(Currency currencies:spinnerArray){
                    ReadObject.add(currencies.currencyName);
                }

                //Filling up to spinner
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                        MainActivity.this,
                        android.R.layout.simple_spinner_item, ReadObject);

                arrayAdapter.setDropDownViewResource(android.R.layout
                        .simple_spinner_dropdown_item);
                spinnerTo.setAdapter(arrayAdapter);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(getApplicationContext(),"Please Select a currency",
                        Toast.LENGTH_SHORT).show();
            }
        });

        spinner.setSelection(0);
        findViewById(R.id.CurrencyRatesButton).setOnClickListener((v->{
            startActivity(new Intent(this,CurrencyRateListActivity.class));
        }));
        findViewById(R.id.CurrencyRatesButton).setOnClickListener((v->{

            Spinner spinnerFrom = (Spinner)findViewById(R.id.spinnerFrom);
            Intent intent = new Intent(this,CurrencyRateListActivity.class);

            //Getting selected index values
            int Spinner1Position = spinner.getSelectedItemPosition();
            String SelectedCurrency;
            if (Spinner1Position == 0){
                SelectedCurrency = "DOP";
            }else if(Spinner1Position == 1){
                SelectedCurrency = "USD";
            }else{
                SelectedCurrency = "EUR";
            }
            intent.putExtra("CurrencySelected",SelectedCurrency);
            startActivity(intent);

        }));
    }

    @Override
    public void onClick(View view) {
        //Here is where things happen
        EditText editText = (EditText)findViewById(R.id.FromET); //User input
        //Here I'll create Spinner object to select the correct Currency
        Spinner spinner = (Spinner)findViewById(R.id.spinnerTo);
        //Getting value inserted by the user
        String getValue = editText.getText().toString().trim();

        double toValue = 0.00; //read on line 137

        for (Currency currencies:this.currencies){//Select the To currency selected by the user
            if (currencies.currencyName == spinner.getSelectedItem().toString()){
                toValue = currencies.value; //I'm assigning the value into this double var
            }
        }
        double result = 0.00;

        if(!getValue.isEmpty()){ //Verify if the user send me an empty field

            //Parse the value into a double var
            double Amount = Double.parseDouble(editText.getText().toString().trim());
            result = Calculate(Amount,toValue); //running my beautiful function *.*

            DecimalFormat decimalFormat = new DecimalFormat("#,##0.0#");//Formatting output
            //decimalFormat.setRoundingMode(RoundingMode.HALF_UP); //Rounding Up
            String answer = decimalFormat.format(result);
            Intent intent = new Intent(this,ResultActivity.class);
            intent.putExtra("Result",answer);
            startActivity(intent);

        }else
        {//msg
            Toast.makeText(this,getString(R.string.EmptyField),Toast.LENGTH_SHORT).show();
        }
    }

    private double Calculate(double From, double To){
        double result = 0.00;
        result = From*To;
        return result;
    }

}