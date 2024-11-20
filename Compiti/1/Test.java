import java.util.Scanner; //La classe Scanner serve per prendere l'input da tastiera

public class Test {
    private String nome;
    private String cognome;

    public Test(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }
     public Test (){
    this.nome = "daniele";
     }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {return nome;}

    public static void main(String[] args) {
        Test persona = new Test("Alessandro", "Bozzotta");
        Test persona1 = new Test();
        System.out.println("Benvenuto!");
        Scanner input = new Scanner(System.in); // Creo un oggetto di tipo Scanner
        System.out.println("Inserisci il tuo nome: "); // Stampo a video
        String nome = input.nextLine(); // Prendo l'input da tastiera
        System.out.println("Nome inserito: " + nome);
        persona1.setNome(nome);
        System.out.println("Nome dell'oggetto: " + persona.getNome());
        System.out.println("il nome dell'oggetto persona1 è: " + persona1.getNome()); 
    }
}