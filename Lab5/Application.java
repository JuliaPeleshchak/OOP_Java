package com.tasks5.command;
import java.util.Arrays;

public class Application {
    public static void main(String[] args){
        //YOUR CODE COMES HERE
        Command command;

        if (args == null || args.length == 0)
        {
            command = new Echo("Error");
        }

        else if (args[0].equals("help") && args.length == 1)
        {
            command = new Help();
        }

        else if (args[0].equals("exit") && args.length == 1)
        {
            command = new Exit();
        }

        else if (args[0].equals("date")  && args[1].equals("now") && args.length == 2)
        {
            command = new DateNow();
        }

        else if (args[0].equals("echo") && args.length == 2)
        {
            command = new Echo(args[1]);
        }

        else
        {
            command = new Echo("Error");
        }

        command.execute();
    }
}
