/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Sistemas G Didactic
 */
public class Persona {
    protected String nombre;    
    protected String apellido;
    protected String username;

    public Persona(String n, String ap, String u) {
        nombre = n;
        apellido = ap;
        username = u;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String a) {
        apellido = a;
    }

    public void establecerUsername(String u) {
        username = u;
    }

     public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerUsername() {
        return username;
    }
    
    

}
