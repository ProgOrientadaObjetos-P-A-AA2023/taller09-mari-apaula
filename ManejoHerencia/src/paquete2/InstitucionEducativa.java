/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Sistemas G Didactic
 */
public class InstitucionEducativa {
    protected String nombre;    
    protected String siglas;

    public InstitucionEducativa(String nombre, String siglas) {
        this.nombre = nombre;
        this.siglas = siglas;
    }
    
    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerSiglas(String a) {
        siglas = a;
    }
     public String obtenerNombre() {
        return nombre;
    }

    public String obtenerSiglas() {
        return siglas;
    }

    @Override
    public String toString() {
        String cadena = String.format("Institución Educativa\n"
                + "\tNombre: %s\n"
                + "\tSiglas: %s\n", 
                obtenerNombre(),
                obtenerSiglas().toUpperCase());
        
        return cadena; 
    }
    

}
