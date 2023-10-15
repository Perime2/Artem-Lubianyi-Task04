/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task04;
import java.util.Scanner;

public class task04ukol22 {
    
    
   

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Pro zjednodušení zadejte číslo, které chcete otestovat: ");
            int number = scanner.nextInt();

            boolean isPrime = true;

            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println("Prosté číslo ");
            } else {
                System.out.println(" neni prostoje");
            }
            
            System.out.println("Program je kompletní.");
        }


    }
}
    
    
    
}
