import java.sql.SQLOutput;
import java.util.Scanner;

public class TheNamelessChampion {
    public static void NamelessChampion() {
        Scanner choice = new Scanner(System.in);
        System.out.println("You walk to the door and push it with all your strength.");
        System.out.println("That door was clearly designed for a giant...");
        System.out.println("You walk through the doors and see that the layout looks like an arena");
        System.out.println("The Nameless Champion: I see... another worthless contender");
        System.out.println("You turn around and see a large giant with armor");
        System.out.println("The Nameless Champion: Mind you the mantle of champion means nothing to me");
        System.out.println("The Nameless Champion: The title I hold... let it all fade into nothing");
        System.out.println("The Nameless Champion: I only wish for a good fight!");
        System.out.println("The Champion charges towards you!");
        fight();
    }
    public static void fight(){
        Scanner choice = new Scanner(System.in);
        System.out.println(1 + ": Dodge to the left");
        System.out.println(1 + ": Dodge to the right");
        int dodge = choice.nextInt();
        if(dodge == 1){
            System.out.println("The champion quickly draws his spear and stabs you to death!");
            System.out.println("Game over");
            respawn();
        }else if(dodge == 2){
            System.out.println("You picked up a sword and slice his ankles!");
            System.out.println("This lowers him enough for you to pierce is heart!");
            System.out.println("The Nameless Champion: Well done new comer, I may now rest in piece.");
            System.out.println();
            System.out.println("Congrats you have beaten the champion!");
            System.out.println("You also collected a sword");
        }else{
            System.out.println("invalid input");
            fight();
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
            NamelessChampion();
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
