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
public class Prestamos {
    String nombre;
    String fecha_en;
    String fecha_pr;
    String libro;
    Prestamos prestamosiguiente;

    public Prestamos(String nombre, String fecha_en, String fecha_pr, String libro) {
        this.nombre = nombre;
        this.fecha_en = fecha_en;
        this.fecha_pr = fecha_pr;
        this.libro = libro;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha_en() {
        return fecha_en;
    }

    public String getFecha_pr() {
        return fecha_pr;
    }

    public String getLibro() {
        return libro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha_en(String fecha_en) {
        this.fecha_en = fecha_en;
    }

    public void setFecha_pr(String fecha_pr) {
        this.fecha_pr = fecha_pr;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public Prestamos getPrestamosiguiente() {
        return prestamosiguiente;
    }

    public void setPrestamosiguiente(Prestamos prestamosiguiente) {
        this.prestamosiguiente = prestamosiguiente;
    }
    
    
}
