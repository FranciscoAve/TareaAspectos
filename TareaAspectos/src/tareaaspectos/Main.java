package tareaaspectos;

public class Main {
    public static void main(String[] args) {
        System.out.println("Usando el adaptador basado en POO:");
        
    // MOTORADAPTER  
        // Adaptador POO
        MotorGasolina motorGasolina = new MotorGasolina();
        MotorElectrico motorElectricoPOO = new MotorAdapterPOO(motorGasolina);
        motorElectricoPOO.encender();
        motorElectricoPOO.acelerar();
        motorElectricoPOO.apagar();
        
        System.out.println("\nUsando el adaptador basado en AOP:");

        // Adaptador AOP
        MotorElectrico motorElectricoAOP = new MotorAdapterAOP();
        motorElectricoAOP.encender();
        motorElectricoAOP.acelerar();
        motorElectricoAOP.apagar();
        
        System.out.println("\n--------------------------");

   // CONFIGURACION  
     // Prueba del Singleton usando la clase ConfiguracionPOO
        System.out.println("\nUsando el Singleton implementado en ConfiguracionPOO:");
        
        ConfiguracionPOO configPOO2 = ConfiguracionPOO.obtenerInstancia();
        configPOO2.mostrarConfiguracion();

        // Verificar que ambas instancias sean las mismas

        System.out.println("\nUsando el Singleton implementado con AOP:");

        // Prueba del Singleton usando la lógica del aspecto SingletonAspect

        ConfiguracionAOP configAOP2 = ConfiguracionAOP.obtenerInstancia();
        configAOP2.mostrarConfiguracion();

    }
}