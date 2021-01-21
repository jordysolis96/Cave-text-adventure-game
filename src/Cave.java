import java.sql.SQLOutput;
import  java.util.Scanner;


public class Cave {

    public static void game() {
        Scanner decision = new Scanner(System.in);
        System.out.println("BOOM!!!");
        System.out.println(".......");
        System.out.println("It looks like the airplane you were riding has suddenly crashed into a cave...");
        System.out.println("you will need to fight your way out using your weapons.");
        System.out.println("It appears you only have a axe, sticks, a knife, and a lighter.");
        System.out.println("There's a goblin up ahead blocking your path.");
        goblinBossFight();
        System.out.println("Congratulations on beating the goblin!");
        System.out.println("But the fight isn't over yet...");
        System.out.println("There is a lot of noise coming from the depths of the cave.");
        System.out.println("You walk forward and see an old sage... sitting in a corner...");
        System.out.println("Sage: I see you don't belong in a place like this..");
        System.out.println("Sage: A lot a power comes to the one who can defeat all the enemies in this cave.");
        System.out.println("Sage: I happen to be one of them, but I do not wish to fight, let me help you escape...");
        SageChoice.sageChoice();
        System.out.println("Sage: you fool, if you wish to die then come at me!");
        System.out.println("You have now entered a boss fight.");
        SageBoss.sage();
        System.out.println("You've beaten the old sage, congratulations!");
        System.out.println("The only way to move is forward...");
        System.out.println("You keep walking and see a rope leading up and a ladder leading down...");
        upOrDown.RopeOrLadder();
        System.out.println("You Keep walking forward and hear a hiss, it's a large serpent!");
        System.out.println("It quickly slithers toward you!");

    }


    public static void goblinBossFight() {
        Scanner decision = new Scanner(System.in);
        System.out.println("What weapon would you like to use?");
        System.out.println(1 + ": axe");
        System.out.println(2 + ": Stick");
        System.out.println(3 + ": knife");
        System.out.println(4 + ": lighter");
        int choice = decision.nextInt();
        if (choice == 1) {
            System.out.println("The goblin parried your attack! you've now been stabbed to death...");
            System.out.println("GAME OVER");
            respawn();
        } else if (choice == 2) {
            System.out.println("The stick penetrated his fragile skin!");
            System.out.println("You've also collected a dagger from his pocket...");
            System.out.println();
        } else if (choice == 3) {
            System.out.println("The goblin doges and stabs you with a dagger!");
            System.out.println("GAME OVER");
            respawn();
        } else if (choice == 4) {
            System.out.println("The lighter won't reach from here, try a different option.");
            goblinBossFight();
        } else {
            System.out.println("invalid input");
            goblinBossFight();
        }
    }
    public static void respawn(){
        Scanner choice = new Scanner(System.in);
        System.out.println("would you like to retry?");
        System.out.println(1 + ": last check point");
        System.out.println(2 + ": restart game");
        System.out.println(3 + ": exit");
        int respawn = choice.nextInt();
        if(respawn == 1){
            goblinBossFight();
        }else if(respawn == 2){
            Cave.game();
        }else if(respawn == 3){
            System.out.println("See Ya!");
            System.exit(0);
        }else{
            System.out.println("invalid input");
            respawn();
        }
    }
}
