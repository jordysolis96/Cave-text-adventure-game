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
            System.out.println();
        }else if(choice == 2){
            System.out.println("Good choice, you continue your way through the cave");
        }else{
            System.out.println("Invalid input");
            gun();
        }
    }
}
