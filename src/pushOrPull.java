import java.util.Scanner;

public class pushOrPull {
    public static void PushOrPull(){
        Scanner Choice = new Scanner(System.in);
        System.out.println("What will you do?");
        System.out.println(1 + ": push");
        System.out.println(2 + ": pull");
        int choice = Choice.nextInt();
        if(choice == 1){
            System.out.println("You push the lever...");
            System.out.println("It lifts you upwards.");
        }else if(choice == 2){
            System.out.println("You pull the lever...");
            System.out.println("It goes downwards but it's going kinda quick");
            System.out.println("It goes faster and faster and when it reaches the ground the impact kills you");
            System.out.println("Game over!");
            respawn();
        }else{
            System.out.println("Invalid input");
            PushOrPull();
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
            PushOrPull();
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
