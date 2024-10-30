package tareaaspectos;

public class ConfiguracionAOP {

    private static ConfiguracionAOP instancia;
    
    private ConfiguracionAOP() {
        System.out.println("Configuración inicializada");
    }

    public void mostrarConfiguracion() {
        System.out.println("Mostrando configuración actual");
    }

    public static ConfiguracionAOP obtenerInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionAOP();
        }
        return instancia;
    }
}
