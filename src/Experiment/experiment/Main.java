package Experiment.experiment;

public class Main {
    public static void main(String[] args) {

        My_ArrayList<Integer> m1 = new My_ArrayList<>();
        m1.add(1);
        m1.add(2);
        m1.add(3);

        System.out.println(m1);
        System.out.println(m1.size());
        System.out.println(m1.getCapasity());

        System.out.println();

        My_ArrayList<String> m2 = new My_ArrayList<>();
        m2.add("a");
        m2.add("b");
        m2.add("c");

        System.out.println(m2);
        System.out.println(m2.size());
        System.out.println(m2.getCapasity());

        System.out.println();

        System.out.println(m2.addAll(m1));

        System.out.println();

        System.out.println(m1);
        System.out.println(m2);
    }
}
