package com.example.expensetracker;

import  androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
     //comment to test the pul;l
    int qwerty=1;

    @Nullable
    @Override
    public String getCallingPackage() {
        return super.getCallingPackage();
    }
}


