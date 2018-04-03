package ua.lpnuai.oop.peleshchak8;
import java.util.Scanner;

class Add implements Command{
    private Scanner s = new Scanner(System.in);
    private static String text = "";

    @Override
    public void execute() {
        System.out.println("Your text: ");
        this.text = s.nextLine();
        System.out.println("Input 'c' to operate with text  or  'v' to see your data.");
    }

    public String getText() {
        return text;
    }
}
