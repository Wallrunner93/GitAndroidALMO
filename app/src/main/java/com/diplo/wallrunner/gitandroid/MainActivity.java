package com.diplo.wallrunner.gitandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnPresiona, btnHazlo;
    private TextView tvMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPresiona = findViewById(R.id.button);
        btnHazlo = findViewById(R.id.button2);
        tvMensaje = findViewById(R.id.textView);

        btnPresiona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMensaje.setText("Hola GitHub!!");
                Toast.makeText(MainActivity.this,"Se cambió el texto del TextView",Toast.LENGTH_LONG).show();
            }
        });

        btnHazlo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMensaje.setText("Hola Diplomado Android!!");
                
            }
        });
    }
}
