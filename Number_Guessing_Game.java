import java.util.*;

public class Number_Guessing_Game {
    
    public static void NumberGuessingGame() {
        Random x = new Random();
        int n = x.nextInt(100);
        int y = (int)(Math.ceil(Math.log(100)));
        int score = 100;
        System.out.println();
        System.out.println("You have only " + y + " chances.....");
        Scanner sc = new Scanner(System.in);
        int a ;
        for(a = 0; a < y; a++) {
            System.out.println("Enter the Number :");
            int guessing = sc.nextInt();

            if(guessing == n){
                System.out.println("Congratulations ! You Won....");
                System.out.println("You guessed " + guessing + "in attempt " + (a + 1));
                System.out.println("Your Score is " + score + "!! \n");
                break;
            }
            else if (guessing > n){
                if (guessing - n > 25){
                    System.out.println("Extremely High");
                }
                else{
                    System.out.println("little High");
                }
            }
            else{
                if(n - guessing > 25){
                    System.out.println("Extremely Low");
                }
                else{
                    System.out.println("Little Low");
                }
            }
            score = score - 10; 
        }
        if( a == y) {
            System.out.println("Your Guessing is wrong .The actual number is " +n);
            System.out.println("Better Luck next time !!");
            score = 0;
            System.out.println("Your Score is " +score+ "\n");
        }

    }
    public static void main (String [] args) {
        System.out.println("Select what you want :");
        System.out.println("1.Next Round\n2.Exit");
        System.out.println("Enter your choice :");
        Scanner scan = new Scanner(System.in);
        int want = scan.nextInt();
        if(want == 1) {
            NumberGuessingGame();
            while(want == 1){
                System.out.println();
                System.out.println("Select what you want :");
                System.out.println("1.Next Round\n2.Exit");
                System.out.println("Enter you choice");
                    int in = scan.nextInt();
                        if(in == 1){
                            NumberGuessingGame();
                        }
                        else if(in == 2) {
                            System.exit(0);
                        }
                        else {
                            System.out.println("Error !! Enter only from 1 and 2 choices ");
                        }
            }
        }
        else if(want == 2) {
            System.exit(0);
        }
        System.out.println("Error !! Enter only from 1 and 2 choices");
    }
    
}