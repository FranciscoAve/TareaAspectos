/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaaspectos;

/**
 *
 * @author jkrom
 */
public class Singleton {

    public class Configuracion {

        private static Configuracion instancia;

        private Configuracion() {
            System.out.println("Configuración inicializada");
        }

        public Configuracion obtenerInstancia() {
            if (instancia == null) {
                instancia = new Configuracion();
            }
            return instancia;
        }

        public void mostrarConfiguracion() {
            System.out.println("Mostrando configuración actual");
        }
    }
}
