package thread_percorrer;

public class ThreadVetor extends Thread {
	int num;
	int vet[];

	public ThreadVetor(int num, int[] vet) {
		super();
		this.num = num;
		this.vet = vet;
	}

	@Override
	public void run() {
		ContaTempo();

	}

	public void ContaTempo() {
		double tempoInicial = System.nanoTime();
		if (num % 2 == 0) {
			
			for (int i = 0; i < vet.length; i++) {

			}
			
		}else {
			for(int i : vet) {
				
			}
		}
		
		double tempoFinal = System.nanoTime();
		
		double tempo = (tempoFinal - tempoInicial) / Math.pow(10,-9);
		System.out.println("Esse é o tempo total " + tempo);
		
		
		
	}

}
