package jour03.job02;

import java.util.ArrayList;
import java.util.Arrays;

public class job02 {
    public static void main(String[] args){
        int[] monTableau = {12, 6, 76, 89};
        int n = monTableau.length, value = 15;
        int[] newtable = new int[n+1];

        for(int i = 0; i < n; ++i){
            newtable[i] = monTableau[i];
        }
        newtable[n] = value;
        System.out.println(Arrays.toString(newtable));

    }
}
