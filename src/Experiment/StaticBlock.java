package Experiment;

public class StaticBlock {
    static int x;
    static int y;

    static {
        x = 10;
        y = 5;

        System.out.println("Static block ishga tushdi");
    }

    public static void main(String[] args) {
        System.out.println("Main metod boshlandi: ");

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
