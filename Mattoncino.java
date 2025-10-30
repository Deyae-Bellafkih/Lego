public class Mattoncino {
    private int codice;
    private int red;
    private int green;
    private int blue;
    private int peso;
    private int larghezza;
    private int lunghezza;
    private int altezza;

    public Mattoncino (int codice, int red, int green, int blue, int peso, int larghezza, int lunghezza, int altezza) {
        this.codice = codice;
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.peso = peso;
        this.larghezza = larghezza;
        this.lunghezza = lunghezza;
        this.altezza = altezza;
    }

    public int getCodice() {
        return codice;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue(){
        return blue;
    }

    public int getPeso() {
        return peso;
    }

    public int getLarghezza() {
      return larghezza;
    }

    public int getLunghezza() {
        return lunghezza;
    }

    public int getAltezza(){
        return altezza;
    }
}
