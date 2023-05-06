package collections;

import java.util.LinkedList;

public class LinkedListCarros {
	//o LinkedList permite trabalhar com as pontas da lista (first, last)

	public static void main(String[] args) {
		
		LinkedList<String> cars = new LinkedList<>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Mercedes");
		System.out.println(cars);
		
		cars.addFirst("Bugatti");
		cars.addLast("Jeep");
		System.out.println(cars);
		
		System.out.println("Carro da primeira posição: " + cars.getFirst());
		System.out.println("Carro da última posição: " + cars.getLast());
		
		//pegar carro da posição 3
		//String carro;
		//carro = cars.get(3);
		System.out.println("Carro da posição 3: " + cars.get(3));
		
		cars.removeFirst();
		cars.removeLast();
		System.out.println(cars);
	}

}
