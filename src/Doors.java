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
        }else if(Choice == 2){

        }else{
            System.out.println("invalid input");
            doors();
        }

    }
    }
}
