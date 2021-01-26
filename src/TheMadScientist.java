import java.util.Scanner;

public class TheMadScientist {
    public static void ScientistBoss(){
        Scanner Choice = new Scanner(System.in);
        System.out.println("What will you do?");
        System.out.println(1 + ": axe");
        System.out.println(2 + ": knife");
        System.out.println(3 + ": lighter");
        System.out.println(4 + ": dagger");
        System.out.println(5 + ": Magic staff");
        System.out.println(6 + ": Consume a berry");
        int choice = Choice.nextInt();
    }
}
