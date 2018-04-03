package ua.lpnuai.oop.peleshchak8;

class Exit implements Command{
    @Override
    public void execute() {
        System.out.println("The program successfully closed");
    }
}
