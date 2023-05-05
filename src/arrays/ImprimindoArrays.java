package arrays;

public class ImprimindoArrays {

	public static void main(String[] args) {
		//declarando o array
		String[] paises = new String[5];
		
		//passando valores (inicializando) array
		paises[0] = "Brasil";
		paises[1] = "Alemanha";
		paises[2] = "Itália";
		paises[3] = "Áustria";
		paises[4] = "Espanha";
		
		//foreach - chama o for declara o tipo (nesse caso String), 
		//cria um objeto chamado lista que contem o array
		for(String lista:paises) {
			System.out.println(lista);
		}
	}
}
