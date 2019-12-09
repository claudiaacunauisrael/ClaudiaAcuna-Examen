package com.uisrael.claudiaacuna_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Registro extends AppCompatActivity {
    TextView recibo;
    EditText nombre;
    Bundle datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        recibo=findViewById(R.id.tvUsuario);
        nombre=findViewById(R.id.etNombre);
        datos=getIntent().getExtras();
        String datosObtenidos=datos.getString("datoEnviado");
        recibo.setText("Conectado: "+datosObtenidos);
    }
    public void Registro(View v){
        String nombre2=nombre.getText().toString();

        Intent abrir_encuesta=new Intent(Registro.this,Encuesta.class);
        abrir_encuesta.putExtra("datoEnviado2",nombre2);
        //Toast.makeText(getApplicationContext(),usuario.getText(),Toast.LENGTH_LONG).show();
        startActivity(abrir_encuesta);

    }
}

