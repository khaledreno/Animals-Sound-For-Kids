package com.example.animalsound;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    public void jungle(View view) {

        Intent intent = new Intent(this, jungle.class);
        startActivity(intent);

    }

    public void about(View view) {
        Intent intent = new Intent(this, about.class);
        startActivity(intent);
    }


    public void farm(View view) {
        Intent intent = new Intent(this, farm.class);
        startActivity(intent);

    }


    public void birds(View view) {
        Intent intent = new Intent(this, birds.class);
        startActivity(intent);

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
