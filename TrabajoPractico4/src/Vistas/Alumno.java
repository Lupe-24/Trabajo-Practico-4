/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author Naiara
 */
public class Alumno {
    
    private int legajo;
    private String apellido;
    private String nombre;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarMateria(Materias m){
        
    }
    
    public int cantidadMaterias(){        
        return 0;
    }

    @Override
    public String toString() {
        return "Alumno " + apellido + nombre + ""
                + "\n\tNúmero de legajo " + legajo;
    }
    
    
    
    
    
}
