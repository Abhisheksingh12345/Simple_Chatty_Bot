package scr;

import java.util.Scanner;

public class SimpleBot {
    // scanner is declare with final static because scanner with bond with class not with object.
    final static Scanner scanner = new Scanner(System.in);

    /**
     * these are the available function present in Simple Chat Bot Program.
     * these are present in main function .
     *
     * @param args
     */

    public static void main(String[] args) {
        /**
         * In greet function bot will introduce itself again human entity. By default the name of bot is "Acid" and made in "2018".
         */
        greet("Aid", "2018");
        // remindName function will asked the human entity about its information.
        remindName();
        // In guessAge function bot calculate the age of person on the basic of some given parameters by user.
        guessAge();
        // to test the counting capability of bot the count function is used.
        count();
        // test function will help human entity to improve its skill as asking some basic question.
        test();
        // end function simply turn off the bot
        end();
    }

    /**
     * this method indroduce itself in front of person.
     *
     * @param assistantName -> take the String value i.e bot name.
     * @param birthYear     -> take the String value i.e year in which this bot is made.
     */
    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    /**
     * as this method is static therefore the value given the user is get store in name variable permanently untill it get changed further.
     */

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    /**
     * this method guess the human age on the basic of the remainder.
     */
    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    /**
     * this method gives the capability to the bot to count upto user demanded value.
     */

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    /**
     * this function become very useful to enhanced the user remember capability power.
     * In this method the bot will asked some question to user asked correct choice amang ather.
     */
    static void test() {
        System.out.println("Let's test your programming knowledge.");
        // write your code here
        System.out.println("Why do we use methods?\n" +
                "1. To repeat a statement multiple times.\n" +
                "2. To decompose a program into several small subroutines.\n" +
                "3. To determine the execution time of a program.\n" +
                "4. To interrupt the execution of a program.\n");
        int rightAnswer = 2;
        int userAnswer = scanner.nextInt();
        while (rightAnswer != userAnswer) {
            System.out.println("Please, try again.");
            userAnswer = scanner.nextInt();
        }
    }

    //this will end is alway at the last program as this turn off the bot.
    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}
