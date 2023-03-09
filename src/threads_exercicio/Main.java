package threads_exercicio;

public class Main {

	public static void main(String[] args) {

		int[] num = {1,2,3,4,5};
		for(int i = 0; i < 5; i++) {
			Thread t = new ThreadLine(num[i]);
			t.start();
		}
		
		
		
		
	}

}
