package com.facci.sudokupe;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button siguiente;
    String nombre;
    EditText texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = (EditText)findViewById(R.id.et_nombre);
        nombre = texto.getText().toString();
        siguiente = (Button) findViewById(R.id.btn_siguiente);
        siguiente.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                SharedPreferences preferencia = getSharedPreferences("Datos", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferencia.edit();
                editor.putString("nombre", nombre);
                editor.commit();
                Intent intent = new Intent(MainActivity.this, EscogerNivelPE.class);
                startActivity(intent);
            }
        });



    }
}
