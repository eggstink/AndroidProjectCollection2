package com.example.androidprojectcollection;



import static java.sql.Types.NULL;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class calculator_exercise extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn10;
    Button btn11;
    Button btn12;
    Button btn13;
    Button btn14;
    Button btn15;
    Button btn16;
    TextView txtview1;
    String a;
    String b;
    double A;
    double B;
    double c;

    boolean isTimes;
    boolean isPlus;
    boolean isDivide;
    boolean isMinus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_exercise);
        txtview1 = (TextView) findViewById(R.id.tvDisplay);
        btn1 = (Button)findViewById(R.id.btnNum1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview1.append("1");
            }
        });

        btn2 = (Button)findViewById(R.id.btnNum2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview1.append("2");
            }
        });

        btn3 = (Button)findViewById(R.id.btnNum3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview1.append("3");
            }
        });

        btn4 = (Button)findViewById(R.id.btnNum4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview1.append("4");
            }
        });

        btn5 = (Button)findViewById(R.id.btnNum5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview1.append("5");
            }
        });

        btn6 = (Button)findViewById(R.id.btnNum6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview1.append("6");
            }
        });

        btn7 = (Button)findViewById(R.id.btnNum7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview1.append("7");
            }
        });

        btn8 = (Button)findViewById(R.id.btnNum8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview1.append("8");
            }
        });

        btn9 = (Button)findViewById(R.id.btnNum9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview1.append("9");
            }
        });

        btn10 = (Button)findViewById(R.id.btnNum0);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview1.append("0");
            }
        });

        btn11 = (Button)findViewById(R.id.btnTimes);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isDivide = false;
                isTimes = true;
                isMinus = false;
                isPlus = false;
                if(A!=NULL){
                    b = txtview1.getText().toString();
                    B = Double.parseDouble(b);
                }else{
                    a = txtview1.getText().toString();
                    A = Double.parseDouble(a);
                }
                txtview1.setText("");
            }
        });

        btn12 = (Button)findViewById(R.id.btnDivide);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isDivide = true;
                isTimes = false;
                isMinus = false;
                isPlus = false;

                if(A!=NULL){
                    b = txtview1.getText().toString();
                    B = Double.parseDouble(b);
                }else{
                    a = txtview1.getText().toString();
                    A = Double.parseDouble(a);
                }
                txtview1.setText("");
            }
        });

        btn13 = (Button)findViewById(R.id.btnPlus);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isDivide = false;
                isTimes = false;
                isMinus = false;
                isPlus = true;

                if(A!=NULL){
                    b = txtview1.getText().toString();
                    B = Double.parseDouble(b);
                }else{
                    a = txtview1.getText().toString();
                    A = Double.parseDouble(a);
                }
                txtview1.setText("");
            }
        });

        btn14 = (Button)findViewById(R.id.btnMinus);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isDivide = false;
                isTimes = false;
                isMinus = true;
                isPlus = false;

                if(A!=NULL){
                    b = txtview1.getText().toString();
                    B = Double.parseDouble(b);
                }else{
                    a = txtview1.getText().toString();
                    A = Double.parseDouble(a);
                }

                txtview1.setText("");
            }
        });

        btn12 = (Button)findViewById(R.id.btnNumeq);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isPlus==true){
                    c = A + B;
                    txtview1.setText("" + c);
                } else if (isDivide==true) {
                    c = A / B;
                    txtview1.setText("" + c);
                } else if (isTimes==true) {
                    c = A * B;
                    txtview1.setText("" + c);
                } else if (isMinus==true) {
                    c = A - B;
                    txtview1.setText("" + c);
                }

            }
        });
    }
}