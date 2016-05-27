public class HitungSoal extends Thread{
    MengerjakanSoal k;
    public HitungSoal(MengerjakanSoal k){
        this.k=k;
        this.setName("Soal Hitung Thread ");
        this.start();
    }

    public void run(){
        for(int i=1;i<7;i++){
            k.putsoal(i);
        }         
    } 
} 