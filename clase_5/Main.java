package clase_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Hola Mundo ");
        Scanner lector = new Scanner(System.in);

        //Calculadora de edad de perro
        /*
        System.out.println("Tell me how old your dog is, and I'll tell you how old he'd be if he were human: ");
        int age = lector.nextInt();
        Integer dogAge = age * 7;
        System.out.println("If your dog were a human being, he would have: " + dogAge + " years old !");
        */

        //Convertir millas a kilometro
        /*
        System.out.println("Give me a distance using miles, I'll convert for you into kilometers: ");
        int miles = lector.nextInt();
        Double kilometers = miles * 1.60934;
        System.out.println("For your information: " + miles  + " miles represent: " + kilometers +" kilometers !" );
        */

        //Calculadora de descuento
        /*
       System.out.println("I'll calculate the price after the discount for you !");
        System.out.println("First, give me the original price of the product: ");
        int price = lector.nextInt();
        System.out.println("Second, give me the percentage of discount: ");
        int discount = lector.nextInt();
        int finalPrice = price - (price * discount / 100);
        System.out.println("You are going to pay your product: " + finalPrice
                + "€. The original price was: " + price + "€ and you had " + discount + "% off !");
         */

        //Calculadora de propinas
        /*
        System.out.println("I'll calculate how much tip you're going to earn !");
        System.out.println("First, tell me how much was the bill: ");
        double bill = lector.nextDouble();
        System.out.println("Second, tell me the percentage of tip does the client want to give you: ");
        double percentage = lector.nextDouble();
        double tip = bill * (percentage/100);
        System.out.println("You are going to receive a tip of: " + tip + "€.");
        System.out.println((10/100));
         */

        //Adivina el número
        /*
        System.out.println("Try to guess the number between 1 & 50");
        Integer randomNumber = (int)(Math.random() * 10 + 1);
        int guess = lector.nextInt();

        while(guess != randomNumber){
            if(guess > randomNumber){
                System.out.println(("Too high"));
            } else if (guess < randomNumber){
                System.out.println("Too low !");
            }
            guess = lector.nextInt();
        }
        System.out.println("You won !");
         */

        //Carga 3 números y mostrar cual es el mayor y cual es el menor
        /*
        System.out.println("Introduce three numbers and I'll tell you which one is the biggest, and smallest one");
        System.out.println("Introduce the first one: ");
        Integer num1 = lector.nextInt();
        System.out.println("Introduce the second one: ");
        Integer num2 = lector.nextInt();
        System.out.println("Introduce the third one: ");
        Integer num3 = lector.nextInt();
        if(num1 > num2 && num1 > num3 && num2 > num3){
            System.out.println("The biggest number is " + num1);
            System.out.println("The smallest number is " + num3);
        } else if (num1 > num2 && num1 > num3 && num2 < num3) {
            System.out.println("The biggest number is " + num1);
            System.out.println("The smallest number is " + num2);
        } else if (num2 > num1 && num2 > num3 && num1 > num3) {
            System.out.println("The biggest number is " + num2);
            System.out.println("The smallest number is " + num3);
        } else if (num2 > num1 && num2 > num3 && num1 < num3) {
            System.out.println("The biggest number is " + num2);
            System.out.println("The smallest number is " + num1);
        } else if (num3 > num1 && num3 > num2 && num1 > num2) {
            System.out.println("The biggest number is " + num3);
            System.out.println("The smallest number is " + num2);
        } else if (num3 > num1 && num3 > num2 && num1 < num2) {
            System.out.println("The biggest number is " + num3);
            System.out.println("The smallest number is " + num1);
        } else if (num1 == num2 || num1 == num3 || num2 == num3){
            System.out.println("You've got twice the same number");
        }
        */


    }
}
