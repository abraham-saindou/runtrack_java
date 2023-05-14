package jour02.job09;

import java.util.Scanner;

public class job09 {
    public static void main(String[] args){
        String str = "1234";
        char first = str.charAt(0), last = str.charAt(str.length() - 1);
        System.out.println("Le premier chiffre de " + str + " est " + first);
        System.out.println("Le dernier chiffre de " + str + " est " + last);
    }
}
