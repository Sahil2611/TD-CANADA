package com.example.a1691589.td_canada;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;


public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    void home(View view) {
        setContentView(R.layout.activity_main);
    }
}