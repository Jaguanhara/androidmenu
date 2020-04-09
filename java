package com.jaguanhara.menuprincipal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void chamarImc (View view){
        Intent itt = new Intent( MainActivity.this, ImcActivity.class);
        startActivity(itt);
    }

    //public void chamarPrice (View view){
        //Intent itt = new Intent( MainActivity.this, PriceActivity.class);
        //startActivity(itt);
    //}


}
