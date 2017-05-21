package com.example.a1691589.td_canada;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    void mainClick(View view) {
        //setContentView(R.layout.activity_main2);
        Intent i = new Intent(getApplicationContext(),Main2Activity.class);
        startActivity(i);
    }

    void mainClick1(View view) {
//        setContentView(R.layout.activity_main3);
        Intent i = new Intent(getApplicationContext(),Main3Activity.class);
        startActivity(i);
    }

    void mainClick2(View view) {
        //setContentView(R.layout.activity_main4);
        Intent i = new Intent(getApplicationContext(),Main4Activity.class);
        startActivity(i);
    }

    void mainClick3(View view) {
//        setContentView(R.layout.activity_main7);
    Intent i = new Intent(getApplicationContext(),Main5Activity.class);
        startActivity(i);
    }
}