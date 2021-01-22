import java.util.Scanner;

public class FireKingDemon {
    public static void FireDemon(){
        Scanner choice = new Scanner(System.in);
        System.out.println("He looks at you dead in the eyes");
        System.out.println("You walk towards the king...");
        System.out.println("You have now entered a boss fight!");
        System.out.println();
        System.out.println("What will you do?");
        System.out.println(1 + ": axe");
        System.out.println(2 + ": Stick");
        System.out.println(3 + ": knife");
        System.out.println(4 + ": lighter");
        System.out.println(5 + ": dagger");
        System.out.println(6 + ": Magic staff");
        System.out.println(7 + ": rope");
        System.out.println(8 + ": Throw explosives");
        System.out.println(9 + ": Use sword");
        int Choice = choice.nextInt();
        if(Choice == 1){
            System.out.println("The King blocks and stabs you.");
            System.out.println("Game Over!");
            respawn();
        }else if(Choice == 2){
            System.out.println("A stick won't work, you got slapped to death!");
            System.out.println("Game over!");
            respawn();
        }else if(Choice == 3){
            System.out.println("The knife won't penetrate the kings rough skin, you get stomped to death.");
            System.out.println("Game over!");
            respawn();
        }else if(Choice == 4){
            System.out.println("You get slammed to death!");
            System.out.println("Game over");
            respawn();
        }else if(Choice == 5){
            System.out.println("The king crushes you to death");
            System.out.println("Game Over");
            respawn();
        }else if(Choice == 6){
            System.out.println("You get crushed to death!");
            System.out.println("Game over!");
            respawn();
        }else if(Choice == 7){
            System.out.println("You weave the next attack and choke the demon to death with the rope");
            System.out.println("Congrats on beating the demon king!");
            System.out.println("It looks like your rope burned in the process...");
        }else if(Choice == 8){
            System.out.println("That won't work, you get mauled to death");
            respawn();
        }else if(Choice == 9){
            System.out.println("The sword doesn't work, you get stomped to death");
            respawn();
        }else{
            System.out.println("invalid input");
            FireDemon();
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
            FireDemon();
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
