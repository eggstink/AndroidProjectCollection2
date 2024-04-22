package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class PassingIntentsExercise extends AppCompatActivity {

    Button btnSub;
    Button btnclr;
    EditText etFName;
    EditText etLName;
    EditText etbDate;
    EditText etpNum;
    EditText eteAdd;
    EditText etidNum;
    EditText etAdd;
    EditText etNat;
    EditText etReg;
    RadioButton rbMale;
    RadioButton rbFem;
    RadioButton rbOth;
    RadioButton rbSin;
    RadioButton rbMar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise);
        btnSub = (Button)findViewById(R.id.btnSubmit);
        btnclr = (Button)findViewById(R.id.btnClr);
        etFName = (EditText)findViewById(R.id.etFN);
        etLName = (EditText)findViewById(R.id.etLN);
        etbDate = (EditText)findViewById(R.id.etBD);
        etpNum = (EditText)findViewById(R.id.etPN);
        eteAdd = (EditText)findViewById(R.id.etEA);
        etidNum = (EditText)findViewById(R.id.etIDN);
        etAdd = (EditText)findViewById(R.id.etAD);
        etNat = (EditText)findViewById(R.id.etNationality);
        etReg = (EditText)findViewById(R.id.etRg);
        rbMale = (RadioButton)findViewById(R.id.rbM);
        rbFem = (RadioButton)findViewById(R.id.rbF);
        rbOth = (RadioButton)findViewById(R.id.rbO);
        rbSin = (RadioButton)findViewById(R.id.rbSingle);
        rbMar = (RadioButton)findViewById(R.id.rbMarried);

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname = etFName.getText().toString();
                String lname = etLName.getText().toString();

                String gender;
                if(rbMale.isChecked()){
                    gender = "Male";
                } else if (rbFem.isChecked()) {
                    gender = "Female";
                } else if (rbOth.isChecked()) {
                    gender = "Others";
                }else
                    gender = "Unknown";

                String bDate = etbDate.getText().toString();
                String pNumber = etpNum.getText().toString();
                String emailAdd = eteAdd.getText().toString();
                String idNum = etidNum.getText().toString();
                String add = etAdd.getText().toString();
                String nationality = etNat.getText().toString();
                String religion = etReg.getText().toString();

                String status;
                if(rbSin.isChecked()){
                    status = "Single";
                } else if (rbMar.isChecked()) {
                    status = "Married";
                }else
                    status = "Unknown";

                Intent intent = new Intent(PassingIntentsExercise.this, PassingIntentsExercise2.class);
                intent.putExtra("fname_key", fname);
                intent.putExtra("lname_key", lname);
                intent.putExtra("gender_key", gender);
                intent.putExtra("bDate_key", bDate);
                intent.putExtra("pNumber_key", pNumber);
                intent.putExtra("emailAdd_key", emailAdd);
                intent.putExtra("idNum_key", idNum);
                intent.putExtra("add_key", add);
                intent.putExtra("nationality_key", nationality);
                intent.putExtra("religion_key", religion);
                intent.putExtra("status_key", status);
                startActivity(intent);
            }
        });

        btnclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etFName.setText("");
                etLName.setText("");
                etbDate.setText("");
                etpNum.setText("");
                eteAdd.setText("");
                etidNum.setText("");
                etAdd.setText("");
                etNat.setText("");
                etReg.setText("");
                rbMar.setChecked(false);
                rbSin.setChecked(false);
                rbOth.setChecked(false);
                rbFem.setChecked(false);
                rbMale.setChecked(false);
            }
        });
    }
}