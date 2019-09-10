/**
 * Crear la clase Libro, para posteriormente tener sus atributos (autor, titulo y año). Además de poder asignarles (a los atributos)
 * otros valores.
 * @author Cristóbal Morales Karen
 * @version 1.0
 */

public class Libro {
    private String titulo;
	private String autor;
	private int añoPublicacion;


/**
 * Se crea un objeto con valores establecidos (como default)
 * Al atributo título se le asignó "No se encontró el título del libro"
 * Al atributo autor se le asignó "No se encontró dicho autor"
 * Al atributo añPublicacion al ser int, se le asignó 0.
 */
public Libro (){
	this.titulo = "No se encontró el título del libro";
	this.autor = "No se encontró dicho autor";
	this.añoPublicacion = 0;}

/**
 * Se crea un objeto con parámetros establecidos
 * @param titulo se le asignó titulo
 * @param autor se le asignó autor
 * @param añoPublicacion se le asigño añoPublicacion
 */
public Libro (String titulo, String autor, int añoPublicacion){
	this.titulo=titulo;
	this.autor=autor;
	this.añoPublicacion= añoPublicacion;}


/**
 * Regresa el título del libro
 * @return titulo
 */
public String getTitulo(){
	return titulo;}


/**
 * Regresa el autor del libro
 * @return autor
 */
public String getAutor(){
	return autor;}


/**
 * Regresa el año de publicación del libro
 * @return añoPublicacion
 */
public int getAño(){
	return añoPublicacion;}


/**
 * Asigna el titulo de publicación del libro
 * @param titulo el título del libro
 */
public void setTitulo(String titulo){
	this.titulo=titulo;}

/**
 * Asigna el autor de publicación del libro
 * @param autor el autor del libro
 */
public void setAutor (String autor){
		this.autor=autor;}

/**
 * Asigna el año de publicación del libro
 * @param añoPublicacion el año de publicación del libro
 */
public void setAñoPublicacion (int añoPublicacion){
	this.añoPublicacion= añoPublicacion;}

}

