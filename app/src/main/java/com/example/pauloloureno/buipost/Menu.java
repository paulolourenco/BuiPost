package com.example.pauloloureno.buipost;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


/**
 * Created by Paulo Lourenço on 06/07/2016.
 */
public class Menu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        Button proximidades = (Button) findViewById(R.id.botao_proximidades);

        /*proximidades.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(Menu.this, Proximidades.class);
                startActivity ( intent );
            }
        });*/


    }

    public void proximidades (View view){
        Intent intent =  new Intent(Menu.this, Proximidades.class);
        startActivity ( intent );
    }
    public void postAmigos (View view){
        Intent intent =  new Intent(Menu.this, SplashActivity.class);
        startActivity ( intent );
    }

}
