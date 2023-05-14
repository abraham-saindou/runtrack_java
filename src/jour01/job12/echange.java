package jour01.job12;

import java.util.Scanner;

public class echange {
    public static void main(String[] args) {
        Scanner myObject = new Scanner(System.in);
        System.out.println("Entrer deux mots : ");
        String s1 = myObject.nextLine(), s2 = myObject.nextLine();
        System.out.println("s1 = " + s1 + " s2 = " + s2);
        s1 = s1.concat(s2); // ajoute les 2 strings
        s2 = s1.substring(0, s1.length() - s2.length()); // s2 prend la valeur du resultat de la soustraction
        s1 = s1.substring(s2.length());
        System.out.println("s1 = " + s1 + " s2 = " + s2);

    }
}
