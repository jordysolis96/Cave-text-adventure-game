import java.sql.SQLOutput;
import  java.util.Scanner;


public class Cave {

    public static void game() {
        Scanner decision = new Scanner(System.in);
        System.out.println("BOOM!");
        System.out.println("......");
        System.out.println("The airplane you were riding has suddenly crashed into a cave...");
        System.out.println("The cave ceiling must be really brittle to break the roof of the cave.");
        System.out.println("the roof it to high for you to climb out of the cave...");
        System.out.println("Everyone appears to have died in the crash and you're very injured.");
        System.out.println("There are some tools and open suit cases on the floor that got out the plane when it crashed.");
        System.out.println("You salvage around the floor for some tools and gathers some items.");
        System.out.println("It appears you only have a axe, sticks, a knife, and a lighter.");
        System.out.println("you will need to fight your way out using your weapons.");
        System.out.println("You make your way through a narrow path that seems to have a weird smell.");
        System.out.println("You hear a ugly laugh coming from the depths of the cave a decide to approach it.");
        System.out.println("There are footsteps that seem to be getting louder...");
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
        System.out.println("You keep walking.");
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
        System.out.println();
        System.out.println("You continue to make your way out the cave.");
        System.out.println("You see two doors...");
        System.out.println("One to your left, and one to your right.");
        Doors.doors();
        System.out.println();
        System.out.println("The room has a lot of mist in it...");
        System.out.println("You can't see very well but you can tell something else is in the room with you...");
        System.out.println("Out of the mist you see a man appear, but he seems to be mixed with a fox.");
        System.out.println("It dashes straight passed you and almost bit you... it's ridiculously fast.");
        System.out.println("You'll have to fight your way out of this one...");
        HalfHumanHalfFox.foxBoss();
        System.out.println("You continue walking...");
        System.out.println("There's a mine cart that leads to a room for of electricity...");
        System.out.println("There's also a door directly in front of you, although it feels kind of hot...");
        CartOrDoor.cartOrDoor();
        System.out.println("You get out of the mine cart.");
        System.out.println("Directly afterwards a bolt a lighting zaps the mine cart into pieces...");
        System.out.println("There's a mad scientist right in front of you!");
        System.out.println("He has a lot of electrical weapon at his disposal.");
        System.out.println("Mad scientist: Hello there, you look like you'd make a fine test subject. LET ME TAKE YOUR BODY!");
        System.out.println("The mad scientist opens three crates... out of them come out three bodies.");
        System.out.println("Each body has a chip anf look technically advanced...");
        System.out.println("Mad scientist: attack my minions!");
        System.out.println("The three minions rush you!");
        System.out.println("You are now in a boss fight.");
        TheThreeMinions.TheThree();
        System.out.println("Mad scientist: I see... very impressive.");
        System.out.println("Mad scientist: Those berries are very useful...");
        System.out.println("Mad scientist: I want to have them for my own research purposes!");
        System.out.println("Mad scientist: Cut you a deal...");
        System.out.println("Mad scientist: Let me have the sack of berries and i'll show you the way out of this dump!");
        System.out.println("Mad scientist: What do you say?");
        System.out.println();
        GiveOrKeep.giveOrKeep();
        System.out.println("The scientist attempt to steal your berries!");
        System.out.println("Mad scientist: fine... if you don't want to give them to me, i'll just kill you for them!");
        System.out.println("The scientist tries to kill you with his crafted electrical weapons.");
        TheMadScientist.ScientistBoss();
        System.out.println();
        System.out.println("There's a gun that the scientist dropped.");
        System.out.println("It looks powerful, but something seems off...");
        Gun.gun();
        System.out.println("It looks like theres a elevator, it looks very old");
        System.out.println("There's a lever, it look like it can be pulled towards you, pushed forward, and pushed left or right");
        System.out.println("But at the moment it can only pulled and pushed away...");
        pushOrPull.PushOrPull();
        System.out.println();
        System.out.println("You come to a stop, this time the lever will only go left or right...");
        LeftOrRight.leftOrRight();
        System.out.println("The only thing in this blank white room is the seats of the princes.");
        System.out.println("The twin princes: The king is on the other side of this door.");
        System.out.println("King of the cave might seem like an ugly title, but the power father holds shouldn't be taken so lightly.");
        System.out.println("Father has been watching you, he'd like to join forces...");
        System.out.println("He wishes for you to join under him as a royal guard.");
        System.out.println("deny this offer and leave, because any furhter action will be looked at as you trying to take over the thrown...");
        System.out.println("You'll have to fight foather for that, that is of course you can make it past us...");
        System.out.println("Anyways, what do you say? Will you join under the king?");
        join.Join();
        System.out.println("The twin princes: If that's the case we have no option but to kill you where you stand.");
        System.out.println("The twin princes: Brace yourself human, before we let you die, we'll allow you to experience something far worse than death.");
        System.out.println("The twin prices approach you in a dominant manner. You doubt if you can pull this one off...");
        //add another choice option
        //the old king boss fight(final boss) next

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
