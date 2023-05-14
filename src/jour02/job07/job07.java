package jour02.job07;

import java.util.Scanner;

public class job07 {
    public static void main(String[] args){
        Scanner myObject = new Scanner(System.in);
        System.out.println("Entrer votre nombre : ");
        int num = myObject.nextInt();
        int x = 1;
        for (int i = 1; i <= num; ++i){
            x = x*i;
        }
        System.out.println("La factorielle de " + num + " est de " + x);
    }
}
