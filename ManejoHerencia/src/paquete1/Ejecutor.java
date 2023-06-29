/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import paquete2.*;
import paquete3.*;
import paquete4.*;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadena = "PRESTAMO Automovil\n";
        String informeE = "PRESTAMO Educativo\n";
        ArrayList<PrestamoAutomovil> listaDistancia = new ArrayList<>();
        boolean letra = true;

        

        do {
            System.out.println("\tMenú\n"
                + "Ingrese 1 para un PRESTAMO de tipo AUTOMOVIL\n"
                + "Ingrese 2 para un PRESTAMO de tipo EDUCATIVO\n");
        int var = entrada.nextInt();
        entrada.nextLine();

        switch (var) {
            case 1: //  prestamo AUTOMOVIL
                System.out.println("Ingrese información del garante");
                System.out.println("Ingrese nombre");
                String ng = entrada.nextLine();
                System.out.println("Ingrese apellido");
                String apg = entrada.nextLine();
                System.out.println("Ingrese el usuario");
                String userg = entrada.nextLine();
                
                System.out.println("Ingrese información del beneficiario");
                System.out.println("Ingrese nombre");
                String nb = entrada.nextLine();
                System.out.println("Ingrese apellido");
                String apb = entrada.nextLine();
                System.out.println("Ingrese el usuario");
                String userb = entrada.nextLine();
                
                System.out.println("Ingrese el tiempo del prestamo en meses");
                int tiempo = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Ingrese la ciudad en donde se realiza "
                        + "el prestmo");
                String ciudad = entrada.nextLine();
                
                System.out.println("Ingrese el tipo del automovil");
                String tipo = entrada.nextLine();
                System.out.println("Ingrese número de créditos");
                String marca = entrada.nextLine();
                System.out.println("Ingrese costo de créditos");
                double valorAutmovil = entrada.nextDouble();
                entrada.nextLine();
                
                Persona garante = new Persona(ng, apg,userg);
                Persona beneficiario = new Persona(nb, apb,userb);

                PrestamoAutomovil prestamoAuto = new PrestamoAutomovil(tipo, 
                        marca, garante, valorAutmovil, beneficiario, 
                        tiempo, ciudad);
                prestamoAuto.calcularVMensualPrestamo();
                
                cadena = String.format("%s%s\n", 
                        cadena, 
                        prestamoAuto.toString());
                
                break;
            case 2: // prestamo educativo
                
                System.out.println("Ingrese información del beneficiario");
                System.out.println("Ingrese nombre");
                String nomb = entrada.nextLine();
                System.out.println("Ingrese apellido");
                String app = entrada.nextLine();
                System.out.println("Ingrese el usuario");
                String usrb = entrada.nextLine();
                
                System.out.println("Ingrese el tiempo del prestamo en meses");
                int tiempoMeses = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Ingrese la ciudad en donde se realiza "
                        + "el prestmo");
                String ciudadLugar = entrada.nextLine();
                
                System.out.println("Ingrese información del Centro Educativo");
                System.out.println("Ingrese nombre del Centro Educativo");
                String nomInstitucion = entrada.nextLine();
                System.out.println("Ingrese las SIGLAS del Centro Educativo");
                String siglas = entrada.nextLine();
                
                System.out.println("Ingrese el nuevel de estudio");
                String nivelEstudio = entrada.nextLine();
                System.out.println("Ingrese el valor de la carrera");
                double valorCarrera = entrada.nextDouble();
                entrada.nextLine();
                
                InstitucionEducativa institucion = new InstitucionEducativa(
                        nomInstitucion,siglas);
                Persona beneficiarioE = new Persona(nomb, app,usrb);

                PrestamoEducativo prestamoEducativo = new PrestamoEducativo(
                        nivelEstudio, institucion, valorCarrera, 
                         beneficiarioE, tiempoMeses, ciudadLugar);
                
                prestamoEducativo.calcularValorMensualC();
                
                informeE = String.format("%s%s\n", 
                        informeE, 
                        prestamoEducativo.toString());
                
                
                break;
            default:
                System.out.println("Valor erronio");
        }
        entrada.nextLine();
        System.out.println("Desea salir, pulse S");
            String opcion = entrada.nextLine();
            if(opcion.equals("S")){
                letra = false;
            }
        
        } while (letra);
        
        System.out.printf("%s\n"
                + "-------------------------------------------------"
                + "%s",
                cadena, informeE);
    }

}
