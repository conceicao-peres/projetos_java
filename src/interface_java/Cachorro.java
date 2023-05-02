package interface_java;

public class Cachorro implements Animal{

	@Override
	public void animal() {
		System.out.println("Animal: Cachorro");
		
	}

	@Override
	public void animalSom() {
		System.out.println(" - Latir");
		
	}

	@Override
	public void animalCome() {
		System.out.println(" - Ração");
		
	}

	@Override
	public void animalAbrigo() {
		System.out.println(" - Casinha");
		
	}

}
