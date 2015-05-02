package gonzaloescobar.patronesDeDiseño;

public class MotorElectricoAdapter extends Motor{

	 private MotorElectrico motorElectrico;
	private String mensaje;

	    public MotorElectricoAdapter(){
	        super();
	        this.motorElectrico = new MotorElectrico();
	        System.out.println("Creando motor Electrico adapter");
	    }
	    @Override
	    public String encender() {
	    	mensaje = "Encendiendo motorElectricoAdapter";
	        System.out.println(mensaje);
	        this.motorElectrico.conectar();
	        this.motorElectrico.activar();
	        return mensaje;
	    }

	    @Override
	    public String acelerar() {
	    	mensaje = "Acelerando motor electrico...";
	        System.out.println(mensaje);
	        this.motorElectrico.moverMasRapido();
	        return mensaje;
	    }

	    @Override
	    public String apagar() {
	    	mensaje = "Apagando motor electrico";
	    	System.out.println(mensaje);
	        this.motorElectrico.detener();
	        this.motorElectrico.desconectar();
	        return mensaje;
	    }
}
