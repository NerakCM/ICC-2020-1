package ajedrez.piezas;
import ajedrez.Tablero;
import java.util.List;
import java.util.LinkedList;



public class Dama extends Pieza {

  public Dama (Color color, Posicion posicion){
    super(color,posicion);
  }

	@Override
    public List<Posicion> obtenerJugadasLegales(){
    LinkedList<Posicion> jugadas = new LinkedList<>();
    int fila = obtenerPosicion().obtenerFila(),
        columna = obtenerPosicion().obtenerColumna();
    Color color = obtenerColor();
    Tablero tab = Tablero.obtenerInstancia();

  
    //Avanza diagonalmente 
        for ( int i = fila - 1, j = columna - 1; i >= 0 && j >= 0; i --, j--){ 
        	Pieza p = tab.obtenerPosicion (i, j);
        	if (p == null){
        		jugadas.add(new Posicion (i,j)); 
        	}else{
        		if (p.obtenerColor() != obtenerColor()){
        		jugadas.add(new Posicion (i,j)); 
        	}
        	break;
        }   
    }

        for (int i = fila - 1 ,j = columna + 1; i >= 0 && j <= 7 ; i--,j++) {
            Pieza p = tab.obtenerPieza(i,j);
            if (p == null) {
                jugadas.add(new Posicion (i,j));
            }else{
                if (p.obtenerColor() != obtenerColor()) {
                jugadas.add(new Posicion (i,j));
            }
            break;
        }
    }

        for (int i = fila + 1, j = columna - 1; j <= 7 && i >= 0; i++, j--) {
            Pieza p = tab.obtenerPieza(i,j);
            if (p == null) {
                jugadas.add(new Posicion (i,j));
            }else{
                if (p.obtenerColor() != obtenerColor()) {
                jugadas.add(new Posicion (i,j));
            }
            break;
        }
    }

        for (int i = columna + 1,j = fila + 1; i <= 7 && j <= 7; i++,j++) {
            Pieza p = tab.obtenerPieza(i,j);
            if (p == null) {
                jugadas.add(new Posicion (i,j));
            }else{
                if (p.obtenerColor() != obtenerColor()) {
                jugadas.add(new Posicion (i,j));
            }
            break;
      }
    }

    //Avanza hacía la derecha
        for (int i = columna + 1; i <= 7; i++) {
            Pieza p = tab.obtenerPieza(fila, i);
            if (p == null) {
                jugadas.add(new Posicion (fila, i));
        }else{
            if (p.obtenerColor() != obtenerColor()) {
            jugadas.add(new Posicion (fila, i));
        }
        break;
      }
    }

    //Avanza hacía la izquierda
        for (int i = columna - 1; i >= 0 ; i--) {
            Pieza p = tab.obtenerPieza(fila, i);
            if (p == null) {
                jugadas.add(new Posicion (fila, i));
        }else{
            if (p.obtenerColor() != obtenerColor()) {
            jugadas.add(new Posicion (fila,i));
        }
        break;
      }
    }

    //Va avanzándo hacía el 0
        for (int i = fila - 1; i >= 0 ; i--) {
            Pieza p = tab.obtenerPieza(i,columna);
            if (p == null) {
                jugadas.add(new Posicion (i, columna));
        }else{
            if (p.obtenerColor() != obtenerColor()) {
            jugadas.add(new Posicion (i, columna));
        }
        break;
      }
    }

    //Va avanzándo hacía el 7
        for (int i = fila + 1; i <= 7 ; i++) {
            Pieza p = tab.obtenerPieza(i,columna);
            if (p == null) {
                jugadas.add(new Posicion (i, columna));
        }else{
            if (p.obtenerColor() != obtenerColor()) {
            jugadas.add(new Posicion (i, columna));
        }
        break;
      }
    }
    return jugadas;
  }
}