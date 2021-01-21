import java.util.Scanner;

public class DoorOrDragon {
    public static void decision(){
        Scanner Choice = new Scanner(System.in);
        System.out.println("What will you do?");
        System.out.println(1 + ": Open the door");
        System.out.println(2 + ": Go to the wounded dragon");
        int choice = Choice.nextInt();
        if(choice == 1){

        }else if(choice == 2){
            Dragon.dragon();
        }else{
            System.out.println("Invalid input");
            decision();
        }
    }
}
