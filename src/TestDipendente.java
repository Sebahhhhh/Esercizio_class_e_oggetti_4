package dip;

// Classe di test
public class TestDipendente {
    public static void main(String[] args) {

        // Test
        Dipendente dipendente = new Dipendente("00309", 1000.00, 7.5);

        // Stampa delle informazioni del dipendente
        System.out.println("Informazioni del dipendente creato:");
        System.out.println(":");
        System.out.println("Matricola: " + dipendente.getMatricola());
        System.out.println("Stipendio: " + dipendente.getStipendio());
        System.out.println("Straordinario: " + dipendente.getStraordinario());

        // Calcolo straordinari
        int oreStraordinario = 10;
        double pagaTotale = dipendente.paga(oreStraordinario);
        System.out.println("\nPaga totale con " + oreStraordinario + " ore di straordinario: " + pagaTotale);
    }
}
