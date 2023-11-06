/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1maverick_perez;

import java.util.Scanner;

/**
 *
 * @author maver
 */
public class Examen1Maverick_Perez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int menu = 0;
        while (menu < 3) {//ciclo while
            System.out.println("Inserte la opcion menu"
                    + "1. Ejercicios de strings"
                    + "2. Respuestas a preguntas ");
            menu = entrada.nextInt();
            switch (menu) {//un switch para los diferentes caso del menu 
                case 1://caso 1 cadena uwu
                    String texto="";
                    System.out.println("cadena ingresada: ");
                    texto = entrada.next();
   
                    break;
                case 2://owo
                    System.out.print(" a) //- el while es para manener el ciclo cuando el usuario ingresa haasta que termine");
                    System.out.println("En el do while es una variante de la misma solo que este sera una sola vez el ciclo ");
                    System.out.println("b) //- el indexof() es indice por paracter qe basicamente se para saber en que posicion odemos usar la siguiente\n"
                            + "función considerando que retornara al inicio");
                    System.out.println("El charAt() obtener el caracter desde la posicion inicial que es 0  hasta la que le indiiquemos");
                    break;

            }

        }
    }

}
