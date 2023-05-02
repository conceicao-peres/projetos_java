package classe;

public class Principal {

	public static void main(String[] args) {
		
		//instanciar a classe Pessoa (cria um objeto com todos os atributos e metodos da classe pessoa)
				Pessoa pes = new Pessoa();
				pes.nomePessoa = "Maria";
				pes.idadePessoa = 30;
				pes.setCpsPessoa("000.000.000-00");
				pes.setRgPessoa("00.000.000-0");
				pes.setNumero(15);
				
				//print classe principal
				System.out.println("Nome: " +pes.nomePessoa + ". Idade: " + pes.idadePessoa + " anos.");
				
				//print chamando o metodo
				pes.mostrarDados(pes.nomePessoa, pes.idadePessoa);
				
				//print variaveis privadas
				System.out.println(pes.toString());

	}

}
