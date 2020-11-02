package com.example.wallpaperviewerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int[] images={R.drawable.list,R.drawable.list1,R.drawable.yourcompanion};
    ImageView image;
    Button next;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next=findViewById(R.id.next);
        image=findViewById(R.id.image);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                count=count%images.length;
                image.setImageResource(images[count]);
            }
        });
    }
}