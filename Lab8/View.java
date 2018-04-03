package ua.lpnuai.oop.peleshchak8;

class View implements Command{
    private static String text;

    View(String mes){
        this.text = mes;
    }

    @Override
    public void execute() {
        if(text == null || text == "")
            System.out.println("You haven't write your text. Press 'a' to add a text.");
        else
            System.out.println("Your text: " + text);
    }
}

