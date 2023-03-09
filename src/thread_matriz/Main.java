package thread_matriz;

public class Main {
	public static void main(String[] args) {
		int mat[][] = new int[3][5];
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = (int) (Math.random() * 10) + 1;
			}
		}
		
		// mostra o numero da mat
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
			
				System.out.print(mat[i][j] + " ");
				
			}
			// pula uma linha
			System.out.println("");
		}
		
		for(int i = 0; i < mat.length; i++) {
			Thread t = new ThreadLine(mat[i]);
			t.start();
		}
		
		
		
	}
		
}