package thread_sapos;

public class ThreadLine extends Thread{
	
	int numero;
	int salto;
	int distancia;
	
	public ThreadLine(int numero, int salto, int dist) {
		this.numero = numero;
		this.salto = salto;
		this.distancia = dist;
	}
	
	@Override
	public void run() {
		int soma = 0;
		while(soma < distancia) {
			int a = (int)(Math.random()* salto) + 1;
			soma = soma + a;
			System.out.println( " O Sapo numero:  " + numero + " fez um Salto de: "+ a + " metros. e percorreu = "+ soma + " metros.");
		}
		System.out.println(" O sapo numero = " + numero + " Chegou ");
	
	
	
}
}
