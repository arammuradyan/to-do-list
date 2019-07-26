package com.example.todolist10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SplashActivity extends AppCompatActivity {
Button start_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
   start_btn=findViewById(R.id.start_btn);
   start_btn.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           Intent startIntent=new Intent(SplashActivity.this,MainActivity.class);
           startActivity(startIntent);
       }
   });
    }
}
