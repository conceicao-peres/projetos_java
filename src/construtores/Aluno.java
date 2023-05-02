package construtores;

public class Aluno {
	
	//classe aluno que tem 3 nota e um status
	private double nota1;
	private double nota2;
	private double nota3;
	STATUS situacao;
	
	//metodo construtor aluno para receber as 3 notas
	public Aluno(double nota1, double nota2, double nota3) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	public enum STATUS{
		APROVADO,
		REPROVADO
	}
	
	//metodo para calclualar a media
		public double calcularMedia() {
			double media = 0;
			media = (this.nota1 + this.nota2 + this.nota3)/3;
			return media;
		}

}
