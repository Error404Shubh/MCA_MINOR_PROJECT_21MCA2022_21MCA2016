package com.shubham.betaa;

import static com.google.android.material.internal.ContextUtils.getActivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class about extends AppCompatActivity {
   TextView custom;
   TextView cus;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        custom = (TextView)findViewById(R.id.messagecus);
        cus = (TextView) findViewById(R.id.custitle);
    }

    public void showmes(View view){
    final AlertDialog.Builder alert = new AlertDialog.Builder(about.this);
    View mview = getLayoutInflater().inflate(R.layout.activity_about,null);
    alert.setView(mview);
    final AlertDialog alertDialog = alert.create();
    alertDialog.setCanceledOnTouchOutside(true);
    }
}


