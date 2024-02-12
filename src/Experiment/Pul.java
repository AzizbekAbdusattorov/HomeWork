package Experiment;

import java.util.Objects;
import java.util.Scanner;

public class Pul implements Comparable<Pul>{
    @Override
    public int compareTo(Pul o) {
        return Integer.valueOf(o.name).compareTo(this.name);
    }

    private int name;
    private int amount;

    public Pul(int name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        this.amount += amount;
    }

    public int getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public Pul(int name, int amount) {
        this.name = name;
        this.amount = amount;

        while (this.amount % (this.name * 1000) != 0) {
            Scanner in = new Scanner(System.in);
            System.out.println("Xato kiritildi: ");
            System.out.println("Name: ");
            int a = in.nextInt();
            System.out.println("Amount: ");
            int b = in.nextInt();

            this.name = a;
            this.amount = b;
        }
    }

    @Override
    public String toString() {
        return "Pul{" +
                "name=" + name +
                ", amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pul pul = (Pul) o;
        return name == pul.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount);
    }
}
