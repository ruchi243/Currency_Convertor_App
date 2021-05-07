package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public <SelectText> void convertCurrency(View view){
        Log.i("info","Button pressed");
        EditText editText = (EditText) findViewById(R.id.rupees);
        String rupee = editText.getText().toString();
        double r = Double.parseDouble(rupee);
        double dollars = r*0.014;
        String answer = Double.toString(dollars);
        Log.i("info",answer);
        Toast.makeText(this,"The amount in dollars is "+answer,Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

