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
        TreeSet<String> temp = new TreeSet<>();
        try{
            bufferedReader = new BufferedReader(new FileReader(fileName));
            String line = "";
            while((line=bufferedReader.readLine())!=null){
                temp.add(line);
            }
        }catch (IOException ex){
            System.out.println("Error!");
        }
        nameSet = (TreeSet<String>) temp.descendingSet();
        bufferedReader.close();

    }




    @Override
    public String toString() {
        String returnString = "";
        for(String strg : nameSet){
            returnString += strg + "\n";
        }
        return returnString;
    }

    public void getFirst(){
        System.out.println("First element: "+nameSet.first());
    }

    public void getLast(){
        System.out.println("Last element: "+nameSet.last());
    }

    public void getSize(){
        System.out.println("Set size: "+nameSet.size());
    }
}
