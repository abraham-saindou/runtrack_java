package jour1.job3;

import java.util.Scanner;
public class Calculatrice {
    double x , y, res;

    public Calculatrice(double x, double y, double result){
        this.x = x;
        this.y = y;
        this.res = result;
    };

    public void add(){
        this.res = this.x + this.y;
        System.out.println(this.x + " + " + this.y + " = " + this.res);
        this.res = 0;
    };
    public void sub(){
        this.res = this.x - this.y;
        System.out.println(this.x + " - " + this.y + " = " + this.res);
        this.res = 0;
    };
    public void multiply(){
        this.res = this.x * this.y;
        System.out.println(this.x + " * " + this.y + " = " + this.res);
        this.res = 0;
    };
    public void divide(){
        this.res = this.x / this.y;
        System.out.println(this.x + " / " + this.y + " = " + this.res);
        this.res = 0;
    };

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers : ");

        int num1 = input.nextInt(), num2 = input.nextInt();
        Calculatrice calc = new Calculatrice(num1, num2, 0);
        calc.add();
        calc.sub();
        calc.multiply();
        calc.divide();
    }
}
