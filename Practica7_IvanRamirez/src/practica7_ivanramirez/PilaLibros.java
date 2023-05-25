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
public class PilaLibros {
    public Libros pila;
    private int cantidadN;

    public PilaLibros() {
        pila = null;
        cantidadN = 0;
    }

    public void push(String nombre, String editorial, int year, String autor) {
        Libros nuevo = new Libros(nombre, editorial, year, autor);
        if (pila == null) {
            pila = nuevo;
        } else {
            Libros aux = pila;
            pila = nuevo;
            nuevo.setLibrosiguiente(aux);
        }
    }

    public String recorrerPila() {
        Libros aux = pila;
        String datos = "";
        if (pila == null) {
            System.out.println("La pila ALUMNOS está vacía.");
        } else {
            while (aux != null) {
                datos = datos + "DATOS DEL ALUMNO\n";
                datos = datos + "Nombre: " + aux.getNombre() + "\n";
                datos = datos + "Editorial: " + aux.getEditorial() + "\n";
                datos = datos + "Año: " + aux.getYear() + "\n";
                datos = datos + "Autor: " + aux.getAutor() + "\n\n";
                aux = aux.getLibrosiguiente();
            }
        }
        return datos;
    }
    
    public int [] imprimirLista2(){
        Libros aux = pila;
        int [] arreglo = new int [cantidadN];
        int j=0;
        int i=1;
        if(pila == null){
            JOptionPane.showMessageDialog(null, "Lista vacia");
        }else{
            while(aux != null){
                arreglo[j] = aux.getYear();
                aux = aux.Librosiguiente;
                i++;
                j++;
            }
        }
       return arreglo;
    }

    public void pop() {
        Libros aux = pila;
        if (pila == null) {
            System.out.println("La pila está vacía.");
        } else {
            if (aux.getLibrosiguiente() == null) {
                pila = null;
            } else {
                pila = aux.getLibrosiguiente();
            }
        }
    }

    public int getCantidadN() {
        return cantidadN;
    }

    public void setCantidadN(int cantidadN) {
        this.cantidadN = cantidadN;
    }
    
    
}
