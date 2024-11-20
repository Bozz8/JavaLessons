//Scrivere un programma in Java che consenta di verificare se un numero è primo

import java.util.Scanner;

public class nPrimo {
    public static void main(String[] args) {
        System.out.println("inserisci valore ");
        Scanner input = new Scanner(System.in);
        int numero = 0;
        numero = input.nextInt();
        boolean primo = true;
        if (numero == 0 || numero == 1) {
            System.out.println("il valore inserito non è primo ");
        } else {
            for (int i = 2; numero / 2 > i; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }

            }
            if (primo)
                System.out.println("il valore inserito è primo ");
            else
                System.out.println("il valore inserito non è primo ");

        }
    }
}