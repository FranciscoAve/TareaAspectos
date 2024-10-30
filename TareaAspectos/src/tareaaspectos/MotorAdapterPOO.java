package tareaaspectos;

public class MotorAdapterPOO implements MotorElectrico {

    public MotorGasolina motorGasolina;

    public MotorAdapterPOO(MotorGasolina motorGasolina) {
        this.motorGasolina = motorGasolina;
    }

    @Override
    public void encender() {
        motorGasolina.arrancar();
    }

    @Override
    public void acelerar() {
        motorGasolina.incrementarVelocidad();
    }

    @Override
    public void apagar() {
        motorGasolina.detener();
    }
}