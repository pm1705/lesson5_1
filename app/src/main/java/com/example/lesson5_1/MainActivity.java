package com.example.lesson5_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton ib;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ib = (ImageButton)findViewById(R.id.ib);
        iv =(ImageView) findViewById(R.id.iv);
    }

    public void clicked(View view) {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(3)+1;
        if (rand_int1==1){
            iv.setImageResource(R.drawable.aice);
            ib.setImageResource(R.drawable.photo1);
        }
        if (rand_int1==2){
            iv.setImageResource(R.drawable.phorest);
            ib.setImageResource(R.drawable.photo2);
        }
        if (rand_int1==3){
            iv.setImageResource(R.drawable.pupple);
            ib.setImageResource(R.drawable.photo3);
        }
    }
}