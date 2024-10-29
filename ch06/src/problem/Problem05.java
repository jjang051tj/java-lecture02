package problem;

import java.util.ArrayList;
import java.util.Scanner;


public class Problem05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student("장성호","java",1,4.25));
        arrayList.add(new Student("장동건","html",2,3.25));
        arrayList.add(new Student("정형돈","css",3,2.25));
        arrayList.add(new Student("유재석","javascript",4,1.25));
        while(true) {
            String name = scanner.nextLine();
            if(name.equals("그만")) break;
            for(int i=0;i<arrayList.size();i++) {
                Student student = arrayList.get(i);
                if(name.equals(student.getName())){
                    System.out.println(student.getName()+","+student.getDepartment()+","+student.getId()+","+student.getScore());
                }
            }
        }
        //
    }
}
