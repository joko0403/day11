package com.example.day11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class BerandaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);
        ImageButton imb1 = findViewById(R.id.imb1);
        ImageButton imb2 = findViewById(R.id.imb2);
        ImageButton imb3 = findViewById(R.id.imb3);
        ImageButton imb4 = findViewById(R.id.imb4);

        imb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BerandaActivity.this, BerandaActivity.class);
                startActivity(intent);
            }
        });

        imb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BerandaActivity.this, SejarahActivity.class);
                startActivity(intent);
            }
        });

        imb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BerandaActivity.this, BayarActivity.class);
                startActivity(intent);
            }
        });

        imb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BerandaActivity.this, SayaActivity.class);
                startActivity(intent);
            }
        });
    }
}