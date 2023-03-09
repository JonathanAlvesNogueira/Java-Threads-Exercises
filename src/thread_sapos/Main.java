package thread_sapos;

import java.util.Scanner;

/* Nome: Jonathan Alves
data: 09/03/2022
	
Fazer uma aplicação de uma corrida de sapos, com 5
Threads, cada Thread controlando 1 sapo. Deve haver um
tamanho máximo para cada pulo do sapo (em metros) e a
distância máxima para que os sapos percorram. A cada salto,
um sapo pode dar uma salto de 0 até o tamanho máximo do
salto (valor aleatório). Após dar um salto, a Thread, para cada
sapo, deve mostrar no console, qual foi o tamanho do salto e
quanto o sapo percorreu. Assim que o sapo percorrer a
distância máxima, a Thread deve apresentar que o sapo
chegou e qual sua colocação
 
 *  */






public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o valor do salto maximo do sapo");
		int salto = scan.nextInt();
		System.out.println("Informe o valor maximo da distancia");
		int distancia = scan.nextInt();
		for(int i = 1; i < 6; i++) {		
			Thread sapo = new ThreadLine(i, salto, distancia);
			sapo.start();
		}
		System.out.println("Fim execução");
		
		
	}

}
