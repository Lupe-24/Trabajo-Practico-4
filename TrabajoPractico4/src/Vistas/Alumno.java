/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.util.HashSet;
import java.util.Objects;

/**
 *
 * @author Naiara
 */
public class Alumno {

    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materias> materiasInscripto = new HashSet<>();

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

    public HashSet<Materias> getMateriasInscripto() {
        return materiasInscripto;
    }

    public void setMateriasInscripto(HashSet<Materias> materiasInscripto) {
        this.materiasInscripto = materiasInscripto;
    }

    public void agregarMateria(Materias m) {
        if (materiasInscripto.contains(m)) {
            System.out.println("El Alumno " + apellido + nombre + " ya está inscripto a esta materia.");
        } else {
            materiasInscripto.add(m);
            System.out.println("El Alumno " + apellido + nombre + " inscripto en " + m.getNombre() + " con éxito");
        }
    }

    public int cantidadMaterias() {
        return materiasInscripto.size();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.legajo;
        hash = 67 * hash + Objects.hashCode(this.apellido);
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + Objects.hashCode(this.materiasInscripto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        return true;
    }

    
    
    @Override
    public String toString() {
        return "Alumno: " + apellido + " " + nombre + " ,"
                + "Número de legajo " + legajo;
    }

}
