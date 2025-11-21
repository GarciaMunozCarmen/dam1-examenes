package com.carmengarcia;

import java.util.Scanner;

public class CalculoJubilacion {
    public static int anioJubilacion(int edad, int jubilacion){
        return (jubilacion - edad);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduce tu edad de jubilación: ");
        int edadJubilacion = sc.nextInt();
        int cuentaAtrasJubilacion = anioJubilacion(edad, edadJubilacion);
        if(cuentaAtrasJubilacion > 0){
            System.out.printf("Te quedan %d años para la jubilación", cuentaAtrasJubilacion);
        }else if(cuentaAtrasJubilacion <= 0){
            System.out.println("Ya has alcanzado la jubilación");
        }
        sc.close();
    }
}