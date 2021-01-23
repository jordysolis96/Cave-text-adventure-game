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
        }else if(choice == 2){
            System.out.println("The knife does little to no damage, the gargoyle chops your head off...");
            System.out.println("Game over!");
        }else if(choice == 3){
            System.out.println("That won't work.");
            gargoyle();
        }else if(choice == 4){
            System.out.println("The dagger snaps in half, the gargoyle chops your head off...");
            System.out.println("Game over!");
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
}
