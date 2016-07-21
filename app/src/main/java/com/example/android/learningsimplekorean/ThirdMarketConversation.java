package com.example.android.learningsimplekorean;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by ee5415 on 7/21/2016.
 */
public class ThirdMarketConversation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.market_conversation);
    }

    public void nextToFourth (View v){
        Intent intent = new Intent(this, FourthMakingFriends.class);
        startActivity(intent);
    }
    public void nextToSecond (View v){
        Intent intent = new Intent(this, SecondThankyou.class);
        startActivity(intent);
    }
}
