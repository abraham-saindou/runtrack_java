package jour01.job11;

import java.util.Scanner;

public class hour {
    public static void main(String[] args){
        Scanner myObject = new Scanner(System.in);
        System.out.println("Entrer une durée en minutes : ");

        int minutes = myObject.nextInt();
        int heures = minutes / 60;
        int reste = minutes % 60;
        String str_minutes = String.valueOf(minutes), str_heures = String.valueOf(heures), str_reste = String.valueOf(reste);

        System.out.println(str_minutes + " minutes équivaut à " + str_heures + " heures et " + str_reste + " minutes.");
    }
}
