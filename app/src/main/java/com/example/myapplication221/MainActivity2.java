package com.example.myapplication221;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private EditText whyText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        whyText = findViewById(R.id.et_tim);
        button = findViewById(R.id.btn_send);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this,whyText.getText().toString(),Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                intent.putExtra("Текст", whyText.getText().toString());
                startActivity(intent);
            }
        });
    }
}