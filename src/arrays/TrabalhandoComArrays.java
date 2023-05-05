package arrays;

import javax.swing.JOptionPane;

public class TrabalhandoComArrays {

	public static void main(String[] args) {
	
		int[] numeros = new int[3];
		
		for(int i = 0; i < 3; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
		}
		
		String[] paises = new String[4];
		for(int i = 0; i < 4; i++) {
			paises[i] = JOptionPane.showInputDialog("Digite o pais");
		}
		
		System.out.println("Lista de paises digitados:");
		for(String lista : paises) {
			System.out.println(lista);
		}
		
		String novoPais = "Uruguai";
		paises[3] = novoPais;
		
		System.out.println("Lista de paises digitados, substituindo o último pais por 'Uruguai':");
		for(String lista : paises) {
			System.out.println(lista);
		}
		
		System.out.println("Números digitados:");
		for(Integer num : numeros) {
			System.out.println(num);
		}
		numeros[2] = numeros[2] + 4;
		System.out.println("Números digitados, somando 4 a posição 3:");
		for(Integer num : numeros) {
			System.out.println(num);
		}
	}

}
