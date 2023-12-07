package cap_6;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese un número entero (o 'q' para salir): ");
            String input = entrada.nextLine();

            if (input.equals("q")) {
                break;
            }

            try {
                int numero = Integer.parseInt(input);

                if (esPar(numero)) {
                    System.out.println(numero + " es par.");
                } else {
                    System.out.println(numero + " es impar.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Inténtalo de nuevo.");
            }
        }

        entrada.close();
    }
    public static boolean esPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }   
}

