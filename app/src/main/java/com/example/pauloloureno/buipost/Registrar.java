package com.example.pauloloureno.buipost;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class Registrar extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registrar);


    }
    public void registarFechar (View view){
        finish();
    }
}
