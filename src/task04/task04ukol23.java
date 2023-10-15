/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task04;
import java.util.Scanner;

public class task04ukol23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Zadejte kladné číslo (0 nebo záporné číslo pro dokončení): ");
            int number = scanner.nextInt();

            if (number <= 0) {
                System.out.println("Program je kompletní.");
                break;
            }

            System.out.print("Jednoduché násobky čísla " + number + ": ");
            for (int i = 2; i <= number; i++) {
                while (number % i == 0) {
                    System.out.print(i + " ");
                    number /= i;
                }
            }
            System.out.println();
        }
    }
}
