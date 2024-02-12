package abstraction;

public class Student extends Person{

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public int showInfo(int a) {
        System.out.println(getAge());
        System.out.println(getName());

        return a;
    }
}
