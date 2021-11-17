/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contraseñas_aleatoria;

import java.util.Random;

/**
 *
 * @author nacho
 */
public class Contraseñas_Aleatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Llamo a la clase Random para generar numeros aleatorios 
        Random numAleatorio = new Random();
        //Declaro e inicializo variables
        String contraseña = "";
        //Declaro e inicializo variables
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        // Bucle de control para que no se repitan los numeros
        do {
            numero1 = numAleatorio.nextInt(8) + 1;
            numero2 = numAleatorio.nextInt(8) + 1;
            numero3 = numAleatorio.nextInt(8) + 1;
            numero4 = numAleatorio.nextInt(8) + 1;

        } while (!(numero1 != numero2) && (numero3 != numero4));
        //imprimo por pantalla los nuemeros aleatorios 
        System.out.println("los numeros son=  " + numero1 + " - " + numero2 + " - " + numero3 + " - " + numero4);
        // creo variable resultado para usarlo en las retricciones de las del ejerccio; suma de numero 1 y numero 4 debe ser impar
        int controlSuma = numero1 + numero4;
        if (!(controlSuma % 2 == 0)) {

        } else {
            System.out.println("No es impar");
        }
        // la tercera restricción es que la multiplicación del numero2 y numero3 sea par
        int controMultipl = numero2 * numero3;
        if (controMultipl % 2 == 0) {

        } else {
            System.out.println("No es par");
        };
        System.out.println("se cumple las dos restricciones");

        //AÑADO LETRA MAYUSCULA DE LA "F" A LA "X", F=70 y X=88
        contraseña = "" + numero1 + numero2 + numero3 + numero4 + (char) numAleatorio(70, 80);

        System.out.println(contraseña);
    }
}
