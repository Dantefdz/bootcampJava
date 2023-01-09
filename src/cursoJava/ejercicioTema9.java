package cursoJava;

public class ejercicioTema9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente c = new Cliente(21, "Migue", 2221545, 5555);
		
		Trabajador t = new Trabajador(59, "momo", 2225644, 5545);
		
		System.out.print(c.toString());
		System.out.print(t.toString());
	}

	
}
