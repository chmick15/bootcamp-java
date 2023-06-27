package clase_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Hola Mundo ");
        Scanner lector = new Scanner(System.in);

        //Calculadora de edad de perro
        /*
        System.out.println("Give me your Human age, I'll tell you your dog age: ");
        int age = lector.nextInt();
        Integer dogAge = age * 7;
        System.out.println("You are " + age  + " years old !" + " but if you were a dog you would have: " + dogAge + " years old !");
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
    }
}
