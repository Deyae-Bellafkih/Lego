public class Test {
    public static void main(String[] args) {
        Mattoncino m1 = new Mattoncino (34,45,120,15,10,11,12);
        Mattoncino m2 = new Mattoncino (250,240,1,30,30,10,5);
        Mattoncino m3 = new Mattoncino (30,20,255,40,2,10,6);
        Mattoncino m4 = new Mattoncino (230,100,200,30,20,20,10);
        Mattoncino m5 = new Mattoncino (0,0,255,20,20,20,5);

        Prodotto p1 = new Prodotto("Castello");
        Prodotto p2 = new Prodotto("Casa");

        System.out.println("Mattoncini che si possono agigungere al prodotto " + p1.getDenominazione());
        p1.aggiungiMattoncino(m1);
        p1.aggiungiMattoncino(m2);
        p1.aggiungiMattoncino(m4);
        p1.aggiungiMattoncino(m5);
        System.out.println();

        System.out.println("Mattoncini che si possono aggiungere al prodotto " + p2.getDenominazione());
        p2.aggiungiMattoncino(m3);
        p2.aggiungiMattoncino(m5);
        p2.aggiungiMattoncino(m2);
        p2.aggiungiMattoncino(m4);
        p2.aggiungiMattoncino(m5);
        System.out.println();

        System.out.println("Le caratteristiche di " + p1.getDenominazione()+  " sono: " + p1);
        System.out.println("Le caratteristiche di " + p2.getDenominazione() + " sono: " + p2);
        System.out.println();

        System.out.println("Specifiche dettagliate dei " + p1.getCounter() + " prodotti sono: ");
        System.out.println("Numero totale di mattoncini in " + p1.getDenominazione() + " è: " + p1.getNumeroMattoncini());
        System.out.println("Peso totale del prodotto " + p1.getDenominazione() + " è: " + p1.getPesoTotale() + " g");
        System.out.println("Numero totale di mattoncini in " + p2.getDenominazione() + " è: " + p2.getNumeroMattoncini());
        System.out.println("Peso totale del prodotto " + p2.getDenominazione() + " è: " + p2.getPesoTotale() + " g");
        System.out.println();

        p1.stampaMattonciniColore(250, 240, 1);
        System.out.println();
        p2.stampaMattonciniColore(230, 100, 200);
        System.out.println();

        System.out.println("Numero di mattoncini con codice 0 nel prodotto " + p1.getDenominazione() + " sono: " + p1.getCodiceMattoncino(2));
        System.out.println("Numero di mattoncini con codice 0 nel prodotto " + p2.getDenominazione() + " sono: " + p2.getCodiceMattoncino(2));
    }
}

