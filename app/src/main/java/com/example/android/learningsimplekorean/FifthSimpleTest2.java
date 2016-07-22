package com.example.android.learningsimplekorean;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

/**
 * Created by ee5415 on 7/21/2016.
 */
public class FifthSimpleTest2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_test2);
    }

    public void nextToFinal (View v){
        CheckBox numThreeBoxOne = (CheckBox) findViewById(R.id.number3_check_false);
        boolean hasNumThreeBoxOneChecked = numThreeBoxOne.isChecked();

        CheckBox numThreeBoxTwo = (CheckBox) findViewById(R.id.number3_check_false2);
        boolean hasNumThreeBoxTwoChecked = numThreeBoxTwo.isChecked();

        CheckBox numThreeBoxThree = (CheckBox) findViewById(R.id.number3_check_true);
        boolean hasNumThreeBoxThreeChecked = numThreeBoxThree.isChecked();

        CheckBox numFourBoxOne = (CheckBox) findViewById(R.id.number4_check1);
        boolean hasNumFourBoxOneChecked = numFourBoxOne.isChecked();

        CheckBox numFourBoxTwo = (CheckBox) findViewById(R.id.number4_check2);
        boolean hasNumFourBoxTwoChecked = numFourBoxTwo.isChecked();

        testScore(hasNumThreeBoxOneChecked, hasNumThreeBoxTwoChecked,hasNumThreeBoxThreeChecked,
                hasNumFourBoxOneChecked,hasNumFourBoxTwoChecked);

        Intent intent = new Intent(this, FinalPage.class);
        startActivity(intent);
    }
    private void testScore (boolean No3B1, boolean No3B2, boolean No3B3, boolean No4B1, boolean No4B2){
        if(No3B3&&No4B1&&No4B2){
            Toast.makeText(this, "You're genius!!", Toast.LENGTH_SHORT).show();
        }
        if(No3B1||No3B2){
            Toast.makeText(this, "Wrong answer. Try again.", Toast.LENGTH_SHORT).show();
        }
    }
}
