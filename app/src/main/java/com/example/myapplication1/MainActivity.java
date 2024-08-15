package com.example.myapplication1;//package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

//this is the main activity
public class MainActivity extends AppCompatActivity {
    TextView lblCost, lblQualityOfService, lblTotalCost;
    EditText txtCost;
    RadioButton rdbtnGood, rdbtnVeryGood, rdbtnExcellent;
    Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblCost = (TextView) findViewById(R.id.lblCost);
        lblQualityOfService = (TextView)findViewById(R.id.lblQualityOfService);
        lblTotalCost = (TextView) findViewById(R.id.lblTotalCost);

        txtCost = (EditText) findViewById(R.id.txtCost);
        rdbtnGood = (RadioButton) findViewById(R.id.rdbtnGood);
        rdbtnVeryGood = (RadioButton) findViewById(R.id.rdbtnVeryGood);
        rdbtnExcellent = (RadioButton) findViewById(R.id.rdbtnExcellent);

        btnCalculate = (Button) findViewById(R.id.btnCalculate);

    }
    public void Calculate (android.view.View button){
        int cost = Integer.valueOf(txtCost.getText().toString());

        if(rdbtnGood.isChecked()){
            int result = cost + 5;
            lblTotalCost.setText("Total cost: " + String.valueOf(result));
        }
        else if(rdbtnVeryGood.isChecked()){
            int result = cost + 10;
            lblTotalCost.setText("Total cost: " + String.valueOf(result));
        }
        else if(rdbtnExcellent.isChecked()){
            int result = cost + 20;
            lblTotalCost.setText("Total cost: " + String.valueOf(result));
        }

    }
}