package thread_percorrer;

public class View {

	public static void main(String[] args) {
		
		int[] vet  = new int[1000];
		int num = 1;
		
		 for (int i = 0; i < vet.length; i++) {
	            vet[i] = (int) (Math.random() * 100) + 1;
	        }
		
		
		
		int tamanho = vet.length;
		ThreadVetor t = new ThreadVetor(1, vet);
		ThreadVetor t2 = new ThreadVetor(2, vet);
		t.start();
		t2.start();
		
		
		
		
		
		
	}

}
