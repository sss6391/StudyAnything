package com.hkit.smartcloset;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClk(View v){
        id = v.getId();
        Log.d("test", id+" 진입!!!!!");

        if(id == R.id.btn_main1 ){
            Intent intent = new Intent(MainActivity.this, SelectionActivity.class);
            startActivity(intent);
        }else if (id == R.id.btn_main2){
            Intent intent = new Intent(MainActivity.this, ReturnActivity.class);
            startActivity(intent);
        }else if (id == R.id.btn_main3){
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            startActivity(intent);
        }else if (id == R.id.btn_main4){
            Intent intent = new Intent(MainActivity.this, CalendarActivity.class);
            startActivity(intent);
        }else if (id == R.id.btn_main5){
            Intent intent = new Intent(MainActivity.this, SaveNewcloActivity.class);
            startActivity(intent);
        }else if (id == R.id.btn_main11){
            Intent intent = new Intent(MainActivity.this, ThemeActivity.class);
            startActivity(intent);
        }else if (id == R.id.btn_main12){
            Intent intent = new Intent(MainActivity.this, AutoActivity.class);
            startActivity(intent);
        }else if (id == R.id.btn_main13){
            Intent intent = new Intent(MainActivity.this, AirInfoActivity.class);
            startActivity(intent);
        }else if (id == R.id.btn_main14){
            Intent intent = new Intent(MainActivity.this, LightActivity.class);
            startActivity(intent);
        }else if (id == R.id.btn_main15){
            Intent intent = new Intent(MainActivity.this, SpeakerActivity.class);
            startActivity(intent);
        }

    }
}
