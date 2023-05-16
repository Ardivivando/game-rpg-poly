package PBO;

public class App {
    public static void main(String[] args) {
        System.out.println("UNTUK SOAL A");

        Enemy enemy = new Enemy();
        enemy.move(0);;
        Hero hero = new Hero();
        hero.move(null);;

        System.out.println("");
        System.out.println("UNTUK SOAL B");

        Character fighter = new Fighter();
        fighter.move();
        Character hero2 = new Hero();
        hero.move(null);;
        Character witch = new Witch();
        witch.move();
        Character enemy2 = new Enemy();
        enemy.move(0);

        System.out.println("");
        System.out.println("UNTUK SOAL C");
        ((Fighter)witch).move();




    }
}
