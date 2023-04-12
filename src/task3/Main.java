package task3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new FileReader("C:\\Users\\SERGEI\\IdeaProjects\\Homework_04_11\\src\\task3\\nameAge"));
        String c;
        TreeMap<Integer,String> treeMap =new TreeMap<>();
        


        while ((c = buff.readLine())!=null){
            String [] words = c.split(", ");
                   for(String word : words) {
                       int age = 0;
                       if (word.length() < 3){
                       age = Integer.parseInt(word);}
                       treeMap.put(age, word);
                       System.out.println(word);

                   }




        }
        System.out.println(treeMap);

       }
    }

