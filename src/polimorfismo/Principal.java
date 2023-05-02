package polimorfismo;

public class Principal {

	public static void main(String[] args) {
		
		Mamifero mamifero1 = new Elefante();
		System.out.println("Cota diária de leite para: ");
		System.out.println("Elefante - " + mamifero1.cotaDiariaLeite() + " litros.");
		
		Mamifero mamifero2 = new Gato();
		System.out.println("Gato - " + mamifero2.cotaDiariaLeite() + " litros.");

	}

}
