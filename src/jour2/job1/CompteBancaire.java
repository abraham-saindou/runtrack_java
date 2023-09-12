package jour2.job1;

public class CompteBancaire {
    double balance;
    String name;

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

}
class CompteCourant extends CompteBancaire {
    public CompteCourant(String name, double balance) {
        super(name, balance);
    }
};

class CompteEpargne extends CompteBancaire{
    double rate;
    public CompteEpargne(String name, double balance, double rate){
        super(name, balance);
        this.rate = rate;
    }

    public void add_interest(){
        System.out.println("Your balance is " + this.balance +" € and interest is of " + this.rate + " %");
        double interest = this.balance * (this.rate / 100);
        this.balance += interest;
        System.out.println("Added interest is of " + interest + " €");
        show_balance();
    }

    public static void main(String[] args) {
        CompteCourant num1 = new CompteCourant("Mars", 500);
        CompteEpargne epargne1 = new CompteEpargne("Junon", 800, 2);

        num1.show_balance();
        epargne1.add_interest();

    }
};




