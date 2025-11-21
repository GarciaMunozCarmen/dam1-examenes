package com.carmengarcia;

import java.util.Scanner;

public class GeneradorContraseñas {
    static Scanner sc = new Scanner(System.in);
    public static String newPassword (){
        String password="";
        do {
            System.out.print("Introduce tu nombre: ");
            String name = sc.nextLine();
            System.out.print("Introduce tu ciudad: ");
            String city = sc.nextLine();
            System.out.print("Introduce tu número de la suerte: ");
            int number = sc.nextInt();
            sc.nextLine();
            try {
                password = name.substring(0, 4) + number + city.substring(city.length()-2, city.length());
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("La ciudad o el nombre no son válidos");
            }
        } while (password.equals(""));
        return password;
    }
    public static void main(String[] args) {
        System.out.printf("Tu contraseña es <%s>", newPassword());
    }
}
