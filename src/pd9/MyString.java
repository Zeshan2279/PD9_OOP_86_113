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
public class MyString {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter String (Check if it is alphabetic): ");
        String s = cin.nextLine();
        if (isAlpha(s)) {
            System.out.println("Given String is only alphabetic");
        } else {
            System.out.println("Given String is not only alphabetic");
        }

        System.out.println("\nEnter String (to capitalize each word of sentence): ");
        s = cin.nextLine();
        System.out.println("Output: " + "\n" + capitalizeEachWord(s));
        
        System.out.println("\nEnter String (Toggle Case): ");
        s = cin.nextLine();
        System.out.println("Output: " + "\n" + toggleCase(s));
        System.out.println("\nEnter String (Digit Counter): ");
        s = cin.nextLine();
        System.out.println("Output: " + "\n" +"Number of digits are "+ DigitCounter(s));
        System.out.println("\nEnter String (Remove Speacial Characters): ");
        s = cin.nextLine();
        System.out.println("Output: "+ SpecialCharacterRemoval(s));
        
        
    }

    static boolean isAlpha(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || c == ' ')) {
                return false;
            }
        }
        return true;
    }

    static String capitalizeEachWord(String s) {
        String str = "";
        boolean flag = true;
        char c = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {

            if (flag) {
                str += Character.toUpperCase(c);
                flag = false;
            } else {
                str += c;
            }
            c = s.charAt(i);
            if (s.charAt(i - 1) == ' ') {
                flag = true;
            }
        }
        str += s.charAt(s.length() - 1);
        return str;
    }
    static String toggleCase(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c)) {
                result += Character.toUpperCase(c);
            } else if (Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else {
                result += c;
            }
        }
        return result;
    }
        static int DigitCounter(String s) {
       int count=0;
        for (int y = 0; y < s.length(); y++) {
            if ((s.charAt(y) <= '9' && s.charAt(y) >= '0'))
            {
                count += 1;
            }
        }

        return count;
    }
        static String SpecialCharacterRemoval(String s) {
        String remove = "";
        for (int y = 0; y < s.length(); y++) {
            if ((s.charAt(y) == '!' || s.charAt(y) == '@' ||s.charAt(y) == '#' || s.charAt(y) == '$'||s.charAt(y) == '%' || s.charAt(y) == '^'||s.charAt(y) == '&' || s.charAt(y) == '*'||s.charAt(y) == '(' || s.charAt(y) == ')'||s.charAt(y) == '_' || s.charAt(y) == '='||s.charAt(y) == '+' || s.charAt(y) == '-'||s.charAt(y) == '|' || s.charAt(y) == ':'||s.charAt(y) == '/' || s.charAt(y) == '~')) 
            {}
            else 
            {
                remove += s.charAt(y);
            }
        }

        return remove;
    }
}
