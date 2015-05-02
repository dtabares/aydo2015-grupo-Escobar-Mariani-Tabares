package gonzaloescobar.patronesDeDiseño;

public class MotorElectrico {

	 private boolean conectado = false;
	private String mensaje;

	    public MotorElectrico() {
	        System.out.println("Creando motor electrico");
	        this.conectado = false;
	    }

	    public String conectar() {
	        this.conectado = true;
	        mensaje = "Conectando motor electrico";
	        System.out.println(mensaje);
	        return mensaje;
	    }

	    public String activar() {
	        if (!this.conectado) {
	            mensaje = "No se puede activar porque no " +
	            		"esta conectado el motor electrico";
	            System.out.println(mensaje);
	        } else {
	        	mensaje = "Esta conectado, activando motor" +
	            		" electrico....";
	            System.out.println(mensaje);
	        }
	        return mensaje;
	    }

	    public String moverMasRapido() {
	        if (!this.conectado) {
	        	mensaje = "No se puede mover rapido el motor " +
	            		"electrico porque no esta conectado...";
	            System.out.println(mensaje);
	        } else {
	        	mensaje ="Moviendo mas rapido...aumentando voltaje";
	            System.out.println(mensaje);
	        }
	        return mensaje;
	    }

	    public String detener() {
	        if (!this.conectado) {
	            mensaje = "No se puede detener motor electrico" +
            		" porque no esta conectado";
	        	System.out.println(mensaje);
	        } else {
	        	mensaje = "Deteniendo motor electrico";
	            System.out.println(mensaje);
	        }
	        return mensaje;
	    }

	    public String desconectar() {
	    	mensaje = "Desconectando motor electrico...";
	        System.out.println(mensaje);
	        this.conectado = false;
	        return mensaje;
	    }
}
