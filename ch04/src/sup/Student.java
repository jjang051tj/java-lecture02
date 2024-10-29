package sup;

public class Student extends Person {
    public void set() {
        this.age = 30;       //default는 같은 패키지 내에 있으면 상속 가능
        this.height = 180;   // protected는 부모로부터 상속받으면 다른 패키지여도 상속 가능
        this.name = "장성호"; // public는 아무데나 상속 가능
        this.setWeight(80);  // private은 상속 불가능 get/set을 만들어서 사용
    }
}
