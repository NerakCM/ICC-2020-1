package ajedrez.piezas;
import ajedrez.Tablero;
import java.util.List;
import java.util.LinkedList;

public class PruebaDama {

	public static void main(String[] args) {
        Tablero tab = Tablero.obtenerInstancia();

        Pieza p = tab.obtenerPieza(4,3);
        System.out.println("Puede avanzar a las siguientes posiciones: " + p.obtenerJugadasLegales());
    }
}