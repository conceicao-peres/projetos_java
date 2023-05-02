package interface_java;

public class Principal {

	public static void main(String[] args) {
		Animal boi = new Boi();
		boi.animal();
		boi.animalSom();
		boi.animalCome();
		boi.animalAbrigo();
		
		Animal cachorro = new Cachorro();
		cachorro.animal();
		cachorro.animalSom();
		cachorro.animalCome();
		cachorro.animalAbrigo();

	}

}
