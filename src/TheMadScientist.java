import java.util.Scanner;

public class TheMadScientist {
    public static void ScientistBoss(){
        Scanner Choice = new Scanner(System.in);
        System.out.println();
        System.out.println("What will you do?");
        System.out.println(1 + ": axe");
        System.out.println(2 + ": knife");
        System.out.println(3 + ": lighter");
        System.out.println(4 + ": dagger");
        System.out.println(5 + ": Magic staff");
        System.out.println(6 + ": Consume a berry");
        int choice = Choice.nextInt();
        if(choice == 1){
            System.out.println("The wizard zaps you to death as you charge towards him.");
            System.out.println("Game over!");
        } else if(choice == 2) {
            System.out.println("That won't reach...");
            ScientistBoss();
        }else if(choice == 3) {
            System.out.println("The scientist pulls out a zap gun and zaps you into dust!");
            System.out.println("Game Over!");
        }else if(choice == 4) {
            System.out.println("You throw and the dagger at the scientists head!");
            System.out.println("He seems to have made modifications to his own body, you struck at piece of tech in his head!");
            System.out.println("His head blows up, along with your dagger!");
            System.out.println("Congrats on beating the mad scientist!");
        }else if(choice == 5) {
            System.out.println("Mad Scientist: HAHAHA I've dealt with magic before!");
            System.out.println("The scientist pulls out a shield and deflects your blast right back at you!");
            System.out.println("Game Over");
        }else if(choice == 6){
            System.out.println("You eat the berry but it doesn't do anything, you have to wait longer before you can eat it again");
            System.out.println("Mad Scientist: How tragic... now die...");
            System.out.println("The scientist electrifies you to death!");
            System.out.println("Game over");
        }else{
            System.out.println("Invalid input");
            ScientistBoss();
        }
    }
}
