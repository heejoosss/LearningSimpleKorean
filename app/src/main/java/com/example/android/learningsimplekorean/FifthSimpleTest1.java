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
public class FifthSimpleTest1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_test);
    }

    public void nextToTest2 (View v){
        CheckBox numOneBoxOne = (CheckBox) findViewById(R.id.number1_check_false);
        boolean hasNumOneBoxOneChecked = numOneBoxOne.isChecked();

        CheckBox numOneBoxTwo = (CheckBox) findViewById(R.id.number1_check_true);
        boolean hasNumOneBoxTwoChecked = numOneBoxTwo.isChecked();

        CheckBox numOneBoxThree = (CheckBox) findViewById(R.id.number1_check_false2);
        boolean hasNumOneBoxThreeChecked = numOneBoxThree.isChecked();

        CheckBox numTwoBoxOne = (CheckBox) findViewById(R.id.number2_check_false);
        boolean hasNumTwoBoxOneChecked = numTwoBoxOne.isChecked();

        CheckBox numTwoBoxTwo = (CheckBox) findViewById(R.id.number2_check_true);
        boolean hasNumTwoBoxTwoChecked = numTwoBoxTwo.isChecked();

        testScore(hasNumOneBoxOneChecked, hasNumOneBoxTwoChecked, hasNumOneBoxThreeChecked,
                hasNumTwoBoxOneChecked, hasNumTwoBoxTwoChecked);

        Intent intent = new Intent(this, FifthSimpleTest2.class);
        startActivity(intent);
    }

    private void testScore (boolean No1B1, boolean No1B2, boolean No1B3, boolean No2B1, boolean No2B2){
        if(No1B2&&No2B2){
            Toast.makeText(this, "Good Job!", Toast.LENGTH_SHORT).show();
        }
        if(No1B1||No1B3||No2B1){
            Toast.makeText(this, "Wrong answer. Try again.", Toast.LENGTH_SHORT).show();
        }
    }
}