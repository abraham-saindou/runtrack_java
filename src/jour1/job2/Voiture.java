package jour1.job2;

public class Voiture {
    String Brand, Color;
    double Speed;
    public Voiture(String Marque, String Color, double Speed){
        this.Brand = Marque;
        this.Color = Color;
        this.Speed = Speed;
    }
    // Getters and setters
    public void start() {
        boolean status = false;
        status = true;
        if (status) {
            System.out.println("Vehicle has started");
        }
    }
    public void accelerate(){
        this.Speed = this.Speed + 10.0;
        System.out.println("Speed vehicle is " + this.Speed + "km/h");
    }
    public void brake_to_stop(){
        this.Speed = 0;
        System.out.println("Vehicle is stopped and its speed is now " + this.Speed + "km/h");

    }
    public static void main(String[] args){
        Voiture vehicle = new Voiture("Ford GT", "Blue", 0f);

        vehicle.start();
        vehicle.accelerate();
        vehicle.accelerate();
        vehicle.brake_to_stop();
    }
}