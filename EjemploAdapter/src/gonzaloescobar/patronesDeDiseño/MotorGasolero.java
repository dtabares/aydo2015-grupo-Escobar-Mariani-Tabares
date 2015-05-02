package gonzaloescobar.patronesDeDiseño;

public class MotorGasolero extends Motor {

    private String mensaje;

	@Override
    public String encender() {
        mensaje = "encendiendo motor Gasolero";
        System.out.println(mensaje);
        return mensaje;
    }

    @Override
    public String acelerar() {
        mensaje = "acelerando el motor Gasolero";
        System.out.println(mensaje);
		return mensaje;
    }

    @Override
    public String apagar() {
        mensaje = "Apagando motor Gasolero";
        System.out.println(mensaje);
        return mensaje;
    }
}
