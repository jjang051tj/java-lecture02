class Animal {
    public String bark() {
        return  "동물이 짖습니다.";
    }
}
//class Dog extends Animal {
//    @Override
//    public String bark() {
//        return "멍멍이가 짖습니다.";
//    }
//}
class Zoo {
    public void method(Animal dog) {
        dog.bark();
    }
}
public class AnonymousClass {
    public static void main(String[] args) {
//        Animal animal = new Dog();
//        System.out.println(animal.bark());
        // 익명클래스 이름없는 클래스  클래스의 정의와 생성을 동시에 일회용
        Animal dog = new Animal() {
            @Override
            public String bark() {
                return "멍멍이가 짖습니다.";
            }
            public String run() {
                return "멍멍이가 달립니다.";
            }
        };
        Zoo zoo = new Zoo();

        zoo.method(new Animal() {
            @Override
            public String bark() {
                return "멍멍이가 짖습니다.";
            }
        });
        dog.bark();


        // 스윙 GUI
        // 한번만 사용하는 일회용 클래스
        // 부모클래스에 있는 메서드만 사용가능 override된 메서드의 내용 변경을 통한 사용은 가능
    }
}
