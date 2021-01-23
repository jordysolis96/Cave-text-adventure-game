import java.util.Scanner;

public class Gargoyle {
    public static void gargoyle(){
        Scanner Choice = new Scanner(System.in);
        System.out.println("What will you do?");
        System.out.println(1 + ": axe");
        System.out.println(2 + ": knife");
        System.out.println(3 + ": lighter");
        System.out.println(4 + ": dagger");
        System.out.println(5 + ": Magic staff");
        System.out.println(6 + ": Use sword");
        int choice = Choice.nextInt();
        if(choice == 1){
            System.out.println("The gargoyle snaps your axe and stabs you with your half broken axe!");
            System.out.println("Game Over!");
            respawn();
        }else if(choice == 2){
            System.out.println("The knife does little to no damage, the gargoyle chops your head off...");
            System.out.println("Game over!");
            respawn();
        }else if(choice == 3){
            System.out.println("That won't work.");
            gargoyle();
        }else if(choice == 4){
            System.out.println("The dagger snaps in half, the gargoyle chops your head off...");
            System.out.println("Game over!");
            respawn();
        }else if(choice == 5){
            System.out.println("That won't work...");
            gargoyle();
        }else if(choice == 6){
            System.out.println("You have a duel and kill the gargoyle, your sword broke in the process...");
            System.out.println("So did the gargoyle's.");
            System.out.println("Congrats on beating the boss!");
        }else{
            System.out.println("Invalid input");
            gargoyle();
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
            gargoyle();
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
