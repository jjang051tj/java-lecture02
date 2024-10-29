package problem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem1102 {
    public static void main(String[] args) {
        Path path = Path.of("temp/word.txt");
        List<String> words = new ArrayList<>();


        try {
            words = Files.readAllLines(path);
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
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
