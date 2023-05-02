package teste_JoptionPane;

import javax.swing.JOptionPane;

public class teste_JoptionPane {

	public static void main(String[] args) {
		
		int idade;
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
		System.out.println("Idade informada: "+ idade + " anos");

	}

}
