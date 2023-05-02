package heranca;

public class Juridica extends Pessoa{
	
	public String cnpj, ie;

	@Override
	public String toString() {
		return "Juridica [cnpj=" + cnpj + ", ie=" + ie + ", nome=" + nome + ", situacao=" + situacao + "]";
	}

}
