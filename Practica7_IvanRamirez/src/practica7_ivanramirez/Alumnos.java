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
public class Alumnos {
    String nombre;
    String registro;
    String carrera;
    String grupo;
    Alumnos alumnosiguiente;
    Alumnos siguiente;

    public Alumnos(String nombre, String registro, String carrera, String grupo) {
        this.nombre = nombre;
        this.registro = registro;
        this.carrera = carrera;
        this.grupo = grupo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRegistro() {
        return registro;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Alumnos getAlumnosiguiente() {
        return alumnosiguiente;
    }

    public void setAlumnosiguiente(Alumnos alumnosiguiente) {
        this.alumnosiguiente = alumnosiguiente;
    }
  
    
}
