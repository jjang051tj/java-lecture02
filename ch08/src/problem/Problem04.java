package problem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        File file = new File("temp/system.ini");
        try {
            FileReader fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);
            int i=1;
            while (scanner.hasNext()) {
                String line = i +" : "+ scanner.nextLine();
                System.out.println(line);
                i++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
