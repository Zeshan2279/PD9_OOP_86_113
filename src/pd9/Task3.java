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
    static String stringEncryption(String s)
    {
        String tion="";
        char q=' ';
        for (int i=0;i<s.length();i++)
        {
            q=s.charAt(i);
            switch(q)
            {
                case 'A':
                    tion=tion+"!";
                    break;
                case 'B':
                    tion=tion+"@";
                    break;
                case 'C':
                    tion=tion+"#";
                    break;   
                case 'D':
                    tion=tion+"$";
                    break;   
                case 'E':
                    tion=tion+"%";
                    break;   
                case 'F':
                    tion=tion+"^";
                    break;   
                case 'G':
                    tion=tion+"&";
                    break; 
                case 'H':
                    tion=tion+"(";
                    break;   
                case 'I':
                    tion=tion+")";
                    break;   
                case 'J':
                    tion=tion+"_";
                    break;   
                case 'K':
                    tion=tion+"+";
                    break;   
                case 'L':
                    tion=tion+"=";
                    break;   
                case 'M':
                    tion=tion+"-";
                    break;   
                case 'N':
                    tion=tion+"0";
                    break;   
                case 'O':
                    tion=tion+"9";
                    break;   
                case 'P':
                    tion=tion+"8";
                    break;   
                case 'Q':
                    tion=tion+"7";
                    break;   
                case 'R':
                    tion=tion+"6";
                    break;   
                case 'S':
                    tion=tion+"5";
                    break;   
                case 'T':
                    tion=tion+"4";
                    break;   
                case 'U':
                    tion=tion+"3";
                    break;   
                case 'V':
                    tion=tion+"2";
                    break;   
                case 'W':
                    tion=tion+"1";
                    break;   
                case 'X':
                    tion=tion+"`";
                    break;   
                case 'Y':
                    tion=tion+"~";
                    break;   
                case 'Z':
                    tion=tion+"{";
                    break;   
                case 'a':
                    tion=tion+"}";
                    break;   
                case 'b':
                    tion=tion+"|";
                    break;   
                case 'c':
                    tion=tion+":";
                    break;   
                case 'd':
                    tion=tion+"'";
                    break;   
                case 'e':
                    tion=tion+"<";
                    break;   
                case 'f':
                    tion=tion+">";
                    break;   
                case 'g':
                    tion=tion+"?";
                    break;   
                case 'h':
                    tion=tion+"[";
                    break;   
                case 'i':
                    tion=tion+"]";
                    break;   
                case 'j':
                    tion=tion+";";
                    break;   
                case 'k':
                    tion=tion+"'";
                    break;   
                case 'l':
                    tion=tion+",";
                    break;   
                case 'm':
                    tion=tion+".";
                    break;   
                case 'n':
                    tion=tion+"/";
                    break;   
                case 'o':
                    tion=tion+"1!";
                    break;   
                case 'p':
                    tion=tion+"2@";
                    break;   
                case 'q':
                    tion=tion+"3#";
                    break;   
                case 'r':
                    tion=tion+"4$";
                    break;   
                case 's':
                    tion=tion+"5%";
                    break;   
                case 't':
                    tion=tion+"6^";
                    break;   
                case 'u':
                    tion=tion+"7&";
                    break;   
                case 'v':
                    tion=tion+"8*";
                    break;   
                case 'w':
                    tion=tion+"9(";
                    break;   
                case 'x':
                    tion=tion+"1`";
                    break;   
                case 'y':
                    tion=tion+"1~";
                    break;   
                case 'z':
                    tion=tion+"2-";
                    break;   
                case '1':
                    tion=tion+"3_";
                    break;   
                case '2':
                    tion=tion+"4+";
                    break;   
                case '3':
                    tion=tion+"5[";
                    break;   
                case '4':
                    tion=tion+"6]";
                    break;   
                case '5':
                    tion=tion+"7|";
                    break;   
                case '6':
                    tion=tion+"8;";
                    break;   
                case '7':
                    tion=tion+"9'";
                    break;   
                case '8':
                    tion=tion+"~`";
                    break;   
                case '9':
                    tion=tion+"!@";
                    break;   
                case ';':
                    tion=tion+"a";
                    break;   
                case ',':
                    tion=tion+"b";
                    break;   
                case '<':
                    tion=tion+"c";
                    break;   
                case '>':
                    tion=tion+"d";
                    break;   
                case '/':
                    tion=tion+"e";
                    break;   
                case '.':
                    tion=tion+"f";
                    break;   
                case '?':
                    tion=tion+"g";
                    break;   
                case ':':
                    tion=tion+"h";
                    break;   
                case '"':
                    tion=tion+"i";
                    break;   
                case '&':
                    tion=tion+"j";
                    break;   
                case '@':
                    tion=tion+"k";
                    break;   
                case '%':
                    tion=tion+"l";
                    break;   
                default:
                    tion+= +q;                    
                    
                    
                
                  
                    
            
            
            }
        
        
        
        
        }
       
        return tion;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("InputString:(To Remove Spaces) ");
        String S = cin.nextLine();
        System.out.println(ridMultipleBlank(S));
        System.out.println("InputString:(To Remove Integers)\n ");
        String Int = cin.nextLine();
        System.out.println(removeInteger(Int));
        System.out.println("InputString:(For Encryption)\n ");
        String En = cin.nextLine();
        System.out.println(stringEncryption(En));
    }

    private static String toString(char charAt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
