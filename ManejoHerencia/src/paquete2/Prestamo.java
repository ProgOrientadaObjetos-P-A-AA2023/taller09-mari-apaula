/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author crooks
 */
public class Prestamo {
/*Crear una clase Préstamo en lenguaje Java:

Atributos:
beneficiario - de tipo Persona
tiempo de préstamo en meses
ciudad del préstamo (de tipo String)
    
La clase debe tener un constructor que reciba los parámetros 
para beneficiario, tiempo de préstamo en meses y ciudad del 
préstamo.*/

 protected Persona beneficiario;
 protected int tiempoMeses;
 protected String ciudad;
// constructor
    public Prestamo(Persona b ,int t, String c) {
        beneficiario = b;
        tiempoMeses = t;
        ciudad = c;
    }

    public void setBeneficiario(Persona beneficiario) {
        this.beneficiario = beneficiario;
    }

    public void setTiempoMeses(int tiempoMeses) {
        this.tiempoMeses = tiempoMeses;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Persona getBeneficiario() {
        return beneficiario;
    }

    public int getTiempoMeses() {
        return tiempoMeses;
    }

    public String getCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        String cadena = String.format("\tPRESTAMO\nBeneficiario\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Username: %s\n"
                + "---------------------\n"
                + "Tiempo de préstamo en meses: %d\n", 
                beneficiario.nombre,
                beneficiario.apellido,
                beneficiario.username,
                tiempoMeses);
        
        return cadena; 
    }
    
    
    
            
    
}
