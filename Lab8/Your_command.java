package ua.lpnuai.oop.peleshchak8;
import java.util.Scanner;

public class Your_command {
        public static void main(String[] args) throws Exception {
            new Menu().execute();
            Scanner s = new Scanner(System.in);
            String line = s.nextLine();
            while(!("x".equals(line))){
                if("-h".equals(line) || "help".equals(line))
                    new Help().execute();

                else if("a".equals(line))
                    new Add().execute();

                else if("v".equals(line))
                    new View(new Add().getText()).execute();

                else if("c".equals(line))
                    new Count(new Add().getText()).method();

                else if("r".equals(line))
                    new Result().execute();

                else
                    new Other().execute();
                System.out.print("New command: ");
                line = s.nextLine();
            }
            new Exit().execute();
        }

}
