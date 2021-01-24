import java.util.Scanner;

public class HalfHumanHalfFox {
    public static void foxBoss(){
        Scanner Choice = new Scanner(System.in);
        System.out.println("What will you do?");
        System.out.println(1 + ": axe");
        System.out.println(2 + ": knife");
        System.out.println(3 + ": lighter");
        System.out.println(4 + ": dagger");
        System.out.println(5 + ": Magic staff");
        int choice = Choice.nextInt();
        if(choice == 1){
            System.out.println("The fox was too quick... it scratched your head off!");
            System.out.println("Game over!");
            respawn();
        }else if(choice == 2){
            System.out.println("The knife slashes the air, meanwhile the fox slashes your heart open...");
            System.out.println("Game over!");
            respawn();
        }else if(choice == 3){
            System.out.println("That won't work");
            foxBoss();
        }else if(choice == 4){
            System.out.println("The fox stabs you to death!");
            System.out.println("Game over!");
            respawn();
        }else if(choice == 5){
            System.out.println("You try the long ranged attack and it works!");
            System.out.println("The magic staff releases a soul arrow and goes straight through the fox!");
            System.out.println("The fox reverts back into a human completely and you notice a pouch of berries...");
            System.out.println("You collect the pouch of berries.");
            System.out.println();
        }else{
            System.out.println("invalid input");
            System.exit(0);
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
            foxBoss();
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
