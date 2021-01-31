import java.sql.SQLOutput;
import java.util.Scanner;

public class OctopusBattle {
    public static void Octupus(){
        Scanner Choice = new Scanner(System.in);
        System.out.println("What will you do?");
        System.out.println(1 + ": axe");
        System.out.println(2 + ": knife");
        System.out.println(3 + ": lighter");
        System.out.println(4 + ": dagger");
        System.out.println(5 + ": Magic staff");
        System.out.println(6 + ": Use sword");
        int choice = Choice.nextInt();
        if(choice == 1){
            System.out.println("The axe is too slow in the water... the octopus slams you the death!");
            System.out.println("Game over!");
            respawn();
        }else if(choice == 2){
            System.out.println("The octopus tries to attack you but you stab the octopus to death!");
            System.out.println("Congratulations, you beat the boss!");
        }else if(choice == 3){
            System.out.println("That won't work here... try something else");
            Octupus();
        }else if(choice == 4){
            System.out.println("The dagger chops one the tentacles of the octopus! It retreats... you won't catch it, but you won't have to fight it either.");
            System.out.println("You beat the boss! Congratulations");
        }else if(choice == 5){
            System.out.println("You can't use that here...");
            Octupus();
        }else if(choice == 6){
            System.out.println("The sword takes too long to swing under water... the octopus wraps its tentacle around you and chokes you to death!");
            System.out.println("Game over!");
            respawn();
        }else{
            System.out.println("invalid input");
            Octupus();
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
            Octupus();
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
