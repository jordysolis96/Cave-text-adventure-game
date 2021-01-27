import java.util.Scanner;

public class Gun {
    public static void gun(){
        Scanner Choice = new Scanner(System.in);
        System.out.println("What will you do?");
        System.out.println(1 + ": pick up the gun");
        System.out.println(2 + ": leave the gun");
        int choice = Choice.nextInt();
        if(choice == 1){
            System.out.println("The gun has a self destructs protocol.. it blows up in your face");
            System.out.println("Game over!");
            respawn();
        }else if(choice == 2){
            System.out.println("Good choice, you continue your way through the cave");
        }else{
            System.out.println("Invalid input");
            gun();
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
            gun();
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
