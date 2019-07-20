package com.company;

import java.io.File;
import java.util.Scanner;

public class WordCount {

    public static void main(String[] arg)throws Exception {
        File file = new File("test.txt");
        Scanner scanner  = new Scanner(file);
        int words = 0;
        while(scanner.hasNextLine()){
            String line  = scanner.nextLine();
            words = (line.split(" ").length);

            }
        System.out.println("It is " + words + " words");


    }
}
