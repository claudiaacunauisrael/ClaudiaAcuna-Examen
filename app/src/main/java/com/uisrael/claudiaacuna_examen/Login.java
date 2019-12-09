package com.uisrael.claudiaacuna_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText usuario,clave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usuario=findViewById(R.id.etUsuario);
        clave=findViewById(R.id.etClave);
    }
    public void login(View v){
        String user=usuario.getText().toString();
        String pass=clave.getText().toString();
        if(user.equals("estudiante2019")&&pass.equals("uisrael2019")){

            Intent abrir_registro=new Intent(Login.this,Registro.class);
            abrir_registro.putExtra("datoEnviado",user);
            Toast.makeText(getApplicationContext(),usuario.getText(),Toast.LENGTH_LONG).show();
            startActivity(abrir_registro);
        }

    }
}
