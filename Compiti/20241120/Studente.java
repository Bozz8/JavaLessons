//Scrivere un programma in Java che permetta di acquisire l'età ed il nome di due studenti e risponda indicando il nome dello studente con età maggiore

import java.util.Scanner; 

public class Studente
{    
    private String nome;
    private int eta;

    public Studente(String nome, int eta)
    {
        this.nome = nome;
        this.eta = eta;        
    }

    public int getEta()
    {
        return eta;        
    }

    public String getNome()
    {
        return nome;
    }

    

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String nome;
        int eta;
        System.out.println("inserire nome");
        nome = input.nextLine();
        System.out.println("inserire età");
        eta = input.nextInt();
        Studente studente1 = new Studente (nome, eta);
        System.out.println("inserire nome");
        input.nextLine();
        nome = input.nextLine();
        System.out.println("inserire età");
        eta = input.nextInt();
        Studente studente2 = new Studente (nome, eta);
        System.out.println("il nome di studente1 è: " + studente1.getNome());   
        System.out.println("il nome di studente2 è: " + studente2.getNome());
        if(studente1.getEta()<studente2.getEta())
        {
            System.out.println("lo studente con l'età maggiore è: " + studente2.getNome());
        }
        else
        {
            System.out.println("lo studente con l'età maggiore è: " + studente1.getNome());
        }
    }
}