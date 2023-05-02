package heranca;

public class Fisica extends Pessoa{
	
	public String cpf, rg;

	@Override
	public String toString() {
		return "Fisica [cpf=" + cpf + ", rg=" + rg + ", nome=" + nome + ", situacao=" + situacao + "]";
	}

}
