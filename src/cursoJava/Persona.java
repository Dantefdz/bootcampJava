package cursoJava;

public class Persona {
	private int edad;
	private String nombre;
	private int telefono;
	public Persona(int edad, String nombre, int telefono) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	
}
