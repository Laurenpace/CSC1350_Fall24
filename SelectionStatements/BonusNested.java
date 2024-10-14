package CSC1350_Fall24.SelectionStatements;

import java.util.Scanner;

public class BonusNested {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your score: ");
        double score = in.nextDouble();

        if(score >= 85 ){
            score += score * 0.05;
            if (score > 100) {
                score = 100;
            }

            System.out.printf("Your final score is: %.2f\n", score);
        }
        else
            System.out.println("No bonus");
    }


}

