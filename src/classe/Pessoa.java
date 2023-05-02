package classe;

public class Pessoa {
	
	//atributos da classe (dados da classe pessoa)
	public String nomePessoa;
	public int idadePessoa;
	private String cpfPessoa, rgPessoa;
	private int numero;
	
	//metodo
		public void mostrarDados(String nome, int idade) {
			System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade);
		};
		
	//encapsulamento (protege as variaveis CPF e RG, tornando-os vissiveis apenas atraves de get e set)
	@Override
	public String toString() {
		return "CPF: " + cpfPessoa + 
				"\nRG: " + rgPessoa +
				"\nNumero: " + numero;
	}
	
	public void setCpsPessoa(String cpfPessoa) {
		this.cpfPessoa = cpfPessoa;
	}
	public String getCpfPessoa() {
		return cpfPessoa;
	}
	
	public void setRgPessoa(String rgPessoa) {
		this.rgPessoa = rgPessoa;
	}
	public String getRgPessoa() {
		return rgPessoa;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getNumero() {
		return numero;
	}

}
