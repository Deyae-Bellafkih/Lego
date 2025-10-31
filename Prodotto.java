public class Prodotto {
    private static int counter = 0;
    private int codice;
    private String denominazione;
    private Mattoncino[] mattoncini;
    private int count;

    public String getDenominazione() {
        return denominazione;
    }

    public int getCounter() {
        return counter;
    }

    public Prodotto(String denominazione) {
        this.codice = counter++;
        this.denominazione = denominazione;
        this.mattoncini = new Mattoncino[2346];
        this.count = 0;
    }

    public void aggiungiMattoncino(Mattoncino m) {
        for (int i = 0; i > count; i++) {
            if (mattoncini[i].equals(m)) {
                System.out.println("Mattoncino già esistente");
                return;
            }
        }
        if (count < mattoncini.length) {
            mattoncini[count++] = m;
            System.out.println("Mattoncino aggiunto al prodotto " + denominazione);
        } else {
            System.out.println("Non c'è più spazio per altri mattoncini");

        }
    }

    public int getNumeroMattoncini() {
        return count;
    }

    public int getPesoTotale() {
        int peso_totale = 0;
        for (int i = 0; i < count; i++) {
            peso_totale = peso_totale + mattoncini[i].getPeso();
        }
        return peso_totale;
    }

    public void stampaMattonciniColore(int r, int g, int b) {
        System.out.println("Mattoncini del colore (" + r + "," + g + "," + b + ") del prodotto " + denominazione + " sono:");
        for (int i = 0; i < count; i++) {
            Mattoncino m = mattoncini[i];
            if (m.getRed() == r && m.getGreen() == g && m.getBlue() == b) {
                System.out.println(m);
            }
        }
    }

    public int getCodiceMattoncino(int codiceMattoncino) {
        int n = 0;
        for (int i = 0; i < count; i++) {
            if (mattoncini[i].getCodice() == codiceMattoncino) {
                n++;
            }
        }
        return n;
    }

    public String toString() {
        return "Prodotto LEGO [codice=" + codice + ", denominazione=" + denominazione + ", mattoncini=" + count + "]";
    }
}










