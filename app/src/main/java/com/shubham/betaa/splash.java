package com.shubham.betaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splash extends AppCompatActivity {
    ImageView log;
    TextView mst;
    Animation top,bottom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView(R.layout.activity_splash);

        log = (ImageView)findViewById(R.id.imgspl);
        mst = (TextView) findViewById(R.id.splname);


        
        mst.setText("Under Development Stage...");
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity( new Intent(getApplicationContext(),MainActivity.class));
            }
        }, 5000);

    }
}
