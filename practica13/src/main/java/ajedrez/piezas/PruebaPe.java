package ajedrez.piezas;
import java.util.List;
import java.util.LinkedList;
import ajedrez.piezas.Peon;


public class PruebaPe {
  public static void main (String [] args) {
		int p = 0;

		//Peones Blancos están en la fila 1
		for (int i = 0 ; i <= 7 ; i++ ) {
			p = i+1;
			System.out.println("Peon " + p);
			Peon pe = new Peon(Color.BLANCO, new Posicion(1,i));
			System.out.println("Movimientos que puede hacer el peon: ");
			List<Posicion> mov = pe.obtenerJugadasLegales();
			System.out.println(mov);
		}

		//Peones negros están en la fila 6
		for (int i = 0 ;i <= 7 ; i++ ) {
			p = i+1;
			System.out.println("Peon " + p);
			Peon pe = new Peon(Color.NEGRO, new Posicion(6,i));
			System.out.println("Movimientos que puede hacer el peon: ");
			List<Posicion> mov = pe.obtenerJugadasLegales();
			System.out.println(mov);
		}
	}
}
