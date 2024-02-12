package Experiment;

public class Kalkulyator {

    public int add(int a, int b){
        return a + b;
    }

    public double add(double a, double b){
        return a + b;
    }


    public static void main(String[] args) {
        Kalkulyator k1 = new Kalkulyator();
        System.out.println(k1.add(2, 5));

        System.out.println(k1.add(2.5, 3.5));
    }
}
