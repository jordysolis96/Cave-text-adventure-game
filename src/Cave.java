import  java.util.Scanner;


public class Cave {

    public static void game(){
       Scanner decision = new Scanner(System.in);
        System.out.println("BOOM!!!");
        System.out.println(".......");
        System.out.println("It looks like the airplane you were riding has suddenly crashed into a cave...");
        System.out.println("you will need to fight your way out using your weapons");
        System.out.println("It appears you only have a axe, sticks, a knife, and a lighter");
        System.out.println("There's a goblin up ahead blocking your path");
        goblinBossFight();
        System.out.println("Congratulations on beating the goblin!");
        System.out.println("But the fight isn't over yet...");
    }


    public static void goblinBossFight(){
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
            System.exit(0);
        }else if(choice == 2){
            System.out.println("The stick penetrated his fragile skin!");
            System.out.println("You've also collected a dagger from his pocket...");
            System.out.println("-----------------------------------------------------");
        }else if(choice == 3){
            System.out.println("The goblin doges and stabs you with a dagger!");
            System.out.println("GAME OVER");
            System.exit(0);
        }else if(choice == 4){
            System.out.println("The lighter won't reach from here, try a different option");
            goblinBossFight();
        }else{
            System.out.println("invalid input");
            goblinBossFight();
        }
    }
}
