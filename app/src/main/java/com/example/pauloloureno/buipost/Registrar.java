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

        final Button botaoFechar = (Button) findViewById(R.id.botao_fechar);
        final EditText email = (EditText) findViewById(R.id.textEmailTelaPrincipal);
        final EditText senha = (EditText) findViewById(R.id.textSenha_Registrar);
        final EditText repeat = (EditText) findViewById(R.id.textSenha_Registrar_Repeat);

       /* botaoFechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });*/



        email.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View view) {
                    email.setText("");
            }
        });
        senha.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View view) {
                senha.setInputType(1);
                senha.setText("");
            }
        });

        repeat.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View view) {
                repeat.setText("");
            }
        });


    }
    public void registarFechar (View view){
        finish();
    }
}
