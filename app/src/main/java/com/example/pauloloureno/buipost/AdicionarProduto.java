package com.example.pauloloureno.buipost;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class AdicionarProduto extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_produto);


    }
    public void adicionarFechar (View view){
        finish();
    }
}