package com.example.atli.summativeuserinput;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pointsA = 0;
    int pointsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void incrementA(View view){
        TextView scoreATextView = (TextView) findViewById(R.id.scoreA);
        pointsA+=1;
        scoreATextView.setText(pointsA + "");

    }

    public void decrementA(View view) {
        TextView scoreATextView = (TextView) findViewById(R.id.scoreA);
        if(pointsA>0)
            pointsA-=1;
        scoreATextView.setText(pointsA + "");
    }

    public void incrementB(View view){
        TextView scoreBTextView = (TextView) findViewById(R.id.scoreB);
        pointsB+=1;
        scoreBTextView.setText(pointsB + "");

    }

    public void decrementB(View view) {
        TextView scoreBTextView = (TextView) findViewById(R.id.scoreB);
        if(pointsB>0)
            pointsB-=1;
        scoreBTextView.setText(pointsB + "");
    }

    public void reset(View view) {
        TextView scoreATextView = (TextView) findViewById(R.id.scoreA);
        pointsA=0;
        scoreATextView.setText(pointsA + "");
        TextView scoreBTextView = (TextView) findViewById(R.id.scoreB);
        pointsB=0;
        scoreBTextView.setText(pointsB + "");
    }
}
