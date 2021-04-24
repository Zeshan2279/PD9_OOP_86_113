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

    /**
     * @param args the command line arguments
     */
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
    public static void main(String[] args) {
        Scanner cin= new Scanner(System.in);
        System.out.println("InputString: (To Remove Spaces)\n ");
        String S=cin.nextLine();
        System.out.println(ridMultipleBlank(S));
        
        
    }

    private static String toString(char charAt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
