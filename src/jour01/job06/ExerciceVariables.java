package jour01.job06;

public class ExerciceVariables {
    public static void main (String[] args){
        int num1 = 15, num2 = 4;
        System.out.println("num1 = " + num1 +" et num2 = " + num2);
        int numx = num1;
        num1 = num2;
        num2 = numx;
        System.out.println("num1 = " + num1 +" et num2 = " + num2);
    }
}
