public class Mattoncino {
    private static int counter = 0;
    private int codice;
    private int red;
    private int green;
    private int blue;
    private int peso;
    private int larghezza;
    private int lunghezza;
    private int altezza;

    public Mattoncino(int red, int green, int blue, int peso, int larghezza, int lunghezza, int altezza) {
        this.codice = counter++;
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

    public int getBlue() {
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

    public int getAltezza() {
        return altezza;
    }

    public String toString() {
        return "Mattoncino [codice = " + codice + "," + "colori =(" + red + "," + green + "," + blue + ")," + "peso = " + peso + "g" + "," + "lunghezza = " + lunghezza + "mm," + "larghezza = " + larghezza + "mm," + "altezza = " + altezza + "mm]";
    }
}



