public class TeoriSoal extends Thread{
    MengerjakanSoal k;
    public TeoriSoal(MengerjakanSoal k){
        this.k=k;
        this.setName("Teori Soal Thread ");
        this.start();
     }

    public void run(){
        for(int i=1;i<7;i++){
            k.getsoal();
        }         
     } 
} 