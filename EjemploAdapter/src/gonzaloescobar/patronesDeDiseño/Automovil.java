package gonzaloescobar.patronesDeDiseño;

public class Automovil {

	public static void main(String[] args) {

		Automovil automovil = new Automovil();
		System.out
				.println("\n******************Motor Gasolero*********************");
		automovil.usarMotorGasolero();
		System.out
				.println("**************************************************\n");
		System.out
				.println("*****************Motor Naftero******************");
		automovil.usarMotorNaftero();
		System.out
				.println("**************************************************\n");
		System.out
				.println("*****************Motor Electrico******************");
		automovil.usarMotorElectrico();
		System.out
				.println("**************************************************\n");

	}

	public void usarMotorGasolero() {
		Motor motor = new MotorGasolero();
		motor.encender();
		motor.acelerar();
		motor.apagar();
	}

	public void usarMotorElectrico() {
		Motor motor = new MotorElectricoAdapter();
		motor.encender();
		motor.acelerar();
		motor.apagar();
	}

	public void usarMotorNaftero() {
		Motor motor = new MotorNaftero();
		motor.encender();
		motor.acelerar();
		motor.apagar();
	}
}
