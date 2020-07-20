package app;

import io.ReadFile;

import java.io.IOException;

public class TreeSetClass {
    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile();
        System.out.println(readFile);
        readFile.getFirst();
        readFile.getLast();
        readFile.getSize();
    }
}
