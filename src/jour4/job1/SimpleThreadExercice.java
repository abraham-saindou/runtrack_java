package jour4.job1;

public class SimpleThreadExercice extends Thread {

    public void run() {
        for (int i = 1; i < 6; ++i){
            System.out.println("Salut du thread");

            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e){System.out.println(e);}
            System.out.println(i + " sec");
        }
    }

    public static void main(String[] args){
        SimpleThreadExercice thread = new SimpleThreadExercice();
        thread.start();
    }
}
