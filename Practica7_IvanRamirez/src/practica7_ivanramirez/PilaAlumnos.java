/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica7_ivanramirez;

import javax.swing.JOptionPane;

/**
 *
 * @author ivanc
 */
public class PilaAlumnos {
    public Alumnos pila;
    

    public PilaAlumnos() {
        pila = null;
    }

     public void push(String nombre, String registro, String carrera, String grupo) {
        Alumnos nuevo = new Alumnos(nombre, registro, carrera, grupo);
        if (pila == null) {
            pila = nuevo;
        } else {
            Alumnos aux = pila;
            pila = nuevo;
            nuevo.setAlumnosiguiente(aux);
        }
    }

    public String recorrerPila() {
        Alumnos aux = pila;
        String datos = "";
        if (pila == null) {
            System.out.println("La pila ALUMNOS está vacía.");
        } else {
            while (aux != null) {
                datos = datos + "DATOS DEL ALUMNO\n";
                datos = datos + "Nombre: " + aux.getNombre() + "\n";
                datos = datos + "Registro: " + aux.getRegistro() + "\n";
                datos = datos + "Carrera: " + aux.getCarrera() + "\n";
                datos = datos + "Grupo: " + aux.getGrupo() + "\n\n";
                aux = aux.getAlumnosiguiente();
            }
        }
        return datos;
    }

    
    
    public void pop() {
        Alumnos aux = pila;
        if (pila == null) {
            System.out.println("La pila está vacía.");
        } else {
            if (aux.getAlumnosiguiente()== null) {
                pila = null;
            } else {
                pila = aux.getAlumnosiguiente();
            }
        }
    }
}
