package thread_matriz;

public class ThreadLine extends Thread {
	int linha[];

	public ThreadLine(int[] linha) {
		super();
		this.linha = linha;
	}
	
	
	@Override
	public void run() {
		soma();
	

	}
	
	
	public void soma() {
		int soma = 0;
		for(int i = 0; i < linha.length; i++) {
			soma += linha[i];
		}
		System.out.print("Essa é a soma da linha:  " + soma + " ");
	}
	
	    
	    
	    
	}
	
	
	
	
	
