package com.example.pauloloureno.buipost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Login extends AppCompatActivity {

    EditText email;
    EditText senha;
    Button botaoGO_TelaPrincipal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        email = (EditText) findViewById(R.id.textEmailTelaRegistrar);
        senha = (EditText) findViewById(R.id.textSenhaTelaPrincipal);
        botaoGO_TelaPrincipal = (Button) findViewById(R.id.botao_go);

    }



    public void usuarioCadastrar ( View view )
    {
        Intent intent =  new Intent(this, Registrar.class);
        startActivity (intent);
    }
    public void loginEfetuar (View view) {

       // if(email.getText().toString().equals("") && senha.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(),"Logado", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);



        //}
        //else{
          //  Toast.makeText(getApplicationContext(),"Usuário ou senha incorretos.", Toast.LENGTH_SHORT).show();
        //}
    }




}