package person;
class Person02 {
    String name;
    String id;

    public Person02(String name) {
        this.name = name;
    }
}
class Student02 extends Person02 {
    String grade;
    String department;

    public Student02(String name) {
        super(name);
    }
}
public class UpcastingTest {
    public static void main(String[] args) {
        //유도리 있는 프로그램을 만들기 위해서 사용한다.
        Person02 person02;
        Student02 student02 = new Student02("장성호");
        person02 = student02;
        System.out.println(person02.name);

        Person02 person = new Student02("장동건");
        Student02 student;
        student = (Student02) person;
    }
}
