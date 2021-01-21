import java.util.Scanner;

public class Dragon {
    public static void dragon(){
        Scanner choice = new Scanner(System.in);
        System.out.println("The dragon seems to be bleeding out, put you shirt sleeve can stop it.");
        System.out.println(1 + ": Help the dragon");
        System.out.println(2 + ": Turn around and open the door");
        int Choice = choice.nextInt();
        if(Choice == 1){
            System.out.println("The dragon heals after awhile and prompts you to get on it");
            System.out.println("You mount the dragon and it busts you two of the cave!");
            System.out.println("Congrats, you have achieved ending 2... GAME OVER, you win!");
            newGame();
        }else if(Choice == 2){
            TheNamelessChampion.NamelessChampion();
        }else{
            System.out.println("Invalid input");
            dragon();
        }
    }
    public static void newGame() {
        Scanner choice = new Scanner(System.in);
        System.out.println("What would you like to do now?");
        System.out.println(1 + ": Start new game");
        System.out.println(2 + ": exit our of game");
        int Choice = choice.nextInt();
        if (Choice == 1) {
            Cave.game();
        } else if (Choice == 2) {
            System.out.println("See Ya!");
            System.exit(0);
        } else {
            System.out.println("invalid input");
            newGame();
        }
    }
}
