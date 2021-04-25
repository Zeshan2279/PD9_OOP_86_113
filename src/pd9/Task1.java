/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd9;

import java.util.Scanner;

/**
 *
 * @author YDRGZM
 */
public class Task1 {

    static int findSubString(String s, String sub) {
        int subLen = sub.length();
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            counter = 0;
            if (s.charAt(i) == sub.charAt(0)) {
                for (int j = 0; j < subLen; j++) {
                    if (s.charAt(i + j) == sub.charAt(j)) {
                        counter++;
                    } else {
                        counter--;
                    }

                }

            }
            if (counter == subLen) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = cin.nextLine();
        System.out.println("Number of words: " + wordCount(s));
        System.out.println("Number of vowels: " + vowelCounter(s));
        System.out.println("Number of punctuations: " + puncCount(s));
        System.out.println("Enter the String to search: ");
        String sub = cin.nextLine();
        if (findSubString(s, sub) == 1) {
            System.out.println(sub + " is a part of this string");
        } else {
            System.out.println(sub + " is not a part of this string");
        }
    }

    static int wordCount(String s) {
        int wCount = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                wCount++;
            }
        }
        return wCount;
    }

    static int vowelCounter(String s) {
        int vCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vCount++;
            } else {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vCount++;
                }
            }
        }
        return vCount;
    }

    static int puncCount(String s) {
        int pCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ',' || c == '.' || c == ':' || c == ';' || c == '!' || c == '-') {
                pCount++;
            }
        }
        return pCount;
    }

}
