package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class HowTo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to);
        TextView tv = (TextView) findViewById(R.id.HowTo);
        tv.setText("Welcome to FourFours. This is a game in which you are given a number and have the goal of generating as many possible variations of expressions that are equivalent in value to the number to generate goal. Your are only allowed to use the number 4 four times in any given expression. If you choose to use a logarithm, it must be in the format log(b,n). Where b is the base and n is the value. For square roots they must take the form sqrt(n) where n is the number you would like to calculate the square root of. Concatenation is not allowed and exponentiation is not allowed. ");
        tv.setTextSize(25);
    }

}
