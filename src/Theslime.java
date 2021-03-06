import java.util.Scanner;

public class Theslime {
    public static void slime(){
        Scanner Choice = new Scanner(System.in);
        System.out.println("What will you do?");
        System.out.println(1 + ": axe");
        System.out.println(2 + ": Stick");
        System.out.println(3 + ": knife");
        System.out.println(4 + ": lighter");
        System.out.println(5 + ": dagger");
        System.out.println(6 + ": Magic staff");
        System.out.println(7 + ": Throw explosives");
        System.out.println(8 + ": Use sword");
        int choice = Choice.nextInt();
        if(choice == 1){
            System.out.println("The axe dissolves in the slimes body, the slime burns you to death!");
            System.out.println("Game Over!");
            respawn();
        }else if(choice == 2){
            System.out.println("A stick won't work, you got burned to death!");
            System.out.println("Game over!");
            respawn();
        }else if(choice == 3){
            System.out.println("The knife won't work, try something else.");
            slime();
        }else if(choice == 4){
            System.out.println("You can't throw that, it's your light source! Try something else.");
            slime();
        }else if(choice == 5){
            System.out.println("The slime jumps on you and devours you!");
            System.out.println("Game Over");
            respawn();
        }else if(choice == 6){
            System.out.println("Your staff ran out of magic... the slime suffocates you to death!");
            System.out.println("Game over!");
            respawn();
        }else if(choice == 7){
            System.out.println("You throw the explosive and it blows the slime to bits!");
            System.out.println("Congrats on beating the slime!");
            System.out.println("Keep in mind you no longer have an explosive anymore, but you have collected the slimes shield");
        }else if(choice == 8){
            System.out.println("The Sword is not very helpful, try something else...");
            slime();
        }else{
            System.out.println("invalid input");
            slime();
        }
    }
    public static void respawn() {
        Scanner choice = new Scanner(System.in);
        System.out.println("would you like to retry?");
        System.out.println(1 + ": last check point");
        System.out.println(2 + ": restart game");
        System.out.println(3 + ": exit");
        int respawn = choice.nextInt();
        if (respawn == 1) {
            slime();
        } else if (respawn == 2) {
            Cave.game();
        } else if (respawn == 3) {
            System.out.println("See Ya!");
            System.exit(0);
        } else {
            System.out.println("invalid input");
            respawn();
        }
    }
}
