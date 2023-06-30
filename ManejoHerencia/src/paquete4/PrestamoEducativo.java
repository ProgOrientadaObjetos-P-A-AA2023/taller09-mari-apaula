/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.*;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {

    /*Crear una clase PrestamoEducativo que herede de Préstamo en lenguaje Java

Atributos:

nivel de estudio
Centro educativo de tipo Institución Educativa
valor de la carrera
valor mensual del pago del préstamo del valor de la carrera
Método:

Agregar los métodos correspondientes; además agregar un método toString
El valor mensual del pago del préstamo del valor de la carrera es igual 
    al (valor de la carrera dividido para el número de meses) menos 10% 
    del (resultado del valor de la carrera dividido para el número de meses)
Personalizar el método toString; usar el método de la superclase. El método
    para establecer la ciudad del préstamo de tipo PrestamoEducativo debe 
    asignar el valor siempre en mayúscula.
     */
    private String nivelEstudio;
    private InstitucionEducativa institucion;
    private double valorCarrera;
    private double valorMensualC;

    public PrestamoEducativo(String a, InstitucionEducativa r, double v,
             Persona b, int t, String c) {
        super(b, t, c);
        nivelEstudio = a;
        institucion = r;
        valorCarrera = v;
    }

    public void establecerNivelEstudio(String a) {
       nivelEstudio = a;
    }

    public void establecerInstitucion(InstitucionEducativa a) {
        institucion = a;
    }

    public void establecerValorCarrera(double v) {
        valorCarrera = v;
    }

    public void calcularValorMensualC() {
        double descueto =  (valorCarrera / tiempoMeses) * 0.1;
        valorMensualC = (valorCarrera / tiempoMeses) - descueto;
    }

    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public InstitucionEducativa obtenerInstitucion() {
        return institucion;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenerValorMensualC() {
        return valorMensualC;
    }

    @Override
    public String toString() {
        String cadena = String.format("%sCiudad: %s\n"
                + "Nivel de estudio: %s\n"
                + "%s" 
                + "Valor de la carrera: %.2f\n"
                + "Valor mensual de pago del préstamo de la carrera: %.2f\n",
                super.toString(),
                ciudad.toUpperCase(),
                obtenerNivelEstudio(),
                obtenerInstitucion().toString(),
                obtenerValorCarrera(),
                obtenerValorMensualC());
        
        return cadena;
    }

}


