public class ClassTest {
    public static void main(String[] args) {
        //학생 이름 나이 성적
//        String name = "장성호";
//        int age = 20;
//        int grade = 90;
//
//        String name02 = "장성호";
//        int age02 = 20;
//        int grade02 = 90;

        Student student01 = new Student();
        Student student02 = new Student();
        student01.name = "장성호";
        student01.age = 20;
        student01.grade = 90;

        student02.name = "장동건";
        student02.age = 30;
        student02.grade = 80;


        //찹조값
        Student student03 = student01;
        student03.name = "정형돈";
        System.out.println(student03.name);
        System.out.println(student01.name);
        System.out.println(student01 == student03);
        System.out.println(student01);
        System.out.println(student03);


        student01.sayHello();


        int num = 10;
        int copyNum = num; // 자바는 변수의 값을 복사해서 대입한다.
        //int copyNum = 10;
        copyNum += 10;
        num += 5;
        System.out.println(copyNum);
        System.out.println(num);

        int aa = 10;
        System.out.println(aa);
        Student student04 = new Student(); //아무것도 없다 0
        //객체에 찹조값이 없다.
        System.out.println(student04.age);
        System.out.println(student04.isAdult);
        System.out.println(student04.name);
        System.out.println(student04.ch);
        //GC

        int width=5;
        int height=8;
        //넓이, 둘레, 정사각형인지 알고 싶다.
    }
}
