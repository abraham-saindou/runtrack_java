package jour03.job06;

import java.util.Random;

public class job06 {
    public static void main(String[] args){
        int[] tableau = new int[10];
        Random shuffle = new Random();

        for (int i = 0; i < tableau.length; ++i){
            tableau[i] = shuffle.nextInt(100);
        }
        System.out.print("Les nombres aléatoires sont : ");
        for (int i : tableau){
            System.out.print(i + " ");
        }
    }
}
