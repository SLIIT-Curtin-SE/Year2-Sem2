package com.example.tutorial01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity<message> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
    }

    Intent intent = getIntent();
    String message = intent.getStringExtra(MainActivity.Extra_MESSAGE);
    TextView textView = findViewById(R.id.txt2);

}