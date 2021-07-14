package com.example.labsheet1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSubmit(View view){
        TextView txtRegistrationNumber = findViewById(R.id.textView1);
        TextView txtName = findViewById(R.id.textView2);
        TextView txtBatchName = findViewById(R.id.textView5);

        EditText editTextRegistrationNumber = findViewById(R.id.editText1);
        EditText editTextName = findViewById(R.id.editText2);
        EditText editTextBatchName = findViewById(R.id.editText3);

        txtRegistrationNumber.setText("Registration Number :"+editTextRegistrationNumber.getText().toString());
        txtName.setText("Name :"+editTextName.getText().toString());
        txtBatchName.setText("Batch Name :"+editTextBatchName.getText().toString());



    }
}