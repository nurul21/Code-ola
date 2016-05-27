import java.util.concurrent.Semaphore;

public class MengerjakanSoal {
    // We must start with Producer semaphore
    static Semaphore semhitung = new Semaphore(1);
    // Start with consumer semaphore unavailable.
    static Semaphore semteori = new Semaphore(0);

    int soalId;

    public void putsoal(int soalId){
        try {
            semhitung.acquire();
            this.soalId=soalId;
            System.out.println(Thread.currentThread().getName()+"Make "+soalId);
            semteori.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void getsoal(){
        try {
            semteori.acquire();
            System.out.println(Thread.currentThread().getName()+"Make "+soalId);
            semhitung.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }         
    } 
}