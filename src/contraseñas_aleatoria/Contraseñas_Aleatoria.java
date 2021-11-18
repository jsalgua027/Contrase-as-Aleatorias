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

        } while ((numero1 == numero2) || (numero1 == numero3) || (numero1 == numero4) || (numero2 == numero3) || (numero2 == numero4)
                || (numero3 == numero4) || ((numero1+numero4)%2!=0) || ((numero2*numero3)%2==0));
      
    }
}
