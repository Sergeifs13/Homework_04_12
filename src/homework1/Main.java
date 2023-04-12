package homework1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new FileReader("C:\\Users\\SERGEI\\IdeaProjects\\Homework_04_11\\src\\homework1\\text"));
        String c;
        while ((c = buff.readLine())!=null){
            System.out.print(c+" ");
        }

    }
    // OUTPUT: aaa bbbbbb cc


}
