package jour02.job03;

import java.util.Scanner;

public class job03 {
    public static void main(String[] args){
        Scanner myObject = new Scanner(System.in);
        System.out.println("Entrer un nombre : ");
        int num  = myObject.nextInt(), sum;
        for (int i = 0; i <= num; ++i){
            sum = i * num;
            System.out.println(i + " x " + num + " = " + sum);}
    }
}
