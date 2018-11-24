package com.example.li.lll.a24patternproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      new Thread(new Runnable() {
          @Override
          public void run() {

          }
      }).start();


      Runnable runnable =new Runnable() {
          @Override
          public void run() {

          }
      };

      new Thread(runnable).start();

    }



}
