package com.example.pauloloureno.buipost;


import android.content.Intent;
//import android.os.Handler;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        //Handler handler = new Handler();
       // handler.postDelayed(this,2000);


    }

   @Override
    public void run() {
        startActivity(new Intent(this, Login.class));
        finish();
    }
}
