package homework2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new FileReader("C:\\Users\\SERGEI\\IdeaProjects\\Homework_04_11\\src\\homework1\\text"));
        String c;
        List<String> str1 = new ArrayList<>();

        String max = null;
        while ((c = buff.readLine()) != null) {
            str1.add(c);

        }
        max = Collections.max(str1, Comparator.comparing(s -> s.length()));

        System.out.println(max);
// OUTPUT : bbbbbb

    }
}
