package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random random = new Random();
        Scanner answer = new Scanner(System.in);
        int high = 20;
        int low = 0;
        int number = random.nextInt(high);
        System.out.println("Hello! What is your name?");
        String name = answer.nextLine();
        System.out.println("Well"+ name +", I am thinking of a number between 1 and 20.");

        while(Integer.parseInt(String.valueOf(low)) != number);
        {
            low++;
            System.out.println("Take a guess");
            low = Integer.parseInt(answer.nextLine());
            if (Integer.parseInt(String.valueOf(low)) > number) {
                System.out.println("Your guess was too high");
            } else if (Integer.parseInt(String.valueOf(low)) < number) {
                System.out.println("Your guess was too low");
            } else if (Integer.parseInt(String.valueOf(low)) == number) {
                System.out.println("Good job, " + name + "! You guess my number " + number + " in " + counter + " guesses!!");
                System.out.println("Would you like to play again? (y/n)");
                String last = answer.nextLine();
                if (last.equals("y")) {
                Scanner rand = null;
                int hi = 0;
                number = rand.nextInt(hi);
                low = Integer.parseInt("0");
                    } else; {
                }
            }
        }
    }
}

