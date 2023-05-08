package forEach;

public class ForEach {
	
	public static void main(String[] args) {
		//criar um vetor, carregá-lo, inicializar e em seguida ler os elementos do vetor usando For Each
		
		int[] vetorNumeros = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Varrendo o vetor sem For Each");
		for (int i = 0; i < vetorNumeros.length; i++) {
			System.out.println("Nr : " + vetorNumeros[i]);
		}
		
		//para usar o foreach é necessario usar uma classe wrapper, criando um objeto de um tipo primitivo 
		//e coloca a lista dentro desse objeto
		System.out.println("Varrendo o vetor usando o For Each");
		for (int obj : vetorNumeros) {
			System.out.println("Nr : " + obj);
		}
	}

}
