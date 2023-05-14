package jour02.job05;

import java.util.Scanner;

public class job05 {
    public static void main(String[] args) {
        Scanner myObject = new Scanner(System.in);
        System.out.println("Entrer votre âge : ");
        int age = myObject.nextInt();
        if (age < 17){
            System.out.println("Vous avez " + age + " ans, vous ne pouvez pas travailler.");
        }
        else if (age > 16 && age <= 55) {
            System.out.println("Vous avez " + age + " ans, vous pouvez travailler.");
        }
        else if (age > 55 && age < 67) {
            System.out.println("Vous avez " + age + " ans, vous aurez du mal à trouver un emploi.");
        }
        else {
            System.out.println("Vous avez " + age + " ans, vous êtes retraité.");
        }
    }
}
