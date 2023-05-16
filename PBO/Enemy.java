package PBO;

public class Enemy extends Character{
    public void move(){
        System.out.println("Penyihir bergerak ke Kota Mik untuk balas dendam!!!");
    }
        

    public void move (int step){
        int gerak = (int) (Math.random() * 1000);
        System.out.println("Penyihir Bergerak sebanyak " + gerak + " langkah" );
    }

}
