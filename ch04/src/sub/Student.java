package sub;

import sup.Person;

public class Student extends Person {
    public void set() {
        this.height = 180;
        this.name = "장성호";
        //this.age = 30; //다른 패키지여서 상속 불가능
    }
}
