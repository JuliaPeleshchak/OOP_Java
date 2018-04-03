package ua.lpnuai.oop.peleshchak8;

class Result implements Command {
    public static long loud_count;
    public static long cons_count;
    public String text;

    Result() throws Exception {
        try {
            this.text = new Add().getText();
            this.loud_count = new Count(new Add().getText()).getloud_count();
            this.cons_count = new Count(new Add().getText()).getcons_count();
        } catch (Exception e) {
            System.out.println("You haven't write your text message yet. Press 'A' to add a text.");
        }
    }

    @Override
    public void execute() {
        System.out.println("Loud:        " + loud_count);
        System.out.println("Consonant:   " + cons_count);
    }
}