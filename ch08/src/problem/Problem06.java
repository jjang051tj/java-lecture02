package problem;

import jdk.dynalink.StandardOperation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;

public class Problem06 {
    public static void main(String[] args) {
        Path file01 = Path.of("temp/elvis01.txt");
        Path file02 = Path.of("temp/elvis02.txt");
        Path append = Path.of("temp/append.txt");
        try {
            Files.write(append,Files.readAllBytes(file01));
            Files.write(append,Files.readAllBytes(file02), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
