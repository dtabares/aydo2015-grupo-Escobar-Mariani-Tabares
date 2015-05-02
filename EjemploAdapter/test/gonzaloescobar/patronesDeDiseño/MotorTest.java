package gonzaloescobar.patronesDeDiseño;

import gonzaloescobar.patronesDeDiseño.MotorGasolero;
import gonzaloescobar.patronesDeDiseño.MotorElectricoAdapter;
import gonzaloescobar.patronesDeDiseño.MotorNaftero;

import org.junit.Assert;
import org.junit.Test;

public class MotorTest {

	@Test
	public void testMotorGasolero() {
		MotorGasolero motorGasolero = new MotorGasolero();
		
		
		Assert.assertEquals("encendiendo motor Gasolero", motorGasolero.encender());
		Assert.assertEquals("acelerando el motor Gasolero", motorGasolero.acelerar());
		Assert.assertEquals("Apagando motor Gasolero", motorGasolero.apagar());
		
	}
	
	@Test
	public void testMotorPistero() {
		MotorNaftero motorNaftero = new MotorNaftero();
		
		
		Assert.assertEquals("encendiendo motor Naftero", motorNaftero.encender());
		Assert.assertEquals("acelerando el motor Naftero", motorNaftero.acelerar());
		Assert.assertEquals("Apagando motor Naftero", motorNaftero.apagar());
		
	}
	
	@Test
	public void testMotorElectricoAdapter() {
		MotorElectricoAdapter motorElectricoAdapter = new MotorElectricoAdapter();
		
		
		Assert.assertEquals("Encendiendo motorElectricoAdapter", motorElectricoAdapter.encender());
		Assert.assertEquals("Acelerando motor electrico...", motorElectricoAdapter.acelerar());
		Assert.assertEquals("Apagando motor electrico", motorElectricoAdapter.apagar());
		
	}

}
