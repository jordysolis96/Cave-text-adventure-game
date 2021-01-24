import java.util.Scanner;

public class CartOrDoor {
    public static void cartOrDoor(){
        Scanner choice = new Scanner(System.in);
        System.out.println("Will you ride the mine cart or open the door?");
        System.out.println(1 + ": climb the rope.");
        System.out.println(2 + ": walk forward.");
        int Choice = choice.nextInt();
        if(Choice == 1){
            System.out.println("You ride the mine cart...");
            System.out.println("It stops in a room full of electricity..");
            System.out.println();
        }else if(Choice == 2){
            System.out.println("You open the door, and walk forward.");
            System.out.println("A witch hurls a fireball towards you and melts you!");
            System.out.println("Game Over!");
            respawn();
        }else{
            System.out.println("invalid input");
            cartOrDoor();
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
            cartOrDoor();
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
