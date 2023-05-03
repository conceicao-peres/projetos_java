package construtores;

import construtores.Aluno.MATRICULA;
import construtores.Aluno.STATUS;

public class Principal {

	public static void main(String[] args) {
		Aluno aluno = new Aluno(8, 8, 8);
		double mediaFinal = aluno.calcularMedia();
		
		if (mediaFinal < 6) {
			aluno.situacao = STATUS.REPROVADO;
		}else {
			aluno.situacao = STATUS.APROVADO;
		}
		
		//use enum matricula
		aluno.situacaoMatricula = MATRICULA.MATRICULADO;
		
		System.out.println("Média aluno: " + aluno.calcularMedia() + ". Situação aluno: " + aluno.situacao);
		System.out.println("Situação matricula aluno: " + aluno.situacaoMatricula);
	}

}
