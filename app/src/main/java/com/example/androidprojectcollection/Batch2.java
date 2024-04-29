package com.example.androidprojectcollection;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Batch2 extends AppCompatActivity {
    boolean isFinished = false;
    RelativeLayout relativeLayout;
    Button btncell1;
    Button btncell2;
    Button btncell3;
    Button btncell4;
    Button btncell5;
    Button btncell6;
    Button btncell7;
    Button btncell8;
    Button btncell9;
    Button btncell10;
    Button btnBack;

    int []array = new int[9];
    int counter1 = 1;
    int counter2 = 1;
    int counter3 = 1;
    int counter4 = 1;
    int counter5 = 1;
    int counter6 = 1;
    int counter7 = 1;
    int counter8 = 1;
    int counter9 = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batch2);




        btncell1 = findViewById(R.id.btnwan);

        btncell1.setOnClickListener(view -> {
            if(counter1>3){
                counter1=1;
            }else
                counter1++;

            if(counter2>3){
                counter2=1;
            }else
                counter2++;

            if(counter4>3){
                counter4=1;
            }else
                counter4++;

            if(counter1==1){
                btncell1.setBackgroundColor(Color.RED);
            } else if (counter1==2) {
                btncell1.setBackgroundColor(Color.BLUE);
            }else if (counter1==3){
                btncell1.setBackgroundColor(Color.GREEN);
            }

            if(counter2==1){
                btncell2.setBackgroundColor(Color.RED);
            } else if (counter2==2) {
                btncell2.setBackgroundColor(Color.BLUE);
            }else if (counter2==3){
                btncell2.setBackgroundColor(Color.GREEN);
            }

            if(counter4==1){
                btncell4.setBackgroundColor(Color.RED);
            } else if (counter4==2) {
                btncell4.setBackgroundColor(Color.BLUE);
            }else if (counter4==3){
                btncell4.setBackgroundColor(Color.GREEN);
            }
        });

        btncell2 = findViewById(R.id.btntwa);
        btncell2.setOnClickListener(view -> {
            if(counter1>3){
                counter1=1;
            }else
                counter1++;

            if(counter2>3){
                counter2=1;
            }else
                counter2++;

            if(counter3>3){
                counter3=1;
            }else
                counter3++;

            if(counter5>3){
                counter5=1;
            }else
                counter5++;

            if(counter1==1){
                btncell1.setBackgroundColor(Color.RED);
            } else if (counter1==2) {
                btncell1.setBackgroundColor(Color.BLUE);
            }else if (counter1==3){
                btncell1.setBackgroundColor(Color.GREEN);
            }

            if(counter2==1){
                btncell2.setBackgroundColor(Color.RED);
            } else if (counter2==2) {
                btncell2.setBackgroundColor(Color.BLUE);
            }else if (counter2==3){
                btncell2.setBackgroundColor(Color.GREEN);
            }

            if(counter3==1){
                btncell3.setBackgroundColor(Color.RED);
            } else if (counter3==2) {
                btncell3.setBackgroundColor(Color.BLUE);
            }else if (counter3==3){
                btncell3.setBackgroundColor(Color.GREEN);
            }

            if(counter5==1){
                btncell5.setBackgroundColor(Color.RED);
            } else if (counter5==2) {
                btncell5.setBackgroundColor(Color.BLUE);
            }else if (counter5==3){
                btncell5.setBackgroundColor(Color.GREEN);
            }

//            Random rand = new Random();
//            int random = rand.nextInt(3);
//            if(random == 1){
//                btncell1.setBackgroundColor(Color.RED);
//                btncell2.setBackgroundColor(Color.RED);
//                btncell3.setBackgroundColor(Color.RED);
//                btncell5.setBackgroundColor(Color.RED);
//            } else if (random==2) {
//                btncell1.setBackgroundColor(Color.GREEN);
//                btncell2.setBackgroundColor(Color.GREEN);
//                btncell3.setBackgroundColor(Color.GREEN);
//                btncell5.setBackgroundColor(Color.GREEN);
//            }else{
//                btncell1.setBackgroundColor(Color.BLUE);
//                btncell2.setBackgroundColor(Color.BLUE);
//                btncell3.setBackgroundColor(Color.BLUE);
//                btncell5.setBackgroundColor(Color.BLUE);
//            }
        });


        btncell3 = findViewById(R.id.btnthra);
        btncell3.setOnClickListener(view -> {


            if(counter3>3){
                counter3=1;
            }else
                counter3++;

            if(counter2>3){
                counter2=1;
            }else
                counter2++;

            if(counter6>3){
                counter6=1;
            }else
                counter6++;

            if(counter3==1){
                btncell3.setBackgroundColor(Color.RED);
            } else if (counter3==2) {
                btncell3.setBackgroundColor(Color.BLUE);
            }else if (counter3==3){
                btncell3.setBackgroundColor(Color.GREEN);
            }

            if(counter2==1){
                btncell2.setBackgroundColor(Color.RED);
            } else if (counter2==2) {
                btncell2.setBackgroundColor(Color.BLUE);
            }else if (counter2==3){
                btncell2.setBackgroundColor(Color.GREEN);
            }

            if(counter6==1){
                btncell6.setBackgroundColor(Color.RED);
            } else if (counter6==2) {
                btncell6.setBackgroundColor(Color.BLUE);
            }else if (counter6==3){
                btncell6.setBackgroundColor(Color.GREEN);
            }



//            Random rand = new Random();
//            int random = rand.nextInt(3);
//            if(random == 1){
//                btncell3.setBackgroundColor(Color.BLUE);
//                btncell2.setBackgroundColor(Color.BLUE);
//                btncell6.setBackgroundColor(Color.BLUE);
//
//
//            } else if (random==2) {
//                btncell3.setBackgroundColor(Color.GREEN);
//                btncell2.setBackgroundColor(Color.GREEN);
//                btncell6.setBackgroundColor(Color.GREEN);
//
//            }else{
//                btncell3.setBackgroundColor(Color.RED);
//                btncell2.setBackgroundColor(Color.RED);
//                btncell6.setBackgroundColor(Color.RED);
//
//            }
//        });
//
//
        });

        btncell4 = findViewById(R.id.btnfra);
        btncell4.setOnClickListener(view -> {
            Random rand = new Random();
            int random = rand.nextInt(3);
            if(random == 1){
                btncell1.setBackgroundColor(Color.RED);
                btncell5.setBackgroundColor(Color.RED);
                btncell7.setBackgroundColor(Color.RED);
                btncell4.setBackgroundColor(Color.RED);

            } else if (random==2) {
                btncell1.setBackgroundColor(Color.BLUE);
                btncell5.setBackgroundColor(Color.BLUE);
                btncell7.setBackgroundColor(Color.BLUE);
                btncell4.setBackgroundColor(Color.BLUE);

            }else{
                btncell1.setBackgroundColor(Color.GREEN);
                btncell5.setBackgroundColor(Color.GREEN);
                btncell7.setBackgroundColor(Color.GREEN);
                btncell4.setBackgroundColor(Color.GREEN);

            }
        });

        btncell5 = findViewById(R.id.btnfiva);
        btncell5.setOnClickListener(view -> {
            if(counter2>3){
                counter2=1;
            }else
                counter2++;

            if(counter5>3){
                counter5=1;
            }else
                counter5++;

            if(counter6>3){
                counter6=1;
            }else
                counter6++;

            if(counter8>3){
                counter8=1;
            }else
                counter8++;

            if(counter4>3){
                counter4=1;
            }else
                counter4++;

            if(counter2==1){
                btncell2.setBackgroundColor(Color.RED);
            } else if (counter2==2) {
                btncell2.setBackgroundColor(Color.BLUE);
            }else if (counter2==3){
                btncell2.setBackgroundColor(Color.GREEN);
            }

            if(counter5==1){
                btncell5.setBackgroundColor(Color.RED);
            } else if (counter5==2) {
                btncell5.setBackgroundColor(Color.BLUE);
            }else if (counter5==3){
                btncell5.setBackgroundColor(Color.GREEN);
            }

            if(counter6==1){
                btncell6.setBackgroundColor(Color.RED);
            } else if (counter6==2) {
                btncell6.setBackgroundColor(Color.BLUE);
            }else if (counter6==3){
                btncell6.setBackgroundColor(Color.GREEN);
            }

            if(counter8==1){
                btncell8.setBackgroundColor(Color.RED);
            } else if (counter8==2) {
                btncell8.setBackgroundColor(Color.BLUE);
            }else if (counter8==3){
                btncell8.setBackgroundColor(Color.GREEN);
            }

            if(counter4==1){
                btncell4.setBackgroundColor(Color.RED);
            } else if (counter4==2) {
                btncell4.setBackgroundColor(Color.BLUE);
            }else if (counter4==3){
                btncell4.setBackgroundColor(Color.GREEN);
            }

//            Random rand = new Random();
//            int random = rand.nextInt(3);
//            if(random == 1){
//                btncell2.setBackgroundColor(Color.GREEN);
//                btncell5.setBackgroundColor(Color.GREEN);
//                btncell6.setBackgroundColor(Color.GREEN);
//                btncell8.setBackgroundColor(Color.GREEN);
//                btncell4.setBackgroundColor(Color.GREEN);
//
//            } else if (random==2) {
//                btncell2.setBackgroundColor(Color.BLUE);
//                btncell5.setBackgroundColor(Color.BLUE);
//                btncell6.setBackgroundColor(Color.BLUE);
//                btncell8.setBackgroundColor(Color.BLUE);
//                btncell4.setBackgroundColor(Color.BLUE);
//
//            }else{
//                btncell2.setBackgroundColor(Color.RED);
//                btncell5.setBackgroundColor(Color.RED);
//                btncell6.setBackgroundColor(Color.RED);
//                btncell8.setBackgroundColor(Color.RED);
//                btncell4.setBackgroundColor(Color.RED);
//
//            }
        });



        btncell6 = findViewById(R.id.btnsixa);
        btncell6.setOnClickListener(view -> {


            Random rand = new Random();
            int random = rand.nextInt(3);
            if(random == 1){
                btncell3.setBackgroundColor(Color.RED);
                btncell5.setBackgroundColor(Color.RED);
                btncell9.setBackgroundColor(Color.RED);
                btncell6.setBackgroundColor(Color.RED);


            } else if (random==2) {
                btncell3.setBackgroundColor(Color.BLUE);
                btncell5.setBackgroundColor(Color.BLUE);
                btncell9.setBackgroundColor(Color.BLUE);
                btncell6.setBackgroundColor(Color.BLUE);


            }else{
                btncell3.setBackgroundColor(Color.GREEN);
                btncell5.setBackgroundColor(Color.GREEN);
                btncell9.setBackgroundColor(Color.GREEN);
                btncell6.setBackgroundColor(Color.GREEN);

            }
        });

        btncell7 = findViewById(R.id.btnsvena);
        btncell7.setOnClickListener(view -> {
            Random rand = new Random();
            int random = rand.nextInt(3);
            if(random == 1){

                btncell4.setBackgroundColor(Color.GREEN);
                btncell7.setBackgroundColor(Color.GREEN);
                btncell8.setBackgroundColor(Color.GREEN);


            } else if (random==2) {
                btncell4.setBackgroundColor(Color.RED);
                btncell7.setBackgroundColor(Color.RED);
                btncell8.setBackgroundColor(Color.RED);



            }else{
                btncell4.setBackgroundColor(Color.BLUE);
                btncell7.setBackgroundColor(Color.BLUE);
                btncell8.setBackgroundColor(Color.BLUE);


            }
        });


        btncell8 = findViewById(R.id.btnayta);
        btncell8.setOnClickListener(view -> {
            Random rand = new Random();
            int random = rand.nextInt(3);
            if(random == 1){
                btncell5.setBackgroundColor(Color.BLUE);
                btncell7.setBackgroundColor(Color.BLUE);
                btncell9.setBackgroundColor(Color.BLUE);
                btncell8.setBackgroundColor(Color.BLUE);



            } else if (random==2) {
                btncell5.setBackgroundColor(Color.RED);
                btncell7.setBackgroundColor(Color.RED);
                btncell9.setBackgroundColor(Color.RED);
                btncell8.setBackgroundColor(Color.RED);


            }else{
                btncell5.setBackgroundColor(Color.GREEN);
                btncell7.setBackgroundColor(Color.GREEN);
                btncell9.setBackgroundColor(Color.GREEN);
                btncell8.setBackgroundColor(Color.GREEN);

            }
        });


        btncell9 = findViewById(R.id.btnnina);
        btncell9.setOnClickListener(view -> {
            Random rand = new Random();
            int random = rand.nextInt(3);
            if(random == 1){
                btncell6.setBackgroundColor(Color.RED);
                btncell8.setBackgroundColor(Color.RED);
                btncell9.setBackgroundColor(Color.RED);

            } else if (random==2) {
                btncell6.setBackgroundColor(Color.BLUE);
                btncell8.setBackgroundColor(Color.BLUE);
                btncell9.setBackgroundColor(Color.BLUE);

            }else{
                btncell6.setBackgroundColor(Color.GREEN);
                btncell8.setBackgroundColor(Color.GREEN);
                btncell9.setBackgroundColor(Color.GREEN);

            }
            if(btncell1.getText()=="Red"){

            }
        });


        btncell10 = findViewById(R.id.btnReturn);
        btncell10.setOnClickListener(view -> {
            Random rand = new Random();
            int random = rand.nextInt(3);
            if(random == 1){
                btncell1.setBackgroundColor(Color.GREEN);
                btncell2.setBackgroundColor(Color.GREEN);
                btncell3.setBackgroundColor(Color.GREEN);
                btncell4.setBackgroundColor(Color.GREEN);
                btncell5.setBackgroundColor(Color.GREEN);
                btncell6.setBackgroundColor(Color.GREEN);
                btncell7.setBackgroundColor(Color.GREEN);
                btncell8.setBackgroundColor(Color.GREEN);
                btncell9.setBackgroundColor(Color.GREEN);

            } else if (random==2) {
                btncell1.setBackgroundColor(Color.GREEN);
                btncell2.setBackgroundColor(Color.GREEN);
                btncell3.setBackgroundColor(Color.GREEN);
                btncell4.setBackgroundColor(Color.GREEN);
                btncell5.setBackgroundColor(Color.GREEN);
                btncell6.setBackgroundColor(Color.GREEN);
                btncell7.setBackgroundColor(Color.GREEN);
                btncell8.setBackgroundColor(Color.GREEN);
                btncell9.setBackgroundColor(Color.GREEN);

            }else{
                btncell1.setBackgroundColor(Color.GREEN);
                btncell2.setBackgroundColor(Color.GREEN);
                btncell3.setBackgroundColor(Color.GREEN);
                btncell4.setBackgroundColor(Color.GREEN);
                btncell5.setBackgroundColor(Color.GREEN);
                btncell6.setBackgroundColor(Color.GREEN);
                btncell7.setBackgroundColor(Color.GREEN);
                btncell8.setBackgroundColor(Color.GREEN);
                btncell9.setBackgroundColor(Color.GREEN);

            }
        });

        btnBack = findViewById(R.id.btnBackBatch2);
        btnBack.setOnClickListener(view -> {
            finish();
        });

    }
}