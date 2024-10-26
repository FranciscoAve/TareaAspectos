/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaaspectos;

/**
 *
 * @author jkrom
 */
public class AdapterPOO {

    public interface MotorElectrico {

        void encender();

        void acelerar();

        void apagar();
    }

    public class MotorGasolina {

        public void arrancar() {
            System.out.println("Motor de gasolina arrancado");
        }

        public void incrementarVelocidad() {
            System.out.println("Motor de gasolina acelerando");
        }

        public void detener() {
            System.out.println("Motor de gasolina apagado");
        }
    }

    public class MotorAdapter implements MotorElectrico {

        private MotorGasolina motorGasolina;

        public MotorAdapter(MotorGasolina motorGasolina) {
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
}
