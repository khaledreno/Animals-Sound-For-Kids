package com.example.animalsound;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class farm extends AppCompatActivity {


    MediaPlayer mp;
    Boolean flag = false;


    public void backk(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        if (flag)
            mp.stop();

    }

    public void sound(View view){
        Button btn = (Button) view;
        String word = btn.getTag().toString();

        if(flag){
            mp.stop();
            mp.release();
            mp = null;
        }

        mp = MediaPlayer.create(this, getResources().getIdentifier(word, "raw", getPackageName()));
        mp.start();
        flag = true;
        Toast.makeText(this, "You have selected "+word, Toast.LENGTH_SHORT).show();
    }

    public void pause(View view){

        if (flag) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farm);
    }
}
