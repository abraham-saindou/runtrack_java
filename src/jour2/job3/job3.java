package jour2.job3;

public class job3 {
    abstract static class Animal{
        public void faire_du_bruit() {
        }
    }
    static class Chien extends Animal{
        public void faire_du_bruit() {
            System.out.println("Le golden retriever aboie !\n");
        }
    }
    static class Chat extends Animal{
        public void faire_du_bruit() {
            System.out.println("Le savannah miaule !\n");
        }
    }
    static class Oiseau extends Animal{
        public void faire_du_bruit() {
            System.out.println("Le canard chante !\n");
        }
    }

    public static void main(String[] args){
        Chien chien1 = new Chien();
        Chat chat1 = new Chat();
        Oiseau canard = new Oiseau();

        chien1.faire_du_bruit();
        chat1.faire_du_bruit();
        canard.faire_du_bruit();
    }
}
