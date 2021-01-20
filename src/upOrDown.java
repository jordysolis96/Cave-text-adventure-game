import java.sql.SQLOutput;
import java.util.Scanner;

public class upOrDown {
    public static void RopeOrLadder(){
        Scanner choice = new Scanner(System.in);
        System.out.println("What will you do...?");
        System.out.println(1 + ": Climb the rope up!");
        System.out.println(2 + ": Climb the ladder down!");
        int Choice = choice.nextInt();
        if(Choice == 1){
            System.out.println("You made it to the top and collected the rope for later.");
        }else if(Choice == 2){
            System.out.println("Goblins break your ladder and cause you to plummet to your death!");
            System.out.println("You Lose!");
            respawn();
        }else{
            System.out.println("invalid input");
            RopeOrLadder();
        }

    }
    public static void respawn(){
        Scanner choice = new Scanner(System.in);
        System.out.println("would you like to retry?");
        System.out.println(1 + ": last check point");
        System.out.println(2 + ": restart game");
        System.out.println(3 + ": exit");
        int respawn = choice.nextInt();
        if(respawn == 1){
            RopeOrLadder();
        }else if(respawn == 2){
            Cave.game();
        }else if(respawn == 3){
            System.out.println("See Ya!");
            System.exit(0);
        }else{
            System.out.println("invalid input");
            respawn();
        }
    }
}

