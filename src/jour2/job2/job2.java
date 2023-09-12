package jour2.job2;

public class job2 {
    public interface Nageur {
        public default void Nager(){
        }
    }
    static class Homme implements Nageur {
        public Homme(){};
        public void Nager() {
            System.out.println("L'homme nage");
        }
    }
    static class Poisson implements Nageur{
        public void Nager() {
            System.out.println("Le poisson nage rapidement.");
        }
    }
    public static void main(String[] args){
        Homme man1 = new Homme();
        Poisson fish1 = new Poisson();

        man1.Nager();
        fish1.Nager();
    }
}

