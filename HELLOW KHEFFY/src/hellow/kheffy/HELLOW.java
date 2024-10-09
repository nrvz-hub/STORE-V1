/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hellow.kheffy;

import java.util.Scanner;

/**
 *
 * @author dmarc
 */


    /**
     */
    public class HELLOW {
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double item1Price = 10.0;
        double item2Price = 15.0;
        double item3Price = 20.0;
        double item4Price = 25.0;
        double item5Price = 30.0;
        
        double total = 0.0;
        do {
            System.out.println("Welcome to the HELLOW KHEFFY!");
            System.out.println("Here are the items we have:");
            System.out.println("1. KHEFFY MOCHA - $" + item1Price);
            System.out.println("2. KHEFFY VANILLA - $" + item2Price);
            System.out.println("3. KHEFFY CHOCO - $" + item3Price);
            System.out.println("4. KHEFFY CARAMEL - $" + item4Price);
            System.out.println("5. KHEFFY BARACO - $" + item5Price);
            System.out.println("\n\t\t!!DISCOUNT!!\nPurchase Total\t|\tDiscounted Price\n"
                    + "$200.00\t|\t5%\n"
                    + "$500.00\t|\t10%");

            System.out.print("Enter the number of the item you want to buy: ");
            int itemNumber = scanner.nextInt();
            switch (itemNumber) {
                case 1:
                    total+=item1Price;
                    break;
                case 2:
                    total+=item2Price;
                    break;
                case 3:
                    total+=item3Price;
                    break;
                case 4:
                    total+=item4Price;
                    break;
                case 5:
                    total+=item5Price;
                    break;
                default:
                    System.out.println("Invalid item number. Please try again.");
                    continue;
            }
            System.out.print("Do you want to buy another item? (y/n): ");
            String answer = scanner.next();
            if (!answer.equalsIgnoreCase("y")) {
                break;
            }
            System.out.println("\nCurrent Total Purchase :"+total);
        } while (true);
        
        while(true){
            System.out.print("Enter the amount of cash you're paying with: ");
            double cash = scanner.nextDouble();
            if (cash < total) {
                System.out.println("You don't have enough cash to buy this item. Please try again.");
                continue;
            }
            if(total>=200.00){
                System.out.println("Discounted Price: "+(total*.05));
                double change = cash - (total*.05);
                System.out.println("Thank you for shopping with us! Your change is $" + change);
                System.out.println("Thank you for shopping with us! Goodbye!"); 
            }else if(total>=500){
                System.out.println("Discounted Price: "+(total*.1));
                double change = cash - (total*.1);
                System.out.println("Thank you for shopping with us! Your change is $" + change);
                System.out.println("Thank you for shopping with us! Goodbye!");
            }else{
                double change = cash - total;
                System.out.println("Thank you for shopping with us! Your change is $" + change);
                System.out.println("Thank you for shopping with us! Goodbye!");
            }
            
            break;
        }
        
    }
    }



