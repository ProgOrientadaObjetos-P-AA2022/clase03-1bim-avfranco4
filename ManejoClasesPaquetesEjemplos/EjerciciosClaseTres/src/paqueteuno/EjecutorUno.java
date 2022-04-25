package paqueteuno;

import ejerciciosclasetres.Pelicula;
/**
 *
 * @author reroes
 */
public class EjecutorUno {
    public static void main(String[] args) {
        Pelicula p = new Pelicula();
        int valor = 10;
        p.setVersion(valor);
        System.out.printf("%d",p.getVersion());
    }
}
