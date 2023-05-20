package jour03.job07;

public class job07 {
    public static void main(String[] args){
        int[][] matrice1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrice2 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};

        for (int a = 0; a < matrice1.length; ++a){
            for (int b = 0; b < matrice2.length; ++b){
                System.out.print(matrice1[a][b] + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < matrice1.length; ++i){
            for (int j = 0; j < matrice2.length; ++j){
                int sum = matrice1[i][j] + matrice2[i][j];
                System.out.print(sum + " ");
            }
        }
    }
}
