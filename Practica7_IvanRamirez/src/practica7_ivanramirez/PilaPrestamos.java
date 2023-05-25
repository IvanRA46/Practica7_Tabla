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
public class PilaPrestamos {
    public Prestamos pila;

    public PilaPrestamos() {
        pila = null;
    }

    public void push(String nombre, String fecha, String prestamos, String libro) {
        Prestamos nuevo = new Prestamos(nombre, fecha, prestamos, libro);
        if (pila == null) {
            pila = nuevo;
        } else {
            Prestamos aux = pila;
            pila = nuevo;
            nuevo.setPrestamosiguiente(aux);
        }
    }

    public String recorrerPila() {
        Prestamos aux = pila;
        String datos = "";
        if (pila == null) {
            System.out.println("La pila ALUMNOS está vacía.");
        } else {
            while (aux != null) {
                datos = datos + "DATOS DEL PRESTAMO\n";
                datos = datos + "Nombre: " + aux.getNombre() + "\n";
                datos = datos + "Fecha de entrega: " + aux.getFecha_en() + "\n";
                datos = datos + "Fecha de prestamo: " + aux.getFecha_pr() + "\n";
                datos = datos + "Libro: " + aux.getLibro() + "\n\n";
                aux = aux.getPrestamosiguiente();
            }
        }
        return datos;
    }

    public void pop() {
        Prestamos aux = pila;
        if (pila == null) {
            System.out.println("La pila está vacía.");
        } else {
            if (aux.getPrestamosiguiente() == null) {
                pila = null;
            } else {
                pila = aux.getPrestamosiguiente();
            }
        }
    }
}
