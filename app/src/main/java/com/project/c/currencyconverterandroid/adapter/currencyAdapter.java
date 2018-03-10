package com.project.c.currencyconverterandroid.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.project.c.currencyconverterandroid.R;
import com.project.c.currencyconverterandroid.model.Currency;

import java.util.List;

/**
 * Created by frank on 3/10/2018.
 */

public class currencyAdapter extends ArrayAdapter<Currency> {

    public currencyAdapter(Context context, List<Currency> currencies){
        super(context,0,currencies);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Currency currency = getItem(position);

        View view = LayoutInflater.from(getContext()).inflate(
                R.layout.mycurrency,parent,false);
        TextView currencyName = view.findViewById(R.id.MyCurrencyName);
        TextView currencyCode = view.findViewById(R.id.MyCurrencyCOD);
        TextView currencyValue = view.findViewById(R.id.MyCurrencyValue);

        currencyName.setText(currency.currencyName);
        currencyCode.setText(currency.currencyCOD);
        String parse = Double.toString(currency.value); //Transform double into String
        currencyValue.setText(parse);

        return view; //super.getView(position, convertView, parent);
    }
}
