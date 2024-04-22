package com.example.androidprojectcollection;



import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Stack;


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
    TextView txtview2;
    String toSolve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_exercise);
        txtview1 = (TextView) findViewById(R.id.tvNum);
        txtview2 = (TextView) findViewById(R.id.tvString);
        btn1 = (Button)findViewById(R.id.btnOne);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview2.append("1");

                String toSolve = txtview2.getText().toString();
                Calculate calculate = new Calculate(toSolve);
                seqCalculate seqcalculate = new seqCalculate(toSolve);
                if(calculate.is2Nums=true){
                    txtview1.setText(Double.toString(seqcalculate.evaluate()));
                }
            }
        });

        btn2 = (Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview2.append("2");

                String toSolve = txtview2.getText().toString();
                Calculate calculate = new Calculate(toSolve);
                seqCalculate seqcalculate = new seqCalculate(toSolve);
                if(calculate.is2Nums=true){
                    txtview1.setText(Double.toString(seqcalculate.evaluate()));
                }
            }
        });

        btn3 = (Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview2.append("3");

                String toSolve = txtview2.getText().toString();
                Calculate calculate = new Calculate(toSolve);
                seqCalculate seqcalculate = new seqCalculate(toSolve);
                if(calculate.is2Nums=true){
                    txtview1.setText(Double.toString(seqcalculate.evaluate()));
                }
            }
        });

        btn4 = (Button)findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview2.append("4");

                String toSolve = txtview2.getText().toString();
                Calculate calculate = new Calculate(toSolve);
                seqCalculate seqcalculate = new seqCalculate(toSolve);
                if(calculate.is2Nums=true){
                    txtview1.setText(Double.toString(seqcalculate.evaluate()));
                }
            }
        });

        btn5 = (Button)findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview2.append("5");

                String toSolve = txtview2.getText().toString();
                Calculate calculate = new Calculate(toSolve);
                seqCalculate seqcalculate = new seqCalculate(toSolve);
                if(calculate.is2Nums=true){
                    txtview1.setText(Double.toString(seqcalculate.evaluate()));
                }
            }
        });

        btn6 = (Button)findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview2.append("6");

                String toSolve = txtview2.getText().toString();
                Calculate calculate = new Calculate(toSolve);
                seqCalculate seqcalculate = new seqCalculate(toSolve);
                if(calculate.is2Nums=true){
                    txtview1.setText(Double.toString(seqcalculate.evaluate()));
                }
            }
        });

        btn7 = (Button)findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview2.append("7");

                String toSolve = txtview2.getText().toString();
                Calculate calculate = new Calculate(toSolve);
                seqCalculate seqcalculate = new seqCalculate(toSolve);
                if(calculate.is2Nums=true){
                    txtview1.setText(Double.toString(seqcalculate.evaluate()));
                }
            }
        });

        btn8 = (Button)findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview2.append("8");

                String toSolve = txtview2.getText().toString();
                Calculate calculate = new Calculate(toSolve);
                seqCalculate seqcalculate = new seqCalculate(toSolve);
                if(calculate.is2Nums=true){
                    txtview1.setText(Double.toString(seqcalculate.evaluate()));
                }
            }
        });

        btn9 = (Button)findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview2.append("9");

                String toSolve = txtview2.getText().toString();
                Calculate calculate = new Calculate(toSolve);
                seqCalculate seqcalculate = new seqCalculate(toSolve);
                if(calculate.is2Nums=true){
                    txtview1.setText(Double.toString(seqcalculate.evaluate()));
                }
            }
        });

        btn10 = (Button)findViewById(R.id.btn0);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview2.append("0");

                String toSolve = txtview2.getText().toString();
                Calculate calculate = new Calculate(toSolve);
                seqCalculate seqcalculate = new seqCalculate(toSolve);
                if(calculate.is2Nums=true){
                    txtview1.setText(Double.toString(seqcalculate.evaluate()));
                }
            }
        });

        btn11 = (Button)findViewById(R.id.btnMultiply);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview2.append("*");


            }
        });

        btn12 = (Button)findViewById(R.id.btnDivide);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview2.append("/");


            }
        });

        btn13 = (Button)findViewById(R.id.btnAddition);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview2.append("+");

            }
        });

        btn14 = (Button)findViewById(R.id.btnMinus);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview2.append("-");

            }
        });

        btn12 = (Button)findViewById(R.id.btnEquals);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toSolve = txtview2.getText().toString();
                Calculate calculate = new Calculate(toSolve);
                txtview1.setText(Double.toString(calculate.evaluate()));
            }
        });

        btn13 = (Button)findViewById(R.id.btnClear);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview1.setText("");
                txtview2.setText("");
            }
        });
    }
}