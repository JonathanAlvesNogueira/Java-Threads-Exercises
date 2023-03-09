package threads_exercicio;

public class ThreadLine extends Thread{
	int numero;

	
	
	public ThreadLine(int numero) {
		this.numero = numero;
	}
	

	@Override
	public void run() {
		mostraNum();
	}


	public void mostraNum() {
		System.out.println(" " + getNumero());
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
	
}
