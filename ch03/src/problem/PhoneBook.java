package problem;

import java.util.Scanner;

public class PhoneBook {
    Phone phoneList[];
    Scanner scanner = new Scanner(System.in);

    public void input() {
        System.out.print("인원수 >>");
        int num = scanner.nextInt();
        phoneList = new Phone[num]; // 3
        for (int i = 0; i < num; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력) >> ");
            String name = scanner.next();
            String tel = scanner.next();
            phoneList[i] = new Phone(name, tel); //객체 배열
        }
        System.out.println(num + "명의 전화번호가 입력되었습니다.");
    }

    public String search(String name) {
        //검색 로직
//       phoneList[0] = new Phone("장성호","010-1111-1111");
//       phoneList[1] = new Phone("장동건","010-1111-2222");
//       phoneList[2] = new Phone("정형돈","010-1111-3333");
        for (int i = 0; i < phoneList.length; i++) {
            Phone phone = phoneList[i];
            if (phone.getName().equals(name)) {
                return phone.getTel();
            }
        }
        return null;
    }

    public void run() {
        input();
        while(true) {
            System.out.print("검색할 이름 >> ");
            String searchName = scanner.next();
            String searchNumber = search(searchName);
            if(searchName.equals("끝") || searchName.equals("그만")) {
                System.out.println("종료합니다.");
                return;
            }
            if(searchNumber==null) {
                System.out.println("검색결과가 없습니다");
            } else {
                System.out.println(searchName+"님의 전화번호는 "+searchNumber+"입니다.");
            }
        }

    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.run();
    }
}
