package jour1.job1;

import java.util.Scanner;

public class job1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello World!");
        System.out.println("Veuillez saisir votre nom et prénom : ");
        String nom = input.next(), prenom = input.next();
        System.out.println("Hello " + prenom + " " + nom + " !");
    }
}

