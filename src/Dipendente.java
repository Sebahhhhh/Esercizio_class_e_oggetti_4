package dip;

public class Dipendente {

    // Attributi
    private String matricola;
    private double stipendio;
    private double straordinario;

    // Costruttore
    public Dipendente(String mat, double stip, double straord) {
        matricola = mat;
        stipendio = stip;
        straordinario = straord;
    }

    // Restituisce lo stipendio
    public double getStipendio() {
        return stipendio;
    }

    // Calcola la paga
    public double paga(int oreStraordinario) {
        return stipendio + (oreStraordinario * straordinario);
    }

    // Metodi
    public String getMatricola() {
        return matricola;
    }

    public double getStraordinario() {
        return straordinario;
    }
}

