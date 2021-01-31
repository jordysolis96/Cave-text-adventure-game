import java.util.Scanner;

public class SerpentBossFight {
    public static void Serpent(){
        Scanner Choice = new Scanner(System.in);
        System.out.println("What would like to do?");
        System.out.println(1 + ": axe");
        System.out.println(2 + ": Stick");
        System.out.println(3 + ": knife");
        System.out.println(4 + ": lighter");
        System.out.println(5 + ": dagger");
        System.out.println(6 + ": Magic staff");
        System.out.println(7 + ": rope");
        System.out.println(8 + ": run");
        int choice = Choice.nextInt();
        if(choice == 1){
            System.out.println("You chop the serpents head off! A strange person comes out of the mouth");
            System.out.println("He lunges forward with nothing but his hands");
            System.out.println("What will you do?");
            System.out.println(1 + ": Fist fight");
            System.out.println(1 + ": Use the axe again");
           int choice2 = Choice.nextInt();
            if(choice2 == 1){
                System.out.println("You beat him to death, as you were beating him he seemed to regurgitate something out of his mouth.");
                System.out.println("You pick up the pouch he dropped from his mouth and opened it.");
                System.out.println("You collected a pouch of explosives");
            }else if(choice2 == 2){
                System.out.println("He grabs the axe mid swing and kills you!!");
                System.out.println("Game over!");
                respawn();
            }
        }else if(choice == 2){
            System.out.println("The serpent eats you alive");
            System.out.println("Game over!");
            respawn();
        }else if(choice == 3){
            System.out.println("The knife does nothing to the large serpent... your knife is also stuck in the serpent");
            System.out.println("It smacks you with it's tail and you splatter on the wall to your death!");
            System.out.println("Game over!");
            respawn();
        }else if(choice == 4){
            System.out.println("It swerves to the left and eats you!");
            System.out.println("Game over");
            respawn();
        }else if(choice == 5){
            System.out.println("The Serpent lifts its tail and crushes you to death");
            System.out.println("Game Over");
            respawn();
        }else if(choice == 6){
            System.out.println("You use the staff and to your luck it burns the Serpent with a powerful arc arrow!");
            System.out.println("You collected a pouch of explosives.");
        }else if(choice == 7){
            System.out.println("The rope won't work...");
            Serpent();
        }else if(choice == 8){
            System.out.println("You can't out run a Serpent..");
            Serpent();
        }else{
            System.out.println("invalid input");
            Serpent();
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
            Serpent();
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
