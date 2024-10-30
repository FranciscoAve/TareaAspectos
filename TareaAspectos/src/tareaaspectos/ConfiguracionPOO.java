package tareaaspectos;

public class ConfiguracionPOO {

    public static ConfiguracionPOO instancia;

    public ConfiguracionPOO() {
        System.out.println("Configuración inicializada");
    }

    public static ConfiguracionPOO obtenerInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionPOO();
        }
        return instancia;
    }

    public void mostrarConfiguracion() {
        System.out.println("Mostrando configuración actual");
    }
}