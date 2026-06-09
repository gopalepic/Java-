 package code.basic;

import java.util.Scanner;

class ArthematicOperations {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
 
        System.out.println("The sum of the two numbers is: " + sum);
        System.out.println("The difference of the two numbers is: " + difference);
        System.out.println("The product of the two numbers is: " + product);
        System.out.println("The quotient of the two numbers is: " + quotient);
     }
    
}