import java.sql.SQLOutput;
import java.util.Scanner;

public class SageChoice {
    public static void sageChoice(){
        Scanner choice = new Scanner(System.in);
        System.out.println("what will you do?");
        System.out.println(1 + ": Accept the Sages help");
        System.out.println(2 + ": Fight the old sage");
        int Choice = choice.nextInt();
        if(Choice == 1){
            System.out.println("Sage: Young one, you chose correctly, please tell me the location you wish to travel too...");
            System.out.println("Sage: I will teleport you there with a spell.");
            System.out.println("You:....");
            System.out.println("Sage: Very well");
            System.out.println("Sage: VOOSH");
            System.out.println("Congrats, you have achieved ending 1... GAME OVER, you win!");
            newGame();
        }else if(Choice == 2){
            System.out.println("You take a fighting stance!");
            System.out.println();
        }else{
            System.out.println("invalid input");
            sageChoice();
        }
    }
    public static void newGame(){
        Scanner choice = new Scanner(System.in);
        System.out.println("What would you like to do now?");
        System.out.println(1 + ": Start new game");
        System.out.println(2 + ": exit our of game");
        int Choice = choice.nextInt();
        if(Choice == 1){
            Cave.game();
        }else if(Choice == 2){
            System.out.println("See Ya!");
            System.exit(0);
        }else{
            System.out.println("invalid input");
            newGame();
        }
    }
}

