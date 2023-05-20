package jour04.job02;

import java.io.FileWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class job01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random shuffle = new Random();
        FileWriter file = new FileWriter("save.txt", true);
        String alpha = "azertyuiopqsdfghjklmwxcvbn";

        System.out.print("Entrer la longueur d'une chaine de catactère : ");
        int size = input.nextInt();
        String[] word = new String[size];

        for (int i = 0; i < size; ++i){
            int obj = shuffle.nextInt(alpha.length());
            word[i] = Character.toString(alpha.charAt(obj));
        }
        System.out.println(Arrays.toString(word));

    }
}
