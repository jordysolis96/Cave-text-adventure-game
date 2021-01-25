import java.util.Scanner;

public class TheThreeMinions {
    public static void TheThree(){
        Scanner Choice = new Scanner(System.in);
        System.out.println("What will you do?");
        System.out.println(1 + ": axe");
        System.out.println(2 + ": knife");
        System.out.println(3 + ": lighter");
        System.out.println(4 + ": dagger");
        System.out.println(5 + ": Magic staff");
        System.out.println(6 + ": Consume a berry");
        int choice = Choice.nextInt();
        if(choice == 1){
            System.out.println("You block one attack and kill a minion, but the other two kill you!");
            System.out.println("Game Over!");
            respawn();
        }else if(choice == 2){
            System.out.println("The minions choke you to death");
            System.out.println("Game Over!");
            respawn();
        }else if(choice == 3){
            System.out.println("The minions quickly beat you to death");
            System.out.println("Game over!");
            respawn();
        }else if(choice == 4){
            System.out.println("The minions stomp you to death!");
            System.out.println("Game Over!");
            respawn();
        }else if(choice == 5){
            System.out.println("The minions seem to be unaffected...");
            TheThree();
        }else if(choice ==6){
            System.out.println("You consume a berry and morph into the human-fox hybrid!");
            System.out.println("You quickly slash all of the minions heads off and turn back into a human");
            System.out.println("That was weird, you try to eat another one but it does nothing...");
            System.out.println();
        }else{
            System.out.println("invalid input");
            TheThree();
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
            TheThree();
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
