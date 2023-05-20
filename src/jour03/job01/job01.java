package jour03.job01;

import java.util.Arrays;

public class job01 {
    public static void main(String[] args){
        int[] tableau = new int[5];
        tableau[0] = 10; tableau[2] = 2; tableau[4] = 69;
        for (int i : tableau){
            System.out.println(i);
        };
        System.out.println(tableau[1]);
    }
}
