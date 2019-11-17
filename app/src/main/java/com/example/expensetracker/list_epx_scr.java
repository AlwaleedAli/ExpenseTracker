package com.example.expensetracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.io.File;

public class list_epx_scr<Public> extends AppCompatActivity {

    private android.graphics.Bitmap picture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_epx_scr);


            ImageButton ib = (ImageButton) findViewById(R.id.imageButton2);
                    ib.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            takePhtoto();
                        }

                        });


    }
   public void takePhtoto(){
            Intent camera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(camera, 55);
        }



    protected void  onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 55) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            ImageView imgv1 = findViewById(R.id.imgv1);
            imgv1.setImageBitmap(photo);
        }}



}
