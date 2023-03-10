package cursoJava;

public class Cliente extends Persona {
	private int credito;

	public Cliente(int edad, String nombre, int telefono, int credito) {
		super(edad, nombre, telefono);
		this.credito = credito;
	}

	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}

	@Override
	public String toString() {
		return "Cliente [credito=" + credito + "]";
	}

}
