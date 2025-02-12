package com.ironhack.lab104;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("************************ Task1 ************************");
        System.out.println("La diferencia del número mayor con el menor es: " + getDifference());

        System.out.println("\n************************ Task2 ************************");
        System.out.println(getSmallest());

        System.out.println("\n************************ Task3 ************************");
        System.out.println("El resultado de la expresión x^2 + ((4y/5) - x)^2 es: " + getResult(5, 2));

    }

    // Task 1
    // Write a Java method that returns the difference between the largest and smallest values in an array of integers.
    // The length of the array must be at least 1.
    public static int getDifference() {
        int[] integers = {2, 45, 100, 5, 150, 30, 300};

        // Inicializo las variables int numMayor y numMenor con la primera posición del array
        // Para compararlas después con cada posición al recorrer el array
        int numMayor = integers[0];
        int numMenor = integers[0];

        // Se inicia en el índice 1 porque el 0 ya se se ha usado para inicializar las variables anteriores
        for (int i = 1; i < integers.length; i++) {
            if (integers[i] > numMayor){
                numMayor = integers[i];
            } else if (integers[i] < numMenor) {
                numMenor = integers[i];
            }
        }

        return numMayor-numMenor;
    }

    // Task 2
    // Write a Java method that finds the smallest and second smallest elements of a given array and prints them to the console.
    public static String getSmallest() {
        int[] integers = {0, 45, 100, 5, 150, 30, 300};

        int smallestFirst = integers[0];
        // smallestSecond empieza desde otra posición del array
        // para asegurar que ambos valores sean distintos y se puedan actualizar durante el bucle
        int smallestSecond = integers[1];
        // ARREGLAR ESTO PORQUE PUEDE DAR MAL LA SALIDA SI LOS MÁS PEQUEÑOS SON DEL MISMO VALOR

        for (int i = 1; i < integers.length; i++) {
            // Comparo el numero actual con el menor encontrado hasta este momento
            if (integers[i] < smallestFirst){
                // Si el número es más pequeño smallestFirst y smallestSecond se actualizan los 2 con ese valor
                smallestSecond = smallestFirst;
                smallestFirst = integers[i];
                // Si el número es menor que smallestSecond y no es el mismo que smallestFirst, sólo actualizo smallestSecond
            } else if (integers[i] < smallestSecond && integers[i] != smallestFirst) {
                smallestSecond = integers[i];
            }

        }

        return "First Smallest: " + smallestFirst + " \nSecond Smallest: " + smallestSecond;
    }

    // Task 3
    // Write a Java method that calculates the result of the following mathematical expression, where x and y are two variables that have been pre-set in your code: x^2 + ((4y/5) - x)^2
    public static double getResult(double x, double y){

        return Math.pow(x, 2) + Math.pow(((4*y/5) - x), 2);
    }
}
