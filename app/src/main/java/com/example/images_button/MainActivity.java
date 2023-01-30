package com.example.images_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView[] iv = new ImageView[3];
    int[] front_images = new int[3];
    ImageButton[] ib = new ImageButton[3];
    int[] background_images = new int[3];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //images_view:
        iv[0] = findViewById(R.id.iv1);
        iv[1] = findViewById(R.id.iv1);
        iv[2] = findViewById(R.id.iv1);

        front_images[0] = R.drawable.elephant;
        front_images[1] = R.drawable.giraffe;
        front_images[2] = R.drawable.zebra;

        //images_button:
        ib[0] = findViewById(R.id.ib1);
        ib[1] = findViewById(R.id.ib1);
        ib[2] = findViewById(R.id.ib1);

        background_images[0] = R.drawable.one;
        background_images[1] = R.drawable.two;
        background_images[2] = R.drawable.three;
    }

    public void Button(View view) {

        int max, min;
        max = 3;
        min = 1;
        int number =(int)Math.floor(Math.random() * (max - min + 1) + min);
        if (number == 1){
            iv[0].setImageResource(front_images[0]);
            ib[0].setBackgroundResource(background_images[0]);
            }

        else if(number == 2){
            iv[1].setImageResource(front_images[1]);
            ib[1].setBackgroundResource(background_images[1]);
        }
        else{
            iv[2].setImageResource(front_images[2]);
            ib[2].setBackgroundResource(background_images[2]);
        }
    }
}