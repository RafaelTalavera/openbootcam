

package ejercio06openbootcam;


public class Ejercio06OpenBootCam {

public static void main(String[] args) {
    Coche miCoche = new Coche(3);
    miCoche.incrementarPuertas();
    System.out.println("Mi coche tiene " + miCoche.getNumPuertas() + " puertas");
}
}