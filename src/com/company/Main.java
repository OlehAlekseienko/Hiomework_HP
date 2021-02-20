package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("C:\\Users\\Java02\\Downloads\\Harry.txt")));
        System.out.println(content.length() + " - дожина усього тексту ");
        content = content.replaceAll("[^A-Za-z ]", "");
        System.out.println(content.length() + " - без мусора");
        String[] words = content.split(" +");
        System.out.println(words.length);
        System.out.println(words[99] + " " + words[100] + " " + words[101]);
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            //System.out.println("" + i + "." + " " + ((char) i ));
            if (words[i].charAt(0) == 'A'){
                System.out.println(words[i]);
                counter++;
            }
        }
        System.out.println(counter + " - кількість слів довжиною в 3 букви");
        System.out.println(words.length);
        System.out.println(content.substring(0,400));
        Arrays.sort(words);
        for (int i = 0; i < 4515; i++) {
           // System.out.println(words[i]);
        }
    }
}