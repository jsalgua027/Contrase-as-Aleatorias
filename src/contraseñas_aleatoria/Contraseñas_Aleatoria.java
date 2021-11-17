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
        Random numAleatorio = new Random();

        int numero1;
        int numero2;
        int numero3;
        int numero4;

        numero1 = numAleatorio.nextInt(8) + 1;
        System.out.println(numero1);

    }

}
