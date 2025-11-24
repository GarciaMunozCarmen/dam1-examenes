package com.carmengarcia;

import java.util.Arrays;
import java.util.Scanner;

/* Este programa pasa un input de texto a un array de numeros y si el input es inalido simplemente vuelve a pedirlo*/

public class AnalizarNumeroTexto {
    static Scanner sc = new Scanner(System.in);
    public static boolean isValid (String input){
        String cleanInput = input.replace(",","").replace(" ", "");
        for (char c : cleanInput.toCharArray()) {
            if (!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
    public static int[] textoANumero(){
        String entrada = "";
        do{
            System.out.print("Introduce una lista de números:");
            entrada = sc.nextLine();
        }while(!isValid(entrada));
        String[] arrayTexto = entrada.split(",");
        int[] arrayNumero = new int[arrayTexto.length];
        for (int i = 0; i < arrayTexto.length; i++) {
            try {
                arrayNumero[i] = Integer.parseInt(arrayTexto[i].trim());
            } catch (NumberFormatException e) {
                // System.out.println("Input no válido, por favor introduzca una lista de números");
            }
        }
        return arrayNumero;
    }
    public static void infoArray (int[] n){
        System.out.printf("El array tiene %d elementos%n", n.length);
        int mejor = n[0];
        for (int i = 0; i < n.length; i++) {
            if(mejor < n[i]){
                mejor = n[i];
            }
        }
        int menor = n[0];
        for (int i = 0; i < n.length; i++) {
            if(menor > n[i]){
                menor = n[i];
            }
        }
        System.out.printf("El valor máximo en el array es: %d%nEl valor mínimo en el array es: %d", mejor, menor);
    }
    public static int valorPosicion (int[] n, int posicion){
        int numero = 0;
        try {
            numero = n[posicion];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posición no válida");
        }
        return numero;
    }
    public static void main(String[] args) {
        int [] numero = textoANumero();
        System.out.println(Arrays.toString(numero));
        infoArray(numero);
    }
}
