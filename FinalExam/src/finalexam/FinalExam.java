/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalexam;

import java.util.Scanner;

/**
 *
 * @author pdearmas15
 */
public class FinalExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Odd/Even Checker!");

        String option = "y";
        while (option.equalsIgnoreCase("y")) {

            int numberUser = Console.getInt("\nEnter an integer: ");

            String numberStg = String.valueOf(numberUser);

            MyConsole number = new MyConsole(numberStg);

            String evenOdd = "";
            if ((numberUser % 2) == 0) {
                evenOdd = "even.";
            } else {
                evenOdd = "odd.";
            }
            
             System.out.println(number + evenOdd);

            //Validate continue statement
            boolean continueOpt = false;
            while (!continueOpt) {
                System.out.print("\nContinue? (y/n): ");
                option = sc.nextLine();

                if (option.equalsIgnoreCase("y") || option.equalsIgnoreCase("n")) {
                    continueOpt = true;
                } else if (option.isEmpty()) {
                    System.out.println("Error! This entry is required. Try again.");
                }
            }
        }

    }
}
