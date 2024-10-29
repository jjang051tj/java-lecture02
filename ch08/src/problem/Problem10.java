package problem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        File file = new File("temp/phone.txt");
        Map<String,String> phoneBook =  new HashMap<>();

        try {
            FileReader fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNext()) {

                String key = scanner.next();
                String value =  scanner.next();
                phoneBook.put(key, value);
            }
            scanner.close();
            System.out.println(phoneBook.size()+"개의 전화번호가 있습니다. 이름을 입력하면 전화번호를 알려드립니다.");
            Scanner inputScanner = new Scanner(System.in);
            while(true) {
                System.out.print("이름 : ");
                String name = inputScanner.next();
                if(name.equals("그만")) break;
                String tel =  phoneBook.get(name);
                if(tel==null) System.out.println("없는 사람입니다.");
                else System.out.println(tel);
            }
            inputScanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
