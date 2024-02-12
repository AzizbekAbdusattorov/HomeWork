package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Aaa", 20, "asd");
//        p1.setName("Azizbek");
        System.out.println(p1.getName());

//        p1.setAge(20);
        System.out.println(p1.getAge());

//        p1.setGender("M");
        System.out.println(p1.getGender());


    }
}
