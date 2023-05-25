/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica7_ivanramirez;

/**
 *
 * @author ivanc
 */
public class Libros {
    String nombre;
    String editorial;
    int year;
    String autor;
    Libros Librosiguiente;

    public Libros(String nombre, String editorial, int year, String autor) {
        this.nombre = nombre;
        this.editorial = editorial;
        this.year = year;
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getYear() {
        return year;
    }

    public String getAutor() {
        return autor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Libros getLibrosiguiente() {
        return Librosiguiente;
    }

    public void setLibrosiguiente(Libros Librosiguiente) {
        this.Librosiguiente = Librosiguiente;
    }
    
    
}
