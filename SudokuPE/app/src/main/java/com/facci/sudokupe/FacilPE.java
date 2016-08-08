package com.facci.sudokupe;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FacilPE extends AppCompatActivity {
    TextView resultado;
    TextView jugador;
    EditText cuadro1, cuadro2, cuadro3, cuadro5, cuadro8, cuadro9, cuadro10, cuadro11, cuadro12, cuadro14, cuadro15, cuadro16;
    String C1, C2, C3, C5, C8, C9, C10, C11, C12, C14, C15, C16;
    String c1, c2, c3, c5, c8, c9, c10, c11, c12, c14, c15, c16;
    String nombre;
    Button comprobar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facil_pe);

        SharedPreferences preferencia = getSharedPreferences("Datos", Context.MODE_PRIVATE);
        nombre = preferencia.getString("nombre", "");
        jugador = (TextView)findViewById(R.id.txt_nombreJugador);
        c1="2";c2="3";c3="1";c5="4";c8="3"; c9="1";c10="4";c11="3";c12="2";c14="2";c15="4";c16="1";
        cuadro1 = (EditText)findViewById(R.id.numero1);
        cuadro2 = (EditText)findViewById(R.id.numero2);
        cuadro3 = (EditText)findViewById(R.id.numero3);
        cuadro5 = (EditText)findViewById(R.id.numero5);
        cuadro8 = (EditText)findViewById(R.id.numero8);
        cuadro9 = (EditText)findViewById(R.id.numero9);
        cuadro10 = (EditText)findViewById(R.id.numero10);
        cuadro11 = (EditText)findViewById(R.id.numero11);
        cuadro12 = (EditText)findViewById(R.id.numero12);
        cuadro14 = (EditText)findViewById(R.id.numero14);
        cuadro15 = (EditText)findViewById(R.id.numero15);
        cuadro16 = (EditText)findViewById(R.id.numero16);
        C1 = String.valueOf(cuadro1.getText());
        C2 = String.valueOf(cuadro2.getText());
        C3 = String.valueOf(cuadro3.getText());
        C5 = String.valueOf(cuadro5.getText());
        C8 = String.valueOf(cuadro8.getText());
        C9 = String.valueOf(cuadro9.getText());
        C10 = String.valueOf(cuadro10.getText());
        C11 = String.valueOf(cuadro11.getText());
        C12 = String.valueOf(cuadro12.getText());
        C14 = String.valueOf(cuadro14.getText());
        C15 = String.valueOf(cuadro15.getText());
        C16 = String.valueOf(cuadro16.getText());

        resultado = (TextView)findViewById(R.id.txt_resultado) ;
        comprobar = (Button)findViewById(R.id.btn_comprobar);

        comprobar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                C1 = String.valueOf(cuadro1.getText());
                C2 = String.valueOf(cuadro2.getText());
                C3 = String.valueOf(cuadro3.getText());
                C5 = String.valueOf(cuadro5.getText());
                C8 = String.valueOf(cuadro8.getText());
                C9 = String.valueOf(cuadro9.getText());
                C10 = String.valueOf(cuadro10.getText());
                C11 = String.valueOf(cuadro11.getText());
                C12 = String.valueOf(cuadro12.getText());
                C14 = String.valueOf(cuadro14.getText());
                C15 = String.valueOf(cuadro15.getText());
                C16 = String.valueOf(cuadro16.getText());

                if ((c1.equals(C1)) && (c2.equals(C2)) && (c3.equals(C3)) && (c5.equals(C5)) && (c8.equals(C8))
                        && (c9.equals(C9)) && (c10.equals(C10)) && (c11.equals(C11)) && (c12.equals(C12)) &&
                        (c14.equals(C14)) && (c15.equals(C15)) && (c16.equals(C16))){
                    resultado.setText("Has ganado");
                }
                else{
                    resultado.setText("Sigue intentando");
                }

            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        jugador.setText(nombre);
    }
}
