package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class ReadFile {
    private BufferedReader bufferedReader;
    private TreeSet<String> nameSet;
    private static final String FILE_NAME = "namespl.txt";

    public ReadFile() throws IOException {
        nameSet = new TreeSet<>();

        readFile(FILE_NAME);

    }

    private void readFile(String fileName) throws IOException {
        try{
            bufferedReader = new BufferedReader(new FileReader(fileName));
            String line = "";
            while((line=bufferedReader.readLine())!=null){
                nameSet.add(line);
            }
        }catch (IOException ex){
            System.out.println("Error!");
        }
    }



}
