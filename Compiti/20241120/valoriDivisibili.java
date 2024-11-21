//Scrivere un programma in Java che permetta dato, un elenco di numeri, di contare quanti sono i valori      divisibili per 3 e quanti sono divisibili per 2

import java.util.Scanner;

public class valoriDivisibili {
  public static void main(String[] args) {
    int [] numeri = new int[10];
    int conta2 =0;
    int conta3 =0;
    Scanner in = new Scanner(System.in);
    for (int i=0; i<10; i++)
      {
        System.out.println("inserisci numero ");
        numeri[i] = in.nextInt();
      }
    for (int i=0; i<10; i++)
      {
        if(numeri[i]%2 == 0)
        {
          conta2++;
        }
        else
        {
          if (numeri[i]%3 == 0)
          {
            conta3++;
          }     
        }
      }
    System.out.println("i numeri divisibili per 2 sono " + conta2);
    System.out.println("i numeri divisibili per 3 sono " + conta3);
  }

}
