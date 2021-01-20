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
            System.out.println("would you like to retry?");
        }else{
            System.out.println("invalid input");
            RopeOrLadder();
        }

    }
}
