package com.example.myapplication;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    protected CountDownTimer timer;
    private static final String TAG = "FourFours";
    protected TextView logoTW;
    protected long finalTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        int n = rand.nextInt(50);
        TextView tv = (TextView) findViewById(R.id.Rand_num);
        String s = tv.getText().toString();
        s += " " + n;
        tv.setText(s);


        new CountDownTimer(60000, 1000) {

            public void onTick(long millisUntilFinished) {
                TextView time = (TextView) findViewById(R.id.Time);
                time.setText("seconds remaining: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                TextView time = (TextView) findViewById(R.id.Time);
                time.setText("Done!");
            }
        }.start();

    }


    protected String addDecimal(View v) {
        TextView tv = (TextView) findViewById(R.id.User_Input);
        String s = tv.getText().toString();

        s += ".";
        tv.setText(s);
        return s;
    }



    protected String add4(View v) {
        TextView tv = (TextView) findViewById(R.id.User_Input);
        String s = tv.getText().toString();

        s += "4";
        tv.setText(s);
        return s;
    }

    protected String addSign(View v) {
        TextView tv = (TextView) findViewById(R.id.User_Input);
        String s = tv.getText().toString();
        if (s.length() == 7) {
            return s;
        }
        s += "+";
        tv.setText(s);
        return s;
    }

    protected String subtractSign(View v) {
        TextView tv = (TextView) findViewById(R.id.User_Input);
        String s = tv.getText().toString();
        if (s.length() == 0) {
            return s;
        }
        s += "-";
        tv.setText(s);
        return s;
    }

    protected String multiplySign(View v) {
        TextView tv = (TextView) findViewById(R.id.User_Input);
        String s = tv.getText().toString();
        s += "*";
        tv.setText(s);
        return s;
    }

    protected String divisionSign(View v) {
        TextView tv = (TextView) findViewById(R.id.User_Input);
        String s = tv.getText().toString();
        s += "/";
        tv.setText(s);
        return s;
    }

    protected String addExponentSign(View v) {
        TextView tv = (TextView) findViewById(R.id.User_Input);
        String s = tv.getText().toString();
        s += "^";
        tv.setText(s);
        return s;
    }

    protected String addOpenParen(View v) {
        TextView tv = (TextView) findViewById(R.id.User_Input);
        String s = tv.getText().toString();
        s += "(";
        tv.setText(s);
        return s;
    }

    protected String clear(View v) {
        TextView tv = (TextView) findViewById(R.id.User_Input);
        String b = "";
        tv.setText(b);
        return b;
    }

    protected String logs(View v) {
        TextView tv = (TextView) findViewById(R.id.User_Input);
        String b = tv.getText().toString(); ;
        int c = 0;
        b += "log";
        tv.setText(b);
        return b;
    }

    protected String sqrt(View v) {
        TextView tv = (TextView) findViewById(R.id.User_Input);
        String b = tv.getText().toString(); ;
        int c = 0;
        b += "sqrt";
        tv.setText(b);
        return b;
    }

    protected String addEndParen(View v) {
        TextView tv = (TextView) findViewById(R.id.User_Input);
        String s = tv.getText().toString();
        s += ")";
        tv.setText(s);
        return s;
    }

    protected float add(float num, float num2) {
        float result = num + num2;
        return result;
    }

    protected float subtract(float num, float num2) {
        float result = num - num2;
        return result;
    }

    protected float multiply(float num, float num2) {
        float result = num * num2;
        return result;
    }

    protected float divide(float num, float num2) {
        float result = num / num2;
        return result;
    }


    protected Double exponentiation(Double num, Double num2) {
        Double result = Math.pow(num, num2);
        return result;
    }
}
