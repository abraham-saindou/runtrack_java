package jour1.job4;

public class CompteBancaire {
    double balance; String name;
    public CompteBancaire(String name, double balance){
        this.name = name;
        this.balance = balance;
    }
    public void show_balance(){
        System.out.println("Your account balance is :" + this.balance + " €\n");
    }
    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Your deposit is :" + amount + " €");
        show_balance();
    }
    public void withdrawal(double amount){
        if(balance >= amount) {
            this.balance -= amount;
            System.out.println("Your withdraw is :" + amount + " €");
            show_balance();
        }
        else {
            System.out.println("Your withdraw is bigger than your balance.\n");
        }
    }

    public static void main(String[] args) {
        CompteBancaire num1 = new CompteBancaire("Mars", 500);
        CompteBancaire num2 = new CompteBancaire("Junon", 800);

        num1.show_balance();
        num2.deposit(120);
        num2.withdrawal(520);
    }
}