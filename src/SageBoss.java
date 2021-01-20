import java.sql.SQLOutput;
import java.util.Scanner;

public class SageBoss {
    public static void sage(){
        Scanner Choice = new Scanner(System.in);
        System.out.println("What weapon will you use?");
        System.out.println(1 + ": axe");
        System.out.println(2 + ": Stick");
        System.out.println(3 + ": knife");
        System.out.println(4 + ": lighter");
        System.out.println(5 + ": dagger");
        int choice = Choice.nextInt();
        if(choice == 1){
            System.out.println("The sage blasts you with a fire ball! You died..");
            System.out.println("Game Over!");
            System.exit(0);
        }else if(choice == 2){
            System.out.println("The sage laughs and throws a lighting bolt at you");
            System.out.println("Game over!");
            System.exit(0);
        }else if(choice == 3){
            System.out.println("The sage hurls a magic sword towards you");
            System.out.println("Game over!");
            System.exit(0);
        }else if(choice == 4){
            System.out.println("Sage: Ahh you bastard, you haven't a clue of what you are doing!");
            System.out.println("The old sage burned to death");
            System.out.println("You collected a magic staff.");
        }else if(choice == 5){
            System.out.println("maybe a dagger isn't the best idea...");
            System.out.println("Try something else");
            sage();
        }else{
            System.out.println("invalid input");
            sage();
        }
    }
}
