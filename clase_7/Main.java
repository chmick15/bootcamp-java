package clase_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola clase 7");
        Scanner teclado = new Scanner(System.in);

        //Ingresar 5 num y mostrarlos, usando los arrays
        Integer [] numeros = new Integer[5];
        System.out.println("Ingrese 5 numeros, se los mostraré después");

        for (int i = 0; i < numeros.length; i++) {
            int numero = teclado.nextInt();
            numeros[i] = numero;
        }
        System.out.println("fin de los numeros");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El número " + (i + 1) + " es: ");
            System.out.println(numeros[i]);
        }

        //Mostrar el Min y Max de este array
        Integer minValue = 0;
        Integer maxValue = 0;

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] < minValue || minValue == 0){
                minValue = numeros[i];
            } else if (numeros[i] > maxValue) {
                maxValue = numeros[i];
            }
        }
        System.out.println("El valor máximo es: " + maxValue);
        System.out.println("El valor minimo es: " + minValue);

        //Calcular el promedio de los números del Array
        Integer suma = 0;
        float promedio = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        promedio = (float)suma/numeros.length;

        System.out.println("La suma de los números es de: " + suma);
        System.out.println("El promedio de los números es de: " + promedio);

    }
}
