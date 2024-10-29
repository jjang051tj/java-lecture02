package problem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        File file = new File("temp/word.txt");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);
            while(scanner.hasNext()) {
                words.add(scanner.nextLine());
            }
            scanner.close();
            //System.out.println(words.size());
            Scanner searchScanner = new Scanner(System.in);
            while(true) {
                System.out.print("찾을 단어를 입력하세요 : ");
                String searchWord = searchScanner.nextLine();
                if(searchWord.equals("그만")) break;
                for(int i=0;i<words.size();i++) {
                    String word =  words.get(i);
                    if(word.length()<searchWord.length()) continue;
                    String frontWord = word.substring(0,searchWord.length());
                    if(searchWord.equalsIgnoreCase(frontWord)) {
                        System.out.println(word);
                    }
                }
                System.out.println("찾는 단어가 없습니다.");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
