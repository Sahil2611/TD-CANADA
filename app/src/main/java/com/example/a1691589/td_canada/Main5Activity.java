package com.example.a1691589.td_canada;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main5);
            LinearLayout tv = (LinearLayout) findViewById(R.id.fe);
//            tv.setOnTouchListener(new View.OnTouchListener() {
//                @Override
//                public boolean onTouch(View v, MotionEvent event) {
//                    Intent i = new Intent(getApplication(),Main6Activity.class);
//                    startActivity(i);
//                    return true;
//                }
//            });
            tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("h","f");
                    Intent i = new Intent(getApplication(),Main6Activity.class);
                    startActivity(i);
                }
            });

        }

//        public void mainClick6(View view) {
//            setContentView(R.layout.activity_main6);
//
//        }
    }

