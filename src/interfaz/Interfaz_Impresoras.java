package interfaz;

import java.util.Scanner;

import modelo.Impresora_Impares;
import modelo.Impresora_Pares;

public class Interfaz_Impresoras {
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero > 0: ");
		
		int  limite_superior = -1;
		long delay_time = 0L + (long) (Math.random() * (4500L - 2500L));
		
		try {
			limite_superior = Integer.parseInt(scanner.nextLine());			
		} 
		catch(Exception e) {
			System.out.println("Valor no aceptado como numerico");
		}
		
		if(limite_superior > 0) {
		    System.out.println("Se imprimiran numeros con un intervalo de espera de " + delay_time + " milisegundos");
			Impresora_Pares		t1 = new Impresora_Pares(limite_superior, delay_time); 
			Impresora_Impares	t2 = new Impresora_Impares(limite_superior, delay_time); 
			t2.run();
			t1.run();
			
		}		
	}

	public static void main(String[] args) 
	{
		Interfaz_Impresoras interfaz = new Interfaz_Impresoras();
		interfaz.run();
	}
}
