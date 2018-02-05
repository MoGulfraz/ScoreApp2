package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Variables for team A
    int goalA = 0;
    int shotsOnA = 0;
    int shotsOffA = 0;
    int cornersA = 0;
    int redA = 0;
    int yellowA = 0;


    //Variables for team B
    int goalL = 0;
    int shotsOnL = 0;
    int shotsOffL = 0;
    int cornersL = 0;
    int redL = 0;
    int yellowL = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goalA(View view) {
        goalA = goalA + 1;
        TextView goal = (TextView) findViewById(R.id.scoreA);
        goal.setText(String.valueOf(goalA));
    }

    public void shotsOnA(View view) {
        shotsOnA = shotsOnA + 1;
        TextView shots = (TextView) findViewById(R.id.shotsOnA);
        shots.setText(String.valueOf(shotsOnA));
    }

    public void shotsOffA(View view) {
        shotsOffA = shotsOffA + 1;
        TextView shotOff = (TextView) findViewById(R.id.shotsOffA);
        shotOff.setText(String.valueOf(shotsOffA));
    }

    public void cornersA(View view) {
        cornersA = cornersA + 1;
        TextView corners = (TextView) findViewById(R.id.cornersA);
        corners.setText(String.valueOf(cornersA));
    }

    public void redCardA(View view) {
        redA = redA + 1;
        TextView red = (TextView) findViewById(R.id.redCardA);
        red.setText(String.valueOf(redA));
    }

    public void yellowCardA(View view) {
        yellowA = yellowA + 1;
        TextView yellow = (TextView) findViewById(R.id.yellowCardA);
        yellow.setText(String.valueOf(yellowA));
    }

    public void goalL(View view) {
        goalL = goalL + 1;
        TextView goal = (TextView) findViewById(R.id.scoreL);
        goal.setText(String.valueOf(goalL));
    }

    public void shotsOnL(View view) {
        shotsOnL = shotsOnL + 1;
        TextView goal = (TextView) findViewById(R.id.shotsOnL);
        goal.setText(String.valueOf(shotsOnL));
    }

    public void shotsOffL(View view) {
        shotsOffL = shotsOffL + 1;
        TextView goal = (TextView) findViewById(R.id.shotsOffL);
        goal.setText(String.valueOf(shotsOffL));
    }

    public void cornersL(View view) {
        cornersL = cornersL + 1;
        TextView goal = (TextView) findViewById(R.id.cornersL);
        goal.setText(String.valueOf(cornersL));
    }

    public void redL(View view) {
        redL = redL + 1;
        TextView goal = (TextView) findViewById(R.id.redCardL);
        goal.setText(String.valueOf(redL));
    }

    public void yellowL(View view) {
        yellowL = yellowL + 1;
        TextView goal = (TextView) findViewById(R.id.yellowCardL);
        goal.setText(String.valueOf(yellowL));
    }


    public void reset(View view) {
        goalA = 0;
        TextView goal = (TextView) findViewById(R.id.scoreA);
        goal.setText(String.valueOf(goalA));

        shotsOnA = 0;
        TextView shots = (TextView) findViewById(R.id.shotsOnA);
        shots.setText(String.valueOf(shotsOnA));

        shotsOffA = 0;
        TextView shotOff = (TextView) findViewById(R.id.shotsOffA);
        shotOff.setText(String.valueOf(shotsOffA));

        cornersA = 0;
        TextView corners = (TextView) findViewById(R.id.cornersA);
        corners.setText(String.valueOf(cornersA));

        redA = 0;
        TextView red = (TextView) findViewById(R.id.redCardA);
        red.setText(String.valueOf(redA));

        yellowA = 0;
        TextView yellow = (TextView) findViewById(R.id.yellowCardA);
        yellow.setText(String.valueOf(yellowA));

        goalL = 0;
        TextView goalL = (TextView) findViewById(R.id.scoreL);
        goal.setText(String.valueOf(goalL));

        shotsOnL = 0;
        TextView shotsL = (TextView) findViewById(R.id.shotsOnL);
        shots.setText(String.valueOf(shotsOnL));

        shotsOffL = 0;
        TextView shotOffL = (TextView) findViewById(R.id.shotsOffL);
        shotOff.setText(String.valueOf(shotsOffL));

        cornersA = 0;
        TextView cornersL = (TextView) findViewById(R.id.cornersL);
        corners.setText(String.valueOf(cornersL));

        redL = 0;
        TextView redL = (TextView) findViewById(R.id.redCardL);
        red.setText(String.valueOf(redL));

        yellowL = 0;
        TextView yellowL = (TextView) findViewById(R.id.yellowCardL);
        yellow.setText(String.valueOf(yellowL));


    }
}
