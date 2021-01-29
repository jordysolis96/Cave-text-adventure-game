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
            System.out.println("You fall to your death!");
            System.out.println("Game Over!");
        }else if(choice == 2){
            System.out.println("You move to the right.");
            System.out.println("Eventually you come to a stop.");
            System.out.println("You exit the elevator and you walk into an empty room...");
        }
    }
}
