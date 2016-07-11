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

        email = (EditText) findViewById(R.id.textEmailTelaPrincipal);
        senha = (EditText) findViewById(R.id.textSenhaTelaPrincipal);
        botaoGO_TelaPrincipal = (Button) findViewById(R.id.botao_go);


        /*email.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View view) {
                email.setText("");

            }
        });
        senha.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View view) {
                senha.setText("");
            }
        });*/
    }



    public void usuarioCadastrar ( View view )
    {
        Intent intent =  new Intent(this, Registrar.class);
        startActivity (intent);
    }
    public void loginEfetuar (View view) {

        if(email.getText().toString().equals("e-mail") && senha.getText().toString().equals("e-mail")){
            Toast.makeText(getApplicationContext(),"Logado", Toast.LENGTH_SHORT).show();
            //startActivity(new Intent(this, Menu.class));
            //setContentView(R.layout.menu);
             // ta dando pau iniciar activity desta forma
            Intent intent = new Intent(this, TabFragment2.class);
            startActivity(intent);



        }
        else{
            Toast.makeText(getApplicationContext(),"Usuário ou senha incorretos.", Toast.LENGTH_SHORT).show();

        }
    }




}