package com.uisrael.claudiaacuna_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Encuesta extends AppCompatActivity {
    TextView recibo;
    EditText nombre;
    RadioButton rb1,rb2;
    CheckBox chk1,chk2,chk3;
    Bundle datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);
        recibo=findViewById(R.id.tvNombre);
        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);

        chk1=findViewById(R.id.chk1);
        chk2=findViewById(R.id.chk2);
        chk3=findViewById(R.id.chk3);
        nombre=findViewById(R.id.etNombre);

        datos=getIntent().getExtras();
        String datosObtenidos=datos.getString("datoEnviado2");
        recibo.setText("Bienvenido: "+datosObtenidos);
    }

    public void Resumen (View v) {
        String user=recibo.getText().toString();

        Intent abrir_resumen1 = new Intent(Encuesta.this, Resumen.class);
        //abrir_resumen1.putExtra("datoEnviado3", user);
        startActivity(abrir_resumen1);
        if (chk1.isChecked()) {

            Intent abrir_resumen = new Intent(Encuesta.this, Resumen.class);
            abrir_resumen.putExtra("datoEnviado_chk1", chk1.getText().toString());
            //Toast.makeText(getApplicationContext(), rb1.getText(), Toast.LENGTH_LONG).show();
            startActivity(abrir_resumen);
        }
        if (chk2.isChecked()) {

            Intent abrir_resumen = new Intent(Encuesta.this, Resumen.class);
            abrir_resumen.putExtra("datoEnviado_chk2", chk2.getText().toString());
            //Toast.makeText(getApplicationContext(), rb1.getText(), Toast.LENGTH_LONG).show();
            startActivity(abrir_resumen);
        }
        if (chk2.isChecked()) {

            Intent abrir_resumen = new Intent(Encuesta.this, Resumen.class);
            abrir_resumen.putExtra("datoEnviado_chk3", chk2.getText().toString());
            //Toast.makeText(getApplicationContext(), rb1.getText(), Toast.LENGTH_LONG).show();
            startActivity(abrir_resumen);
        }
        if (rb1.isChecked()) {

            Intent abrir_resumen = new Intent(Encuesta.this, Resumen.class);
            abrir_resumen.putExtra("datoEnviado2", rb1.getText().toString());
            //Toast.makeText(getApplicationContext(), rb1.getText(), Toast.LENGTH_LONG).show();
            startActivity(abrir_resumen);
        }
        if (rb2.isChecked()) {

            Intent abrir_resumen = new Intent(Encuesta.this, Resumen.class);
            abrir_resumen.putExtra("datoEnviado2", rb1.getText().toString());
            //Toast.makeText(getApplicationContext(), rb1.getText(), Toast.LENGTH_LONG).show();
            startActivity(abrir_resumen);
        }
    }
}
