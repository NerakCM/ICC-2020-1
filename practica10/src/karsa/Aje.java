/**
 * Programa que construye un tablero de ajedres gracias a las interfaces gráficas y a la estructura for.
 * @author Cristóbal Morales Karen.
 * @version 1
 */

package karsa;

import processing.core.PApplet;

public class Aje extends PApplet {
  public static void main(String[] args) {
    PApplet.main("karsa.Aje");
  }

  @Override
  public void settings(){
    size(displayWidth -700, displayWidth -700);
   //displayWidth y displayHeight son variables del sistema que almacena el ancho de la pantalla COMPLETA. 
   //Esto se utiliza para ejecutar un programa de pantalla completa en cualquier tamaño de pantalla.
 
  }
  @Override
  public void setup(){

  }
  @Override
  public void draw(){
    for (int i = 0;i < (displayWidth - 700)/8; i++) {
      for (int a = 0; a < (displayWidth -700)/8; a++) {
       if ((a%2 != 0 && i%2 !=0 )||(a%2 == 0 && i%2 ==0 )){
        fill (0xFFFFFF); 
        }else{ 
        fill (0x000000);
        }
        rect(a*(displayWidth - 700)/8,i*(displayWidth -700) /8,(displayWidth - 700)/8,(displayWidth -700) /8);
      }
    }

  }
}