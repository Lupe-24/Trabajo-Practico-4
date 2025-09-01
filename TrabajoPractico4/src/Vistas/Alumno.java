/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.util.HashSet;

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
            materiasInscripto.add(m);
            System.out.println("El Alumno " + apellido + nombre + " inscripto en " + m + " con éxito");
        }else{
            System.out.println("El Alumno " + apellido + nombre + " ya está inscripto a esta materia.");
        }
    }

    public int cantidadMaterias() {
        return materiasInscripto.size();
    }

    @Override
    public String toString() {
        return "Alumno " + apellido + nombre + ""
                + "\n\tNúmero de legajo " + legajo;
    }

}
