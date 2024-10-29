//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void hello() {
        System.out.println("hello");
    }

    public static int getAge(int age) {
        return age;
    }

    public static void addTwoNum(int a, int b) {
        System.out.println(a + b);
    }

    public static int addTwoNum02(int a, int b) {
        //System.out.println(a+b);
        return a + b;
    }

    public static void divide(int a, int b) {
        if (b == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return;
        }
        System.out.println(a / b);
    }
    public static void main(String[] args) {
        hello();
        int myAge = getAge(20);
        addTwoNum(10, 20);
        System.out.println(addTwoNum02(10, 20));
        //예상 가능한 오류들은 처리해두는게 좋다.
        divide(100, 0);
        for(int i=0;i<10;i++) {
            if(i==5) continue;
            System.out.print(i);
        }
        System.out.println();
        System.out.println("======");
        for(int i=0;i<10;i++) {
            if(i==5) break;
            System.out.print(i);
        }
    }
}