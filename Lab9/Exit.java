package ua.lpnuai.oop.peleshchak9;

class Exit implements Command{
    @Override
    public void execute() {
        System.out.println("The program successfully closed");
    }
}
