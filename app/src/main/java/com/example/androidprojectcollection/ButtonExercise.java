package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class ButtonExercise extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_exercise);

        btn1 = (Button)findViewById(R.id.btnLActivity);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ButtonExercise.this, LayoutExercise.class);
                startActivity(intent1);
            }
        });

        btn2 = (Button)findViewById(R.id.btnToast);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonExercise.this, "Sheeeesh", Toast.LENGTH_LONG).show();
            }
        });

        btn3 = (Button)findViewById(R.id.btnDisappear);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn3.setVisibility(View.INVISIBLE);
            }
        });

        btn4 = (Button)findViewById(R.id.btnReturn);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        btn5 = (Button)findViewById(R.id.btnChangebuttonbg);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random rand = new Random();

                int rand_int1 = rand.nextInt(5);
                switch(rand_int1){
                    case 0:
                        btn5.setBackgroundColor(Color.YELLOW);
                        break;
                    case 1:
                        btn5.setBackgroundColor(Color.RED);
                        break;
                    case 2:
                        btn5.setBackgroundColor(Color.BLUE);
                        break;
                    case 3:
                        btn5.setBackgroundColor(Color.GREEN);
                        break;
                    case 4:
                        btn5.setBackgroundColor(Color.BLACK);
                        break;

                }
            }
        });
        btn6 = (Button)findViewById(R.id.btnChangeBg);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Random rand = new Random();

                int rand_int1 = rand.nextInt(5);
                switch(rand_int1){
                    case 0:
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                        break;
                    case 1:
                        getWindow().getDecorView().setBackgroundColor(Color.RED);
                        break;
                    case 2:
                        getWindow().getDecorView().setBackgroundColor(Color.BLUE);
                        break;
                    case 3:
                        getWindow().getDecorView().setBackgroundColor(Color.GREEN);
                        break;
                    case 4:
                        getWindow().getDecorView().setBackgroundColor(Color.BLACK);
                        break;

                }
            }
        });
    }
}