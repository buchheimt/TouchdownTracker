package com.tyler_buchheim.touchdowntracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA();
        displayForTeamB();
    }

    /**
     *  Increase the score of Team A by 1 and display score.
     */
    public void addOneToTeamA(View v) {
        scoreTeamA += 1;
        displayForTeamA();
    }

    /**
     *  Increase the score of Team A by 2 and display score.
     */
    public void addTwoToTeamA(View v) {
        scoreTeamA += 2;
        displayForTeamA();
    }

    /**
     *  Increase the score of Team A by 3 and display score.
     */
    public void addThreeToTeamA(View v) {
        scoreTeamA += 3;
        displayForTeamA();
    }

    /**
     *  Increase the score of Team A by 6 and display score.
     */
    public void addSixToTeamA(View v) {
        scoreTeamA += 6;
        displayForTeamA();
    }

    /**
     *  Increase the score of Team B by 1 and display score.
     */
    public void addOneToTeamB(View v) {
        scoreTeamB += 1;
        displayForTeamB();
    }

    /**
     *  Increase the score of Team B by 2 and display score.
     */
    public void addTwoToTeamB(View v) {
        scoreTeamB += 2;
        displayForTeamB();
    }

    /**
     *  Increase the score of Team B by 3 and display score.
     */
    public void addThreeToTeamB(View v) {
        scoreTeamB += 3;
        displayForTeamB();
    }

    /**
     *  Increase the score of Team B by 6 and display score.
     */
    public void addSixToTeamB(View v) {
        scoreTeamB += 6;
        displayForTeamB();
    }

    /**
     *  Displays the current score for Team A.
     */
    public void displayForTeamA() {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    /**
     *  Displays the current score for Team B.
     */
    public void displayForTeamB() {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    /**
     *  Sets both team scores to 0 and display each score.
     */
    public void resetScores(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA();
        displayForTeamB();
    }
}
