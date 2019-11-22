package com.example.expensetracker;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SettingsAct extends AppCompatActivity {
    Button info;
    DatabaseHelper myDb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        myDb= new DatabaseHelper(this);
        info=(Button)findViewById(R.id.btnInfo);
        viewAll();
    }
    public void viewAll(){
        info.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Cursor result=myDb.getAllData();
                        if(result.getCount()==0){
                        return;
                        }
                        StringBuffer buf = new StringBuffer();
                        while(result.moveToNext()){
                            buf.append("Time :"+result.getString(1)+"\n\n");
                        }
                       showAll(buf.toString());
                    }
                }
        );
    }
public void showAll(String buf){
    AlertDialog.Builder builder = new AlertDialog.Builder(this);
    builder.setCancelable(true);
    builder.setTitle("Times the app is opned");
    builder.setMessage(buf.toString());
    builder.show();
}

}
