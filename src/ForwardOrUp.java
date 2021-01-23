import java.util.Scanner;

public class ForwardOrUp {

    public static void fowardOrUp(){
        Scanner choice = new Scanner(System.in);
        System.out.println("Will you walk forward or go up?");
        System.out.println(1 + ": climb the rope.");
        System.out.println(2 + ": walk forward.");
        int Choice = choice.nextInt();
        if(Choice == 1){
            System.out.println("The goblins cut your rope and you fall to your death!");
            System.out.println("Game Ovaer!");
            System.exit(0);
        }else if(Choice == 2){
            System.out.println("Yeah that rope looked suspicious anyways...");
        }else{
            System.out.println("invalid input");
            fowardOrUp();
        }
    }
}
