package com.facci.sudokupe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class EscogerNivelPE extends AppCompatActivity {

    Button facil, medio, dificil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escoger_nivel_pe);
        facil=(Button)findViewById(R.id.btn_facil);
        medio=(Button)findViewById(R.id.btn_medio);
        dificil=(Button)findViewById(R.id.btn_dificil);

        facil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EscogerNivelPE.this, FacilPE.class);
                startActivity(intent);
            }
        });
        
        medio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(EscogerNivelPE.this, "No disponible", Toast.LENGTH_SHORT).show();
            }
        });
        
        dificil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(EscogerNivelPE.this, "No disponible", Toast.LENGTH_SHORT).show();
            }
        });

    }


}
