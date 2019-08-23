/*
 Introducción a Ciencias de la Computación (Laboratorio).
 Práctica 4: Programa obtener el RFC de las personas.
 Autor: Cristobal Morales Karen.
 Fecha: 22 de agosto de 2019.
 */

import java.util.Scanner;
public class RFC {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nombreCompleto = new String();
		String fecha= new String();
		String rfc;

    System.out.println("Introduce tu nombre completo, empezando por el nombre: ");
		nombreCompleto = in.nextLine();
    char nombre = nombreCompleto.charAt(0);
    int apaterno = nombreCompleto.indexOf(' ');
    String eapater= nombreCompleto.substring (apaterno+1,apaterno+3);
    int amaterno = nombreCompleto.lastIndexOf(' ');
    char eamater= nombreCompleto.charAt(amaterno+1);

    System.out.println ("Introduce tu fecha de nacimiento en formato dd/mm/aaaa : "+fecha); 
     fecha = in.nextLine();
     String dia=fecha.substring(0,2);
     String mes=fecha.substring(3,5);
     String año=fecha.substring(8,10);

     rfc = eapater+eamater+nombre+año+mes+dia;
	    rfc = rfc.toUpperCase();
    System.out.println ("El RFC de " + nombreCompleto + " es: " + rfc);		
	}
}