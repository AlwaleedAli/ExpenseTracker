package com.example.expensetracker;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper myDb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDb = new DatabaseHelper(this);

        String dateOpened = Calendar.getInstance().getTime().toString();
        myDb.insertData(dateOpened);

    }

    @Nullable
    @Override
    public String getCallingPackage() {
        return super.getCallingPackage();
    }

    public void startOnClick(View view) {

        Intent myIntent = new Intent(getBaseContext(), list_epx_scr.class);
        startActivity(myIntent);
    }

    public void settingsOnClick(View view) {
        Intent myIntent = new Intent(getBaseContext(), SettingsAct.class);
        startActivity(myIntent);
    }

    public void exitOnClick(View view) {
        finish();
        System.exit(0);
        //update comment(for test only)
    }
}


