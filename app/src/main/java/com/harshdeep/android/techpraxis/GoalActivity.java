package com.harshdeep.android.techpraxis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class GoalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal);



    }

    public void takeInput(View view) {
        Intent intent = new Intent(this,FitnessActivity.class);
        startActivity(intent);
    }
}
