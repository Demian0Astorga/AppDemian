package com.example.appdemian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CuentaNuevaApp extends AppCompatActivity {

    private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta_nueva_app);

        btn3 = (Button) findViewById(R.id.btn3);


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(CuentaNuevaApp.this, InicioApp.class);
                startActivity(i3);
            }
        });
    }
}