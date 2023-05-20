package jour03.job03;

import java.util.Arrays;

public class job03 {
    public static void main(String[] args){
        String[] names = {"Josette", "John", "Myrtille", "Marc"};
        System.out.println(names[1]);
        names[2] = "Mireille";
        System.out.println(Arrays.toString(names));
    }
}
