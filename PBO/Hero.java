package PBO;

public class Hero extends Character{
    public void move(){
        System.out.println("Pahlawan bergerak ke kota Mik untuk petualangannya");
    }
    int step = (int) (Math.random() * 1000);

    public void move (String direction){
        System.out.println("Pahlawan Bergerak sebanyak " + step + " langkah");
    }
    
}
