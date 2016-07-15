package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreteamA=0;
    int scoreteamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
       scoreteamA= scoreteamA+1;
        displayForTeamA(scoreteamA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        scoreteamA= scoreteamA+2;
        displayForTeamA(scoreteamA);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        scoreteamA= scoreteamA+3;
        displayForTeamA(scoreteamA);
    }

    public void addOneForTeamB(View v) {
        scoreteamB= scoreteamB+1;
        displayForTeamB(scoreteamB);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamB(View v) {
        scoreteamB= scoreteamB+2;
        displayForTeamB(scoreteamB);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamB(View v) {
        scoreteamB= scoreteamB+3;
        displayForTeamB(scoreteamB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}