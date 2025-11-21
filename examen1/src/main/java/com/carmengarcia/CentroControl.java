package com.carmengarcia;

import java.util.Scanner;

public class CentroControl {
    static Scanner sc = new Scanner(System.in);
    public static void saludo(){
        System.out.println("¡Hola a todos!\n");
    }
    public static void descuento(){
        do {
            final double DESCUENTO = 0.1;
            System.out.print("Introduce el precio en euros: ");
            double precio = sc.nextDouble();
            if(precio < 0){
                System.out.println("Precio no válido");
                continue;
            }
            double precioDescuento = precio * DESCUENTO;
            System.out.printf("se aplica el desculto del 10%%: %.2f€%n", precioDescuento);
            System.out.printf("El precio final es: %.2f€%n", (precio - precioDescuento));
            break;
            //Sé que no es la mejor forma de hacerlo, pero es lo mejor que se me ha ocurrido
        } while (true);
    }
    public static void temperatura(){
        System.out.print("Introduce la temperatura: ");
        int grados = sc.nextInt();
        if(grados <= 15){
            System.out.println("Hace frío");
        }else if(grados <= 25){
            System.out.println("No hace ni frío ni calor");
        }else{
            System.out.println("Hace calor");
        }
    }
    public static void menu(){
        int option = 0;
        do {
            System.out.printf("=== CENTRO DE CONTROL ===%n1. Mostrar saludo%n2. Calcular descuento%n3. Evaluar temperatura%n4. Salir%n");
            System.out.print("Introduce una opción: ");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1 -> saludo();
                case 2 -> descuento();
                case 3 -> temperatura();
                case 4 -> System.out.println("Adios");
                default -> System.out.println("Opción no válida");
            }
        } while (option != 4);
    }
    public static void main(String[] args) {
        menu();
    }
}
