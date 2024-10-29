public class CCC extends BBB {
    public CCC() {
        //생성자 함수 안에서 자동으로 super(); 즉 부모 생성자를 호출한다.
        // 이때 만약 임의 super(); 생략하면 자동으로 빈 부모 생성자를 호출한다.
        // 이때 만약 빈 부모생성자가 없으면 오류가 난다.
        super();
        System.out.println("생성자 CCC");

    }
}
