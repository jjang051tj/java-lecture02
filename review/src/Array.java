import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int student1 = 90;
        int student2 = 50;
        int student3 = 60;
        int student4 = 70;
        int student5 = 40;

        int[] students  = new int[5];
        students[0] = 90;
        students[1] = 50;
        students[2] = 60;
        students[3] = 70;
        students[4] = 40;
        //heap 참조
        int[] studetns02 = {90,50,60,70,40};
        /*
        int[] studetns03;
        studetns03 = {90,50,60,70,40};
        이렇게 못씀
        */
        for(int i=0;i<students.length;i++) {
            System.out.print(students[i]+"\t");
        }
        for(int student: students) {
            System.out.print(student+"\t");
        }
        System.out.println();
        System.out.println(Arrays.toString(students));
    }
}
