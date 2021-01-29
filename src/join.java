import java.util.Scanner;

public class join {
    public static void Join(){
        Scanner Choice = new Scanner(System.in);
        System.out.println("What will you do?");
        System.out.println(1 + ": Join");
        System.out.println(2 + ": Deny offer");
        int choice = Choice.nextInt();
        if (choice == 1) {
            System.out.println("The twin princes: Excellent choice, this way.. if you will.");
            System.out.println("The old king: I'm glad you made the right choice you will now be appointed as my royal guards!");
            System.out.println("Congratulations! You have reached ending 3!");

        }else if(choice == 2){
            System.out.println("The twin princes:A poor choice you have made...");
        }
    }

}
