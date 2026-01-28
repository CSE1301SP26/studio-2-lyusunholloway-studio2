
import java.util.Scanner;

public class Ruin {


public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("What are you starting with? ");
    int startAmount = scan.nextInt();
    System.out.println("Enter the odds of winning: ");
    double winOdds = scan.nextDouble();
    System.out.println("Enter a win limit: ");
    int winLimit = scan.nextInt();
    System.out.println("Number of simulations: ");
    int numSimulations = scan.nextInt();

    int totalMoney = startAmount;
    int wonMoney = 0;
    int numWins = 0;
    int numRuins = 0;

    for (int i = 0; i < numSimulations; i++){

        while (wonMoney < winLimit && totalMoney > 0){

            double dice = Math.random();
            if (dice <=  winOdds){
                wonMoney ++;
                totalMoney ++;
                System.out.println("Won, money remaining is "+totalMoney);
            }
            else{
                wonMoney --;
                totalMoney --;
                System.out.println("Lost, money remaining is "+totalMoney);
            }
            
        }

        if (totalMoney > 0){
            System.out.println("cashed out");
            numWins++;
        }
        else{
            System.out.println("ruin");
            numRuins++;
        }
}

    System.out.println("You won " + numWins + " times!");
    System.out.println("You lost " + numRuins + " times!");

}



}
