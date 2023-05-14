package jour02.job08;

import java.util.Scanner;

public class job08 {
    public static void main(String[] args) {
        Scanner myObject = new Scanner(System.in);
        System.out.println("Entrer votre nombre : ");
        String numero = myObject.nextLine();
        int num = numero.length();
        System.out.println("Il y a " + num + " chiffres dans le nombre " + num);
    }
}
