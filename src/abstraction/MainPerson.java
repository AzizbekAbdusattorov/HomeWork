package abstraction;

public class MainPerson {
    public static void main(String[] args) {
        Student student = new Student("Azizbek", 20);
        System.out.println(student.showInfo(111));
        student.print();
    }
}
