import java.util.Scanner;

public class ForwardOrUp {

    public static void fowardOrUp(){
        Scanner choice = new Scanner(System.in);
        System.out.println("Will you walk forward or go up?");
        System.out.println(1 + ": climb the rope.");
        System.out.println(2 + ": walk forward.");
        int Choice = choice.nextInt();
        if(Choice == 1){
            System.out.println("The goblins cut your rope and you fall to your death!");
            System.out.println("Game Ovaer!");
            respawn();
        }else if(Choice == 2){
            System.out.println("Yeah that rope looked suspicious anyways...");
        }else{
            System.out.println("invalid input");
            fowardOrUp();
        }
    }
    public static void respawn() {
        Scanner choice = new Scanner(System.in);
        System.out.println("would you like to retry?");
        System.out.println(1 + ": last check point");
        System.out.println(2 + ": restart game");
        System.out.println(3 + ": exit");
        int respawn = choice.nextInt();
        if (respawn == 1) {
            fowardOrUp();
        } else if (respawn == 2) {
            Cave.game();
        } else if (respawn == 3) {
            System.out.println("See Ya!");
            System.exit(0);
        } else {
            System.out.println("invalid input");
            respawn();
        }
    }
}
