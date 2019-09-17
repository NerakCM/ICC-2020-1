package geometria;

/**
 * Representa un polígono de tres lados.  Está definido por tres puntos en el plano cartesiano.
 *@author Cristóbal Morales Karen
 *@version 01
 */

public class Triangulo {
    private Punto a;
    private Punto b;
    private Punto c;

/**
 * Tipo de triangulo de acuerdo a sus lados.
 * @param Equilatero si la longitud de los lados del triangulo miden lo mismo
 * @param Isosceles si la longitus de los lados del triangulo son todos distintas
 * @param Escaleno si el triangulo tiene exactamente dos lados de la misma longitud
 */

    public static final int EQUILATERO;
    public static final int ISOSCELES;
    public static final int ESCALENO;

/**
 * Crear un triangulo con tres puntos dados
 * @param a un punto con coordenadas (0,0)
 * @param b un punto con coordenadas (1,0)
 * @param c un punto con coordenadas (0.5, sin(3.1416/3))
 */
    public Triangulo (){
    	a =new Punto (0,0);
    	b =new Punto (1,0);
    	c =new Punto (0.5, sin(3.1416/3));
    }

/**
 * Crear un triangulo dados tres puntos
 * @param a es el punto a
 * @param b es el punto b
 * @param c es el punto c
 */
    public Triangulo (Punto a, Punto b, Punto c){
    	this.a= a;
    	this.b=b;
    	this.c=c;
    }

/**
 * Determina si los vértices de este triángulo están alineados.
 *@return true si los vértices están alineados.
 */
    public boolean tieneVerticesAlineados() {
        return a.estanAlineados (b,c);
    }


/**
 * Regresa el tipo de este triángulo según la longitud de sus lados; puede ser equilátero, isósceles o escaleno.
 *@return tipo de triangulo de acuerdo a su longitud (equilatero, escaleno, esosceles)
 */
    public int tipo(){
        if (a.distancia(b)== b.distancia(c) && a.distancia(b) ==c.distancia(a) && b.distancia(c) == a.distancia(c)){
            return EQUILATERO;
        }

        if (a.distancia(b) != b.distancia(c) && a.distancia(b) != c.distancia(a) && b.distancia(c) != a.distancia(c)){
            return ESCALENO;
        }
         if (a.distancia(b) == b.distancia(c) || b.distancia(c) == c.distancia(a) || c.distancia(a) == a.distancia(b)){
            return ISOSCELES;
    }
}
}
    