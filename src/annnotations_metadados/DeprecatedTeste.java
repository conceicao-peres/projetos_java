package annnotations_metadados;

public class DeprecatedTeste {
	
	void visualizar() {
		System.out.println("Método de visualização");
	}
	
	@Deprecated
	void exibir() {
		System.out.println("Método exibir é deprecated");
	}

}
