package com.example.android.footballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /**
     * This variable keep track of goals of team A
     */
    int goalsOfTeamA = 0;
    /**
     * This variable keep track of yellow cards of team A
     */
    int yellowCardsOfTeamA = 0;
    /**
     * This variable keep track of red cards of team A
     */
    int redCardsOfTeamA = 0;
    /**
     * This variable keep track of goals of team B
     */
    int goalsOfTeamB = 0;
    /**
     * This variable keep track of yellow cards of team B
     */
    int yellowCardsOfTeamB = 0;
    /**
     * This variable keep track of red cards of team B
     */
    int redCardsOfTeamB = 0;

    TextView teamAGoalView;
    TextView teamAYellowCardView;
    TextView teamARedCardView;
    TextView teamBGoalView;
    TextView teamBYellowCardView;
    TextView teamBRedCardView;


    /**
     * This part saves current state of goals, yellow and red cards
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("goalA", goalsOfTeamA);
        outState.putInt("yellowA", yellowCardsOfTeamA);
        outState.putInt("redA", redCardsOfTeamA);
        outState.putInt("goalB", goalsOfTeamB);
        outState.putInt("yellowB", yellowCardsOfTeamB);
        outState.putInt("redB", redCardsOfTeamB);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**This part initialize the Views.*/
        teamAGoalView = (TextView) findViewById(R.id.goalTeamAScore);
        teamAYellowCardView = (TextView) findViewById(R.id.yellowTeamAScore);
        teamARedCardView = (TextView) findViewById(R.id.redTeamAScore);
        teamBGoalView = (TextView) findViewById(R.id.goalTeamBScore);
        teamBYellowCardView = (TextView) findViewById(R.id.yellowTeamBScore);
        teamBRedCardView = (TextView) findViewById(R.id.redTeamBScore);
        /**This part check if there is any old saves of scores, then load old scores if true*/
        if (savedInstanceState != null) {
            super.onRestoreInstanceState(savedInstanceState);
            /**Here variables becomes values stored as old scores*/
            goalsOfTeamA = savedInstanceState.getInt("goalA");
            yellowCardsOfTeamA = savedInstanceState.getInt("yellowA");
            redCardsOfTeamA = savedInstanceState.getInt("redA");
            goalsOfTeamB = savedInstanceState.getInt("goalB");
            yellowCardsOfTeamB = savedInstanceState.getInt("yellowB");
            redCardsOfTeamB = savedInstanceState.getInt("redB");
            /**Here variables becomes values stored as old scores*/
            displayGoalTeamA(goalsOfTeamA);
            displayYellowTeamA(yellowCardsOfTeamA);
            displayRedTeamA(redCardsOfTeamA);
            displayGoalTeamB(goalsOfTeamB);
            displayYellowTeamB(yellowCardsOfTeamB);
            displayRedTeamB(redCardsOfTeamB);
        }
    }

    /**
     * Method that makes goals of team A increase by one and display it on screen
     */
    public void increaseGoalsOfTeamA(View view) {
        goalsOfTeamA++;
        displayGoalTeamA(goalsOfTeamA);
    }

    /**
     * Method that makes yellow cards of team A increase by one and display it on screen
     */
    public void increaseYellowCardsOfTeamA(View view) {
        yellowCardsOfTeamA++;
        displayYellowTeamA(yellowCardsOfTeamA);
    }

    /**
     * Method that makes red cards of team A increase by one and display it on screen
     */
    public void increaseRedCardsOfTeamA(View view) {
        redCardsOfTeamA++;
        displayRedTeamA(redCardsOfTeamA);
    }

    /**
     * Method that makes goals of team B increase by one and display it on screen
     */
    public void increaseGoalsOfTeamB(View view) {
        goalsOfTeamB++;
        displayGoalTeamB(goalsOfTeamB);
    }

    /**
     * Method that makes yellow cards of team B increase by one and display it on screen
     */
    public void increaseYellowCardsOfTeamB(View view) {
        yellowCardsOfTeamB++;
        displayYellowTeamB(yellowCardsOfTeamB);
    }

    /**
     * Method that makes red cards of team B increase by one and display it on screen
     */
    public void increaseRedCardsOfTeamB(View view) {
        redCardsOfTeamB++;
        displayRedTeamB(redCardsOfTeamB);
    }

    /**
     * Method that reset all scores
     */
    public void resetAll(View view) {
        goalsOfTeamA = 0;
        yellowCardsOfTeamA = 0;
        redCardsOfTeamA = 0;
        goalsOfTeamB = 0;
        yellowCardsOfTeamB = 0;
        redCardsOfTeamB = 0;
        displayGoalTeamA(goalsOfTeamA);
        displayYellowTeamA(yellowCardsOfTeamA);
        displayRedTeamA(redCardsOfTeamA);
        displayGoalTeamB(goalsOfTeamB);
        displayYellowTeamB(yellowCardsOfTeamB);
        displayRedTeamB(redCardsOfTeamB);
    }

    /**
     * Method that reset scores of team A
     */
    public void resetA(View view) {
        goalsOfTeamA = 0;
        yellowCardsOfTeamA = 0;
        redCardsOfTeamA = 0;
        displayGoalTeamA(goalsOfTeamA);
        displayYellowTeamA(yellowCardsOfTeamA);
        displayRedTeamA(redCardsOfTeamA);
    }

    /**
     * Method that reset scores of team B
     */
    public void resetB(View view) {
        goalsOfTeamB = 0;
        yellowCardsOfTeamB = 0;
        redCardsOfTeamB = 0;
        displayGoalTeamB(goalsOfTeamB);
        displayYellowTeamB(yellowCardsOfTeamB);
        displayRedTeamB(redCardsOfTeamB);
    }

    /**
     * Those methods find textviews by ID and display current score inside them
     */
    public void displayGoalTeamA(int score) {
        teamAGoalView.setText(String.valueOf(score));
    }

    public void displayYellowTeamA(int score) {
        teamAYellowCardView.setText(String.valueOf(score));
    }

    public void displayRedTeamA(int score) {
        teamARedCardView.setText(String.valueOf(score));
    }

    public void displayGoalTeamB(int score) {
        teamBGoalView.setText(String.valueOf(score));
    }

    public void displayYellowTeamB(int score) {
        teamBYellowCardView.setText(String.valueOf(score));
    }

    public void displayRedTeamB(int score) {
        teamBRedCardView.setText(String.valueOf(score));
    }

}
