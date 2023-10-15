/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task04;

import java.util.Scanner;


public class Task04 {

  
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Zadejte číslo (0 pro dokončení): ");
            String input = scanner.nextLine();
                int number = Integer.parseInt(input);
                boolean isPrime = true;

                if (number == 0) {
                    System.out.println("Program je kompletní.");
                    break;
                }

                if (number < 0) {
                    System.out.println("Zadejte kladné číslo.");
                    continue;
                }

                System.out.println("Kladní dělitelé čísla " + number + ":");
                for (int i = 1; i <= number; i++) {
                    if (number % i == 0) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
            } 
        
        
           
        

       
        
        
        
        
        
        
        
        
        
      
    }
    
}
