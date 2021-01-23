import java.util.Scanner;

public class OctopusBattle {
    public static void Octupus(){
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
            System.out.println();
        }
    }
}
