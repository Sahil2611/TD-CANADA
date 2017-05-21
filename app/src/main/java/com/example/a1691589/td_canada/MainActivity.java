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
        setContentView(R.layout.activity_main2);
    }

    void mainClick1(View view) {
        setContentView(R.layout.activity_main3);

    }

    void mainClick2(View view) {
        setContentView(R.layout.activity_main4);

    }

    void mainClick3(View view) {
        setContentView(R.layout.activity_main5);

    }
}