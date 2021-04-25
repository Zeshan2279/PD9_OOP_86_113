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
        Scanner cin=new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=cin.nextLine();
        if(isAlpha(s)){
            System.out.println("Given String is only alphabetic");
        }else{
            System.out.println("Given String is not only alphabetic");
        }
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
}
