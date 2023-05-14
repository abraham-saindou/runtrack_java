package jour02.job06;

public class job06 {
    public static void main(String[] args){
        int sum = 0;
        for (int i = 1; i <= 100; ++i){
            if (i % 2 == 0){
                sum +=i;
            }
        }
        System.out.println("La somme des nombres paires entre 1 et 100 est de " + sum);
    }
}
