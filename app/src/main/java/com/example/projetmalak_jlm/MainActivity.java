package com.example.projetmalak_jlm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

    }
    public void fct_btn1(View view){
        Intent activity = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(activity);
    }
    public void fct_btn2(View view){
        Intent activity = new Intent(MainActivity.this, MainActivity4.class);
        startActivity(activity);
    }
    public void fct_btn3(View view){
        Intent activity = new Intent(MainActivity.this, MainActivity5.class);
        startActivity(activity);
    }
    public void fct_btn4(View view){
        Intent activity = new Intent(MainActivity.this, MainActivity6.class);
        startActivity(activity);
    }
}