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
            respawn();
        }else if(choice == 2){
            System.out.println("The sage laughs and throws a lighting bolt at you");
            System.out.println("Game over!");
            respawn();
        }else if(choice == 3){
            System.out.println("The sage hurls a magic sword towards you");
            System.out.println("Game over!");
            respawn();
        }else if(choice == 4){
            System.out.println("Sage: Ahh you bastard, you haven't a clue of what you are doing!");
            System.out.println("The old sage burned to death");
            System.out.println("You collected a magic staff.");
            System.out.println();
        }else if(choice == 5){
            System.out.println("maybe a dagger isn't the best idea...");
            System.out.println("Try something else");
            sage();
        }else{
            System.out.println("invalid input");
            sage();
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
            sage();
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
