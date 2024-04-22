package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PassingIntentsExercise2 extends AppCompatActivity {
    Button btnReturn;
    TextView tvfName;
    TextView tvlName;
    TextView tvGen;
    TextView tvbDate;
    TextView tvpNum;
    TextView tveAdd;
    TextView tvIDN;
    TextView tvAdd;
    TextView tvNat;
    TextView tvReg;
    TextView tvStat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise2);
        tvfName = (TextView) findViewById(R.id.tvFN);
        tvlName = (TextView) findViewById(R.id.tvLN);
        tvGen = (TextView) findViewById(R.id.tvGen);
        tvbDate = (TextView) findViewById(R.id.tvBD);
        tvpNum = (TextView) findViewById(R.id.tvPN);
        tveAdd = (TextView) findViewById(R.id.tvEA);
        tvIDN = (TextView) findViewById(R.id.tvID);
        tvAdd = (TextView) findViewById(R.id.tvAdd);
        tvNat = (TextView) findViewById(R.id.tvNat);
        tvReg = (TextView) findViewById(R.id.tvReg);
        tvStat = (TextView) findViewById(R.id.tvSta);

        Intent intent = getIntent();
        String fname = intent.getStringExtra("fname_key");
        String lname = intent.getStringExtra("lname_key");
        String gender = intent.getStringExtra("gender_key");
        String bDate = intent.getStringExtra("bDate_key");
        String pNumber = intent.getStringExtra("pNumber_key");
        String emailAdd = intent.getStringExtra("emailAdd_key");
        String idNum = intent.getStringExtra("idNum_key");
        String add = intent.getStringExtra("add_key");
        String nationality = intent.getStringExtra("nationality_key");
        String religion = intent.getStringExtra("religion_key");
        String status  = intent.getStringExtra("status_key");

        tvfName.setText(fname);
        tvlName.setText(lname);
        tvGen.setText(gender);
        tvbDate.setText(bDate);
        tvpNum.setText(pNumber);
        tveAdd.setText(emailAdd);
        tvIDN.setText(idNum);
        tvAdd.setText(add);
        tvNat.setText(nationality);
        tvReg.setText(religion);
        tvStat.setText(status);

        btnReturn = (Button)findViewById(R.id.btnRet);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}