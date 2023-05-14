package jour01.job14;

import java.util.Scanner;

public class Somme {
    public static void main(String[] args) {
        Scanner myObject = new Scanner(System.in);
        System.out.println("Entrer deux nombres : ");
        int sum, num1 = myObject.nextInt(), num2 = myObject.nextInt();
        sum = num1 + num2;
        System.out.println(sum);
    }
}
