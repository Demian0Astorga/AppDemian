package com.example.appdemian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    private Button btnEmprendedor, btnComprador;
    //HOLA x2
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnEmprendedor = (Button) findViewById(R.id.btnEmprendedor);
        btnComprador = (Button) findViewById(R.id.btnComprador);

        //Ir a página principal de la App (Donde se muestran los Productos)
        btnEmprendedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this, cuentaNuevaEmprendedor.class);
                startActivity(i);
            }
        });

        //Ir a la Interfaz de Crear Cuneta Nueva
        btnComprador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(MainActivity2.this, CuentaNuevaCliente.class);
                startActivity(i2);
            }
        });
    }
}