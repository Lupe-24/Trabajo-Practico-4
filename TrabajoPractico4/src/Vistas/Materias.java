/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

/**
 *
 * @author emadupre
 */
public class Materias {
    private int idMateria;
    private String nombre;
    private int anio;
    
    public Materias(int idMateria, String nombre, int anio){
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    @Override
    public String toString(){
        return "Id: "+ idMateria + " Nombre: " + nombre + " Año: " + anio; 
    }
    
    /* No se repiten las materias en el HashSet */
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Materias)) return false;
        Materias materia = (Materias) o;
        return idMateria == materia.idMateria;
    }
    
    @Override
    public int hashCode(){
        return idMateria;
    }
}
