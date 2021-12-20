package com.example.lesson3android1applicat;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.util.Random;

public class GameActivity extends AppCompatActivity {
    ImageView imImage;
    Button btnImage1, btnImage2, btnImage3;
    Button btnOne, btnTwo, btnThree;
    boolean Java, JavaScript, Python;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        initialization();
        listeners();
        initView();


    }

    private void initialization() {
        imImage = findViewById(R.id.im_image);
        btnImage1 = findViewById(R.id.btn_image1);
        btnImage2 = findViewById(R.id.btn_image2);
        btnImage3 = findViewById(R.id.btn_image3);
        btnOne = findViewById(R.id.btn_one);
        btnTwo = findViewById(R.id.btn_two);
        btnThree = findViewById(R.id.btn_three);
    }

    public void changeImage(View view) {
        switch (view.getId()) {
            case R.id.btn_image1:
                imImage.setImageResource(R.drawable.python);
                Python = true;
                Java = false;
                JavaScript = false;
                break;
            case R.id.btn_image2:
                imImage.setImageResource(R.drawable.java);
                Java = true;
                Python = false;
                JavaScript = false;
                break;
            case R.id.btn_image3:
                imImage.setImageResource(R.drawable.javascript);
                JavaScript = true;
                Python = false;
                Java = false;
                break;
        }


    }

    private void listeners() {
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.BounceIn)
                        .duration(700)
                        .repeat(5)
                        .playOn(findViewById(R.id.btn_one));
                if (Java) {
                    Toast.makeText(GameActivity.this, " Правельно", Toast.LENGTH_SHORT).show();

                } else
                    Toast.makeText(GameActivity.this, "Не Правельно", Toast.LENGTH_SHORT).show();


            }

        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.BounceIn)
                        .duration(700)
                        .repeat(5)
                        .playOn(findViewById(R.id.btn_two));
                if (JavaScript) {
                    Toast.makeText(GameActivity.this, "  Правельно", Toast.LENGTH_SHORT).show();

                } else
                    Toast.makeText(GameActivity.this, "Не Правельно", Toast.LENGTH_SHORT).show();
                return;


            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.BounceIn)
                        .duration(100)
                        .repeat(5)
                        .playOn(findViewById(R.id.btn_three));

                if (Python) {
                    Toast.makeText(GameActivity.this, " Правельно", Toast.LENGTH_SHORT).show();

                } else
                    Toast.makeText(GameActivity.this, "Не Правельно", Toast.LENGTH_SHORT).show();
                return;


            }
        });


    }

    private void initView() {
        imImage = findViewById(R.id.im_image);
        btnOne = findViewById(R.id.btn_one);
        btnTwo = findViewById(R.id.btn_two);
        btnThree = findViewById(R.id.btn_three);

    }
}