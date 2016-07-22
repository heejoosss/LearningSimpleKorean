package com.example.android.learningsimplekorean;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by ee5415 on 7/21/2016.
 */
public class SecondThankyou extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thankyou);
    }

    public void nextToThird (View v){
        Intent intent = new Intent(this, ThirdMarketConversation.class);
        startActivity(intent);
    }
    public void nextToFirst (View v){
        Intent intent = new Intent(this, FirstGreeting.class);
        startActivity(intent);
    }
}