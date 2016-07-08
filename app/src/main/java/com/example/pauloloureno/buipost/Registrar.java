package com.example.pauloloureno.buipost;


import android.annotation.TargetApi;
import android.icu.util.ValueIterator;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registrar extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registrar);

        EditText email = (EditText) findViewById(R.id.textEmailTelaPrincipal);
        EditText senha = (EditText) findViewById(R.id.textSenha_Registrar);
        EditText repeat = (EditText) findViewById(R.id.textSenha_Registrar_Repeat);




    }
    public void registarFechar (View view){
        finish();
    }
}
