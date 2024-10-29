package person;

class Person {}
class Student extends Person {}
class Researcher extends Person {}
class Professor extends Researcher {}

public class InstanceTest {
    public static void instanceTest(Person person) {
        if(person instanceof Person) {
            System.out.println("사름은 사람입니다.");
        }
        if(person instanceof Student) {
            System.out.println("학생은 사람입니다.");
        }
        if(person instanceof Researcher) {
            System.out.println("연구자는 사람입니다.");
        }
        if(person instanceof Professor) {
            System.out.println("교수는 사람입니다.");
        }
    }
    public static void main(String[] args) {
        Student student = new Student();
        Person person = new Person();
        Researcher researcher = new Researcher();
        Professor professor = new Professor();
        instanceTest(professor);
        //instanceTest(student);
        //instanceTest(researcher);
//        if(person instanceof Person) {
//            System.out.println("사름은 사람입니다.");
//        }
//        if(student instanceof Person) {
//            System.out.println("학생은 사람입니다.");
//        }
//        if(researcher instanceof Person) {
//            System.out.println("연구자는 사람입니다.");
//        }
//        if(professor instanceof Person) {
//            System.out.println("교수는 사람입니다.");
//        }
    }
}