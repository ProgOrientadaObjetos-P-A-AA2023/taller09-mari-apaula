/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.*;


/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo{
/*Atributos:

tipo de automóvil
marca de automóvil
garante1 tipo Persona
valor de automóvil
valor mensual de pago préstamo automóvil
Métodos:

Agregar los métodos correspondientes; además agregar un método toString
El valor mensual del pago del préstamo del automóvil es igual al valor del automóvil dividido para el número de meses.
El método para establecer la ciudad del préstamo de tipo PrestamoAutomovil debe asignar el valor siempre en minúscula.
Personalizar el método toString; usar el método de la superclase*/
   
    private String tipo;
    private String marca;
    private Persona garante;
    private double valorAuto;
    private double vMensualPrestamo;

    public PrestamoAutomovil(String tp, String m, Persona g, double v, 
             Persona b, int t, String c) {
        super(b, t, c);
        tipo = tp;
        marca = m;
        garante = g;
        valorAuto = v;
    }

    public void establecerTipo(String t) {
        tipo = t;
    }
    public String obtenerTipo() {
        return tipo;
    }
    public void establecerMarca(String m) {
            marca = m;
        }

    public String obtenerMarca() {
        return marca;
    }

    public void establecerGarante(Persona g) {
        garante = g;
    }

    public Persona obtenerGarante() {
        return garante;
    }

    public void establecerValorAuto(double vA) {
        valorAuto = vA;
    }

    public double obtenerValorAuto() {
        return valorAuto;
    }

    public void calcularVMensualPrestamo() {
        vMensualPrestamo = valorAuto / tiempoMeses;
    }

    public double obtenerVMensualPrestamo() {
        return vMensualPrestamo;
    }
    
    
    @Override
    public String toString() {
        String cadena = String.format("%sCiudad: %s\n"
                + "Tipo de automóvil: %s\n"
                + "Marcad del automóvil: %s\n"
                + "Garante: \n"
                + "\tNombre: %s\n"
                + "\tApellido: %s\n"
                + "\tUsername: %s\n"
                + "Valor del automóvil: %.2f\n"
                + "Valor mensual de pago del préstamo del automóvil: %.2f\n",
                super.toString(),
                ciudad.toLowerCase(),
                obtenerTipo(),
                obtenerMarca(),
                obtenerGarante().obtenerNombre(),
                obtenerGarante().obtenerApellido(),
                obtenerGarante().obtenerUsername(),
                obtenerValorAuto(),
                obtenerVMensualPrestamo());
        
        return cadena;
    }
}
