import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class GiveOrKeep {
    public static void giveOrKeep() {
        Scanner Choice = new Scanner(System.in);
        System.out.println(1 + ": Give the scientist the pouch of berries.");
        System.out.println(2 + ": Keep the berries! ");
        int choice = Choice.nextInt();
        if(choice == 1){
            System.out.println("Ahh yes, a wise choice... follow me!");
            System.out.println("The scientist shows you the way out of the cave");
            System.out.println("Congratulations, you unlocked ending 2!");
            endchoice();

        }else if(choice == 2){
            System.out.println("Stubborn bastard... Give me the damn berries!");
        }else{
            System.out.println("invalid input");
            giveOrKeep();
        }
    }
    public static void endchoice(){
        Scanner decision = new Scanner(System.in);
        System.out.println("What will you do now?");
        System.out.println(1 + ": Play again");
        System.out.println(2 + ": Exit");
        int choice = decision.nextInt();
        if (choice == 1){
            Cave.game();
        }else if(choice == 2) {
            System.out.println("See ya!");
            System.exit(0);
        }else{
            System.out.println("invalid input");
            endchoice();
        }
    }
}
