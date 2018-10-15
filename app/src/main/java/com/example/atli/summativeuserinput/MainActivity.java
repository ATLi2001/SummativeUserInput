package com.example.atli.summativeuserinput;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void incrementA(View view){
        TextView scoreATextView = (TextView) findViewById(R.id.scoreA);
        String value = (String) scoreATextView.getText();
        int newValue;
        newValue = Integer.parseInt(value);
        scoreATextView.setText(newValue++);

    }

    public void decrementA(View view) {
        TextView scoreATextView = (TextView) findViewById(R.id.scoreA);
        String value = (String) scoreATextView.getText();
        int newValue;
        newValue = Integer.parseInt(value);
        scoreATextView.setText(newValue--);
    }

    public void incrementB(View view){
        TextView scoreBTextView = (TextView) findViewById(R.id.scoreB);
        String value = (String) scoreBTextView.getText();
        int newValue;
        newValue = Integer.parseInt(value);
        scoreBTextView.setText(newValue++);

    }

    public void decrementB(View view) {
        TextView scoreBTextView = (TextView) findViewById(R.id.scoreB);
        String value = (String) scoreBTextView.getText();
        int newValue;
        newValue = Integer.parseInt(value);
        scoreBTextView.setText(newValue--);
    }

    public void reset(View view) {
        TextView scoreATextView = (TextView) findViewById(R.id.scoreA);
        scoreATextView.setText(0);
        TextView scoreBTextView = (TextView) findViewById(R.id.scoreB);
        scoreBTextView.setText(0);
    }
}
