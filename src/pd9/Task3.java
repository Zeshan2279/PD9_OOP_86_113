/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd9;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Task3 {

    static String ridMultipleBlank(String s) {
        StringBuilder strBuild = new StringBuilder();
        int spaceCheck = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                strBuild.append(s.charAt(i));
                spaceCheck = 0;
            } else {
                spaceCheck++;
            }
            if (spaceCheck == 1) {
                strBuild.append(' ');
            }
        }

        return strBuild.toString();
    }
    static String removeInteger(String s){
        String remove=" ";
        char c=' ';
        for (int y=0;y<s.length();y++)
        {
            if((s.charAt(y)<='9' && s.charAt(y)>='0' ))
            {
            }
            else{
            remove+=s.charAt(y);  }
         
        }
       
        return remove;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("InputString: (To Remove Spaces) ");
        String S = cin.nextLine();
        System.out.println(ridMultipleBlank(S));
        System.out.println("\n  InputString: (To Remove Integers)\n ");
        String Int = cin.nextLine();
        System.out.println(removeInteger(Int));

    }

    private static String toString(char charAt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
