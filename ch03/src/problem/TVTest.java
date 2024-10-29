package problem;

public class TVTest {
    public static void main(String[] args) {
//        TV myTv = new TV("LG",2024,72);
//        myTv.show();

        Grade myGrade = new Grade(83,92,88);
        double avg = myGrade.average();
        System.out.println(avg);
    }
}
