package gonzaloescobar.patronesDeDiseño;

public class MotorNaftero extends Motor {
	String mensaje;

    public MotorNaftero(){
        super();
        System.out.println("Creando el motor Naftero");
    }

    @Override
    public String encender() {
        mensaje = "encendiendo motor Naftero";
        System.out.println(mensaje);
        return mensaje;
    }

    @Override
    public String acelerar() {
        mensaje = "acelerando el motor Naftero";
        System.out.println(mensaje);
		return mensaje;
    }

    @Override
    public String apagar() {
        mensaje = "Apagando motor Naftero";
        System.out.println(mensaje);
        return mensaje;
    }
}
