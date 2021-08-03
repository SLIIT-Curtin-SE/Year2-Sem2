package com.example.tutorial1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnCalculate = findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                calculateAnswer();
            }
        });

    }

    private void calculateAnswer(){
        EditText edtInput = findViewById(R.id.edtInput);
        String value = edtInput.getText().toString();
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        RadioButton selectedButton = findViewById(radioGroup.getCheckedRadioButtonId());
        TextView txtOutput = findViewById(R.id.txtOutput);
        Calculations calculations = new Calculations();


        if(value.isEmpty()){
            Toast.makeText(this,"Please add a value",Toast.LENGTH_SHORT).show();
        }else{

            if(selectedButton.getText().toString().equals("Celsius")){
                float temp = calculations.convertCelciusToFahrenheit(Float.valueOf(value));
                txtOutput.setText(String.valueOf(temp));
            }
            else{
                float temp = calculations.convertFahrenheitToCelcius(Float.valueOf(value));
                txtOutput.setText(String.valueOf(temp));
            }
        }
    }
}