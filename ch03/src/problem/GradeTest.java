package problem;

public class GradeTest {
    public static void main(String[] args) {
        Grade myGrade = new Grade(83,92,88);
        double avg = myGrade.average();
        System.out.println(avg);
    }
}
