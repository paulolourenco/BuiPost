package com.example.pauloloureno.buipost;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


/**
 * Created by Paulo Lourenço on 06/07/2016.
 */
public class Proximidades extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.proximidades);
    }

    public void fechar (View view){
        finish();
    }


}
