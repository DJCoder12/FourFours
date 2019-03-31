package com.example.myapplication;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

public class shuntingYard {

    private enum Operator
    {
        ADD(1), SUBTRACT(2), MULTIPLY(3), DIVIDE(4);
        final int precedence;
        Operator(int p) { precedence = p; }
    }

    private static Map<String, Operator> ops = new HashMap<String, Operator>() {{
        put("+", Operator.ADD);
        put("-", Operator.SUBTRACT);
        put("*", Operator.MULTIPLY);
        put("/", Operator.DIVIDE);
    }};

    private static boolean isHigerPrec(String op, String sub)
    {
        return (ops.containsKey(sub) && ops.get(sub).precedence >= ops.get(op).precedence);
    }

    public static ArrayList postfix(ArrayList infix)
    {
        //StringBuilder output = new StringBuilder();
        ArrayList output = new ArrayList();
        Deque<String> stack  = new LinkedList<>();

        for (Object otoken : infix) {
            String token = otoken.toString();
            // operator
            if (ops.containsKey(token)) {
                while ( ! stack.isEmpty() && isHigerPrec(token, stack.peek()))
                    output.add(stack.pop());
                stack.push(token);

                // left parenthesis
            } else if (token.equals("(")) {
                stack.push(token);

                // right parenthesis
            } else if (token.equals(")")) {
                while ( ! stack.peek().equals("("))
                    output.add(stack.pop());
                stack.pop();

                // digit
            } else {
                output.add(token);
            }
        }

        while ( ! stack.isEmpty())
            output.add(stack.pop());

        return output;
    }


    /*public static ArrayList shuntingYard(ArrayList infix){
        //convert from infix to postfix
        ArrayList post = new ArrayList();

        *//* To find out the precedence, we take the index of the
           token in the ops string and divide by 2 (rounding down).
           This will give us: 0, 0, 1, 1, 2 *//*
        final String ops = "-+/*^";

        Stack<Double> s = new Stack<>();

        for(Object otoken : infix){
            String token = otoken.toString();
            if(token.isEmpty()){
                continue;
            }
            char c = token.charAt(0);
            int idx = ops.indexOf(c);

            if(idx != -1){
                if(s.isEmpty()){
                    s.push(new Double(idx));
                }
                else{
                    while(!s.isEmpty()){
                        int prec2 = s.peek()/2;

                    }
                }
            }
        }*/
/*
        return post;
    }*/

    public static void main(String[] args){}
}
