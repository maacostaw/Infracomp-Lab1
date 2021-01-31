package modelo;

public class Impresora_Impares extends Thread{
	private int limite_superior;
	private long delay_time;
	
	public Impresora_Impares(int limite_superior, long delay_time) {
		this.limite_superior = limite_superior;
		this.delay_time = delay_time;
	}
	
	public void run() {
		try {
			for(int i = 1; i<limite_superior; i+=2) {
				System.out.println(i);
				Thread.sleep(delay_time);
			}
		}
		catch (Exception e) {
			System.out.println("Saliendo de impresora impares");
		}
		
	}

}
