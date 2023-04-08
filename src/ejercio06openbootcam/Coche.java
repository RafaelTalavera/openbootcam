
package ejercio06openbootcam;


public class Coche {
    private int numPuertas;

    public Coche(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void incrementarPuertas() {
        this.numPuertas++;
    }

    public int getNumPuertas() {
        return numPuertas;
    }
}