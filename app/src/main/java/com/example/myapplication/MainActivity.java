package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected String addDecimal(View v) {
        TextView tv = (TextView) findViewById(R.id.User_Input);
        String s = tv.getText().toString();
        if (s.length() == 7) {
            return s;
        }
        s += ".";
        tv.setText(s);
        return s;
    }



    protected String add4(View v) {
        TextView tv = (TextView) findViewById(R.id.User_Input);
        String s = tv.getText().toString();
        if (s.length() == 7) {
            return s;
        }
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
        if (s.length() == 7) {
            return s;
        }
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
        if (s.length() == 7) {
            return s;
        }
        s += "*";
        tv.setText(s);
        return s;
    }

    protected String divisionSign(View v) {
        TextView tv = (TextView) findViewById(R.id.User_Input);
        String s = tv.getText().toString();
        if (s.length() == 7) {
            return s;
        }
        s += "/";
        tv.setText(s);
        return s;
    }

    protected String addExponentSign(View v) {
        TextView tv = (TextView) findViewById(R.id.User_Input);
        String s = tv.getText().toString();
        if (s.length() == 7) {
            return s;
        }
        if (s.length() == 7) {
            return s;
        }
        s += "^";
        tv.setText(s);
        return s;
    }

    protected String addOpenParen(View v) {
        TextView tv = (TextView) findViewById(R.id.User_Input);
        String s = tv.getText().toString();

        if (s.length() == 7) {
            return s;
        }
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
    protected double sqrtNum(float num) {
        double result = Math.sqrt((num));
        return result;
    }

    protected Double exponentiation(Double num, Double num2) {
        Double result = Math.pow(num, num2);
        return result;
    }
}
