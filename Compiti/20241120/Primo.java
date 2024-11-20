//Scrivere un programma in Java che consenta di verificare se un numero è primo

import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        System.out.println("inserisci valore ");
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        
            if (isprimo(numero)) // Se non specifico nessuna condizione [es. x > y] quello dentro parentesi si legge come: se il risultato di isprimo è true entra nel ramo vero altrimenti vai nel ramo falso
                System.out.println("Il numero " + numero + " è primo!");
            else
                System.out.println("Il numero " + numero + " non è primo!");
        }
    
    
    public static boolean isprimo(int numero) 
    {
        // Caso banale, se il numero inserito è 0 o 1 è sicuramente primo.
        if (numero == 0 || numero == 1)
            return false;
        else
        {
            for (int i = 2; i < numero; i++)
                if (numero % i == 0)
                    return false;
        }
        return true;
    }
}
    