package heranca;

public class Pessoas {

	public static void main(String[] args) {
		
		Fisica fisica = new Fisica();
		fisica.nome = "Maria Silva";
		fisica.cpf = "000.000.000-00";
		fisica.rg = "00.000.000-0";
		fisica.situacao = "A";
		
		Juridica juridica = new Juridica();
		juridica.nome = "XPTO";
		juridica.cnpj = "00.000.000/0001-00";
		juridica.ie = "000.000.000.000";
		juridica.situacao = "I";
		
		System.out.println("Dados pessoa física");
		System.out.println(fisica.toString());
		System.out.println("Dados pessoa jurídica:");
		System.out.println(juridica.toString());

	}

}
