import java.util.Scanner;

public class LeftOrRight {
    public static void leftOrRight(){
        Scanner Choice = new Scanner(System.in);
        System.out.println("What will you do?");
        System.out.println(1 + ": go left");
        System.out.println(2 + ": go right");
        int choice = Choice.nextInt();
        if(choice == 1){
            System.out.println("The elevator moves to the left...");
            System.out.println("It comes to a sudden stop. You hear something snap...");
            System.out.println("The wire attached to the elevator snapped! There isn't much you can do now...");
            System.out.println("You fall to your death!");
            System.out.println("Game Over!");
            respawn();
        }else if(choice == 2){
            System.out.println("You move to the right.");
            System.out.println("Eventually you come to a stop.");
            System.out.println("You exit the elevator and you walk into an empty room...");
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
            leftOrRight();
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
