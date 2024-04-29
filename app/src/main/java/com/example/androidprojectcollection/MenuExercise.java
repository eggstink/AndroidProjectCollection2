package com.example.androidprojectcollection;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuExercise extends AppCompatActivity {

    Button btnChanger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_exercise);

        btnChanger = findViewById(R.id.btnTransformingButton);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_menuexercise,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
            if(item.getItemId()==R.id.mItemChange){
                Toast.makeText(this,"Edit Object Item is clicked",Toast.LENGTH_SHORT).show();
            }else if (item.getItemId()==R.id.mItemReset){
                btnChanger.setVisibility(View.VISIBLE);
                btnChanger.setX(1);
                btnChanger.setY(1);
                btnChanger.setZ(1);
                btnChanger.setBackgroundColor(Color.parseColor("#FFB62B2B"));
                btnChanger.setText(" ");
                    Toast.makeText(this, "Reset Object Item is clicked", Toast.LENGTH_SHORT).show();
            }else if(item.getItemId() == R.id.mItemExit){
                    finish();
            }else if(item.getItemId() == R.id.changeColor){
                btnChanger.setBackgroundColor(Color.parseColor("#123154"));
            }else if(item.getItemId() == R.id.changeText){
                btnChanger.setText("Button");
            }else if(item.getItemId() == R.id.changeTextColor){
                btnChanger.setTextColor(Color.YELLOW);
            }else if(item.getItemId() == R.id.changeButtonVisibility){
                btnChanger.setVisibility(View.GONE);
            }else if(item.getItemId() == R.id.changeButtonPosition){
                btnChanger.setX(500);
                btnChanger.setY(412);
                btnChanger.setZ(523);
            }

            return true;
    }
}