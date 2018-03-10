package com.project.c.currencyconverterandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView textView = (TextView) findViewById(R.id.ResultTV);

        if(getIntent().hasExtra(MainActivity.Result)){ //Validate It isn't empty
            String result = getIntent().getStringExtra(MainActivity.Result);
            textView.setText(result);
        }else{
            Toast.makeText(this,"Result no found",Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this,MainActivity.class));
        }

        findViewById(R.id.NExchangeBTN).setOnClickListener((v->{
            startActivity(new Intent(this,MainActivity.class));
        }));
    }
}
