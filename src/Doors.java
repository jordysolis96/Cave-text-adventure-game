import java.util.Scanner;

public class Doors {
    public static void doors(){
        Scanner choice = new Scanner(System.in);
        System.out.println("What will you do...?");
        System.out.println(1 + ": Go left...");
        System.out.println(2 + ": Go right...");
        int Choice = choice.nextInt();
        if(Choice == 1){
            System.out.println("Are you sure you want to open this door?");
            System.out.println(1 + ": Yes");
            System.out.println(2 + ": No");
            int sure = choice.nextInt();
            if(sure == 1){
                System.out.println("A group of wasps come out and kill you!");
                System.out.println("Game Over!");
                respawn();
            }else if(sure == 2){
                doors();
            }
        }else if(Choice == 2){
            System.out.println("Are you sure you want to open this door?");
            System.out.println(1 + ": Yes");
            System.out.println(2 + ": No");
            int sure = choice.nextInt();
            if(sure == 1) {
                System.out.println("You open the doors and enter another room");
            }else if (sure == 2){
                doors();
            }
        }else{
            System.out.println("invalid input");
            doors();
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
            doors();
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
