package ua.lpnuai.oop.peleshchak8;

class Help implements Command {
    @Override
    public void execute() {
        System.out.println("Help instruction:\n" +
                "a: input text message;\n" +
                "v: view typed text message;\n" +
                "c: operating with text message;\n" +
                "r: get result;\n" +
                "x: exit program.");
    }
}
