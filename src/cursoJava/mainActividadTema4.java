package cursoJava;

import java.util.Scanner;

public class mainActividadTema4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner escaner = new Scanner(System.in);
		// Mandar mensaje
		System.out.println("Escribe un número:");
		// Leer lo que se introduce
		double numero = escaner.nextDouble();
		// Comparar
		if (numero == 0) {
			System.out.println("El número es 0");
		} else if (numero < 0) {
			System.out.println("El número es negativo");
		} else {
			System.out.println("El número es positivo");
		}
		int incrementar=0;
		while(incrementar > 3) {
			System.out.print(incrementar);
			incrementar++;
		}
		for (int i = 0; i < 3; i++) {
			  System.out.println(i);
			}
		System.out.println("Escribe un mes:");
		int mes=escaner.nextInt();
		 
		  switch(mes){
		  
		   case 3:
		   case 4:
		   case 5:
		    System.out.println("Estas en otoño");
		   break;
		   
		   case 6:
		   case 7:
		   case 8:
		    System.out.println("Estas en invierno");
		   break;
		   
		   case 9:
		   case 10:
		   case 11:
		    System.out.println("Estas en primavera");
		   break;
		   
		   case 12:
		   case 1:
		   case 2:
		    System.out.println("Estas en verano");
		   break;
		   
		   default:
		    System.out.println("Mes y estacion no existen");
		  }
	}

}
