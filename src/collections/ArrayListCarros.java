package collections;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArrayListCarros {
	
	public static void main(String[] args) {
		ArrayList<String> carros = new ArrayList<>();
		
		carros.add("Kombi");
		carros.add("Jaguar");
		carros.add("BMW");
		carros.add("Mercedes");
		carros.add("Fusca");
		carros.add("Vectra");
		System.out.println(carros);
		
		//substituir Fusca por Mitsubishi
		carros.set(4, "Mitsubishi");
		System.out.println(carros);
		
		//remover Vectra
		carros.remove("Vectra");
		System.out.println(carros);
		
		//adcionar ao ArrayList usando JOptionPane
		carros.add(JOptionPane.showInputDialog("Informe a marca do carro"));
		System.out.println(carros);
		
		//tamanho do ArrayList
		System.out.println(carros.size());

		System.out.println("ArrayList está vazio? " + carros.isEmpty());
		
		if(carros.contains("BMW")){
			for(int i = 0; i < carros.size(); i++) {
				if("BMW".equals(carros.get(i))) {
					carros.set(i, "Bugatti");
					break;
				}
			}
			System.out.println(carros);
		}else {
			System.out.println("Nome não encontrado no ArrayList");
		}

		//esvaziar array
		carros.clear();
		System.out.println("ArrayList está vazio? " + carros.isEmpty());

		
	}

}
