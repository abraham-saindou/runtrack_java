package jour01.job10;

import java.util.Scanner;

public class identity {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Saisissez votre nom et prénom");

        String nom = myObj.nextLine(), prenom = myObj.nextLine();
        System.out.println("Ton nom est " + nom + " " + prenom);
    }
}
