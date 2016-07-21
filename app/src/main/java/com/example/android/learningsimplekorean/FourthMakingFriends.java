package com.example.android.learningsimplekorean;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by ee5415 on 7/21/2016.
 */
public class FourthMakingFriends extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.making_friends);
    }

    public void nextToTest1 (View v){
        Intent intent = new Intent(this, FifthSimpleTest1.class);
        startActivity(intent);
    }

    public void nextToThird (View v){
        Intent intent = new Intent(this, ThirdMarketConversation.class);
        startActivity(intent);
    }

}
