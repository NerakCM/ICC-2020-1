package ajedrez.piezas;

import java.util.List;
import ajedrez.piezas.Posicion;
/**
 * Clase abstracta de la que heredaran las piezas del ajedrez
*/
public abstract class Pieza {

  private Color color;
  private Posicion posicion;

  /**
   * Constructor
   * @param color - color que se asignara
   * @param posicion - posicion que se asignara
  */
  public Pieza (Color color, Posicion posicion){
    this.color = color;
    this.posicion = posicion;
  }

  public abstract List<Posicion> obtenerJugadasLegales();

  /**
   * Metodo que regresa el color de la pieza
   * @return Color -color de la pieza
  */
  public Color obtenerColor(){
     return color;
  }

  /**
   * Metodo que regresa la posicion de la pieza
   * @return Posicion -posicion de la pieza
  */
  public Posicion obtenerPosicion(){
     return posicion;
  }

  /**
   * Metodo que le asigna una posion a la pieza
   * @param posicion - posicion que se asignara
   */
  public void asignarPosicion(Posicion posicion){
    this.posicion = posicion;
  }

  /**
   * Metodo que determina si dos Piezas son iguales
   * @param obj - objeto con el que se comparara
   * @return boolean -true si son iguales, false en otro caso
  */
  @Override
  public boolean equals(Object obj){
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Pieza otra = (Pieza) obj;
    return color == otra.color && posicion.equals(otra.obtenerPosicion());
  }

}