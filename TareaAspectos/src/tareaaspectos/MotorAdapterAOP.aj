package tareaaspectos;

public aspect MotorAdapterAOP {

    // Declaramos que MotorAdapterAOP implementa la interfaz MotorElectrico
    declare parents: MotorAdapterAOP implements MotorElectrico;

    // Define motorGasolina como un campo estático
    private static MotorGasolina motorGasolina;

    // Bloque de inicialización estático
    static {
        motorGasolina = new MotorGasolina();
    }

    // Implementación de los métodos de MotorElectrico
    public void MotorAdapterAOP.encender() {
        motorGasolina.arrancar();
    }

    public void MotorAdapterAOP.acelerar() {
        motorGasolina.incrementarVelocidad();
    }

    public void MotorAdapterAOP.apagar() {
        motorGasolina.detener();
    }
}
