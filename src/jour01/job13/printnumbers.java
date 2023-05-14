package jour01.job13;

import java.util.Scanner;

public class printnumbers {
    public static void main(String[] args){
        Scanner myObject = new Scanner(System.in);
        System.out.println("Entrer un nombre : ");
        int num  = myObject.nextInt();
        for (int i = 1; i <= num; ++i){
           System.out.println(i);
        }
    }
}
