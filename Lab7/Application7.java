package com.tasks7.rpn;

import java.util.Deque;
import java.util.LinkedList;

public class Application7 {

    public static double parse(String rpnString) {
        Deque<Double> deque = new LinkedList<>();
        StringBuilder str = new StringBuilder("");

        rpnString = rpnString.trim();

        for (int i = 0; i < rpnString.length(); i++)
        {
            char c = rpnString.charAt(i);

            if ((c >= '0' && c <= '9') || c  == '.' || (c == '-' && i != rpnString.length() - 1 && rpnString.charAt(i + 1) != ' '))
            {
                str.append(c);
            }

            else if (c == ' ')
            {
                if (str.length() > 0)
                {
                    deque.push(Double.valueOf(str.toString()));

                    str = new StringBuilder("");
                }
            }

            else if ( c  == '+' || c == '-' || c == '*' || c == '/')
            {
                Double first, second;
                try
                {
                    second = deque.pop();
                    first = deque.pop();
                }
                catch (Exception e)
                {
                    throw new RPNParserException();
                }

                switch (c)
                {
                    case '+':
                        deque.push(first + second);
                        break;

                    case '-':
                        deque.push(first - second);
                        break;

                    case '*':
                        deque.push(first * second);
                        break;

                    case '/':
                        if (second == 0)
                        {
                            throw new ArithmeticException();
                        }

                        deque.push(first / second);
                        break;
                }
            }

            else
            {
                throw new RPNParserException();
            }
        }

        if (deque.size() > 1)
        {
            throw new RPNParserException();
        }

        return deque.pop();
    }

    public static void main(String[] args) {
        String [] args1 = {"10 20 + 30 40 + *"};

        if((args == null || args.length != 1 || args[0] == null))
        {
            throw new RPNParserException();
        }

        System.out.println(" = " + Application7.parse(args1[0]));
        
    }

}