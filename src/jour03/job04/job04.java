package jour03.job04;

import java.util.Arrays;

public class job04 {
    public static void main(String[] args){
        int [] chiffres = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] values = {3, 7, 3, 8, 9};

        for (int i = 0; i < chiffres.length; ++i){
            int count = 0;
            for (int j = 0; j < values.length; ++j){
                if (chiffres[i] == values[j]){
                    ++count;
                }
            }
            if (count > 1){
                System.out.println("Le chiffre " +chiffres[i] + " est apparait " + count + " fois.");
            }

        }

    }
}
