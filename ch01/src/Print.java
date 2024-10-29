public class Print {
    public static void main(String[] args) {
        String myName = "장성호";
        int age = 30;
        double height = 181.7;
        System.out.println("나의 이름은 "+myName+"이고 나이는 "+age+"이고 키는 "+height+"입니다.");
        //System.out.printf("나의 이름은 %s 이고 나이는 %d이고 키는 %f입니다.",myName,age,height);
        System.out.printf("나의 이름은 %s이고 나이는 %d이고 키는 %3.1f입니다.",myName,age,height);
        //객체를 만들어서 입력해야함...
    }
}
