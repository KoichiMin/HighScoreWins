package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Pleaser enter a game score: ");
        String score = scanner.nextLine();

        String[] listScore = score.split("[:|]");

        if(Integer.parseInt(listScore[2]) > Integer.parseInt(listScore[3])){
            System.out.println("Winner: " + listScore[0]);
        } else{
            System.out.println("Winner: " + listScore[1]);
        }


    }

}
