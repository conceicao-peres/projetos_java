package matriz_bidimensional;

import javax.swing.JOptionPane;

public class Matrizes {

	public static void main(String[] args) {
		/* escrever um algoritimo que solicite a entrada de 4 notas  para cada aluno ,
		 * calcular a média do aluno e exibir na tela,
		 * a media do aluno deve seguir a seguinte regra:
		 * média >= 7,5 - aprovado,
		 * média >= 5,5 e < 7,5 - recuperação,
		 * media < 5,5 - reprovado.
		*/
		String[] alunos = {"João", "Maria", "José"};
		float[][] notas = new float [3][4]; // matriz notas com 3 linhas e 4 colunas
		
		float notasAluno, mediaAluno;
		String statusAluno;
		
		for(int i=0; i<3; i++) {
			
			System.out.println("Aluno: " + alunos[i]);
			notasAluno = 0;
			mediaAluno = 0;
			
			for(int j=0; j<4; j++) {
				notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota: " + (j+1) + " do aluno:"));
				notasAluno = notasAluno + notas[i][j];
			}
			mediaAluno = notasAluno /4;
			
			if(mediaAluno < 5.5) {
				statusAluno = "	REPROVADO";
			}else if(mediaAluno >= 5.5 && mediaAluno <=7.5){
				statusAluno = "RECUPERAÇÃO";
			}else {
				statusAluno = "APROVADO";
			}
			
			System.out.println("\n*****BOLETIM*****");
			System.out.println("Aluno: " + alunos[i]);
			System.out.println("Notas");
			for(int j1=0; j1<4; j1++) {
				System.out.println((j1+1 + " - " + notas[i][j1]));
			}
			System.out.println("Media ..: " + mediaAluno +  " - " + statusAluno);
	
		}

	}

}
