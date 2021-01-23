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
        SerpentBossFight.Serpent();
        System.out.println("Congrats on beating the serpent!");
        System.out.println();
        System.out.println("There seems to be a door further down the cave...");
        System.out.println("To the left there seems to be a dragon... wounded and laying on its side");
        DoorOrDragon.decision();
        System.out.println();
        System.out.println("You walk out of the room through a narrow path you find.");
        System.out.println("Theres a unstable bridge you cross... one wrong step and you're toast...");
        System.out.println("You make it across and find a note");
        System.out.println("note: You're half way out of the cave...");
        System.out.println("You see a hint of fire...");
        System.out.println("You walk around the corner and see a fire king demon!");
        FireKingDemon.FireDemon();
        System.out.println("You continue walking but the floor starts to feel really sticky and wet");
        System.out.println("You turn on you lighter");
        System.out.println("There a huge slime with shields covering its body...");
        System.out.println("It attempts to throw liquid slime balls at you but you dodge out the way.");
        System.out.println("One touch of that and you'll burn to death");
        System.out.println("You're now in a boss fight!");
        Theslime.slime();
        System.out.println();
        System.out.println("You see a rope going up and path going forward");
        ForwardOrUp.fowardOrUp();
        System.out.println();
        System.out.println("You can finally see the cave starting to light up!");
        System.out.println("You must be getting closer to escaping.");
        System.out.println("You reach a dead end..");
        System.out.println("You have to swim across a pool of water to get across...");
        System.out.println("You get in the water anf start swimming... but something seems off...");
        System.out.println("It's a huge octopus!");
        System.out.println("It dashes towards you and you throw you stick... it doesn't travel far in water...");
        System.out.println("The giant octopus destroys your stick by moving straight past it!");
        System.out.println("It's coming fast, you must fight it!");
        OctopusBattle.Octupus();
        System.out.println("You get out the water and make it across!");
        System.out.println("You find a hidden passage on the wall and keep moving forward!");
        System.out.println("As you're walking you see a gargoyle, it starts following you...");
        System.out.println("Every time you look at it, the gargoyle stops moving... but it's obvious that it's following you.");
        System.out.println("No statue just randomly moves on its own...");
        System.out.println("The tension thickens... You turn around once more...");
        System.out.println("THE gargoyle slowly has its eyes turn red, it draws stone sword!");
        System.out.println("You have now entered a boss fight!");
        Gargoyle.gargoyle();
        //add gargoyle boss fight


        System.out.println("You exit the dark area and approach the complete opposite...");
        System.out.println("You enter an area with a lot of lighting, its looks and sounds like electricity!");
//        System.out.println("Wife: Honey wake up");
//        System.out.println("Me: Sorry I just had strange dream...");
//        System.out.println("Congratulations you beat the cave!");
//        endchoice();
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
    public static void endchoice(){
        Scanner decision = new Scanner(System.in);
        System.out.println("What will you do now?");
        System.out.println(1 + ": Play again");
        System.out.println(2 + ": Exit");
        int choice = decision.nextInt();
        if (choice == 1){
            game();
        }else if(choice == 2) {
            System.out.println("See ya!");
            System.exit(0);
        }else{
            System.out.println("invalid input");
            endchoice();
        }
    }
}
