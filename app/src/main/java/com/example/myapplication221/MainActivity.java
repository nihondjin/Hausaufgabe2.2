package com.example.myapplication221;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btn_tim);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        textView = findViewById(R.id.txt_tim);
        if (getIntent().hasExtra("Текст")){
            textView.setText(getIntent().getStringExtra("Текст"));
        }
    }

}