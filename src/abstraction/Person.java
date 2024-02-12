package abstraction;

public abstract class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract int showInfo(int a);

    public void print(){
        System.out.println("This is method PRINT:");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
