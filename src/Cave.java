import  java.util.Scanner;


public class Cave {

    public static void game(){
        Scanner decision = new Scanner(System.in);
        System.out.println("BOOM!!!");
        System.out.println(".......");
        System.out.println("It looks like the airplane you were riding has suddenly crashed into a cave...");
        System.out.println("you will need to fight your way out using your weapons");
        System.out.println("It appears you only have a axe, sticks, a knife, and a lighter");
        System.out.println("There's a goblin up ahead blocking you path, what would you like to attack it with?");
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
            System.out.println("The stick penetrated his fragile skin! You've also collected a dagger from his pocket...");
        }else if(choice == 3){
            System.out.println("The goblin doges and stabs you with a dagger!");
            System.out.println("GAME OVER");
            System.exit(0);
        }else if(choice == 4){
            System.out.println("The lighter won't reach from here, try a different option");
            goblinWeapons();
        }else{
            System.out.println("invalid input");
            goblinWeapons();
        }
    }


    public static void goblinWeapons(){
        System.out.println(1 + ": axe");
        System.out.println(2 + ": Stick");
        System.out.println(3 + ": knife");
        System.out.println(4 + ": lighter");
    }


}
