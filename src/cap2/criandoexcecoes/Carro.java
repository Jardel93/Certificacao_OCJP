package cap2.criandoexcecoes;

/**
 * Quando quiser criar sua própria exceções precisa apenas extends a class
 * Exception
 */
public class Carro extends Exception {

	public void nome(String nome) throws Carro {
		if (nome == "Ferrari") {
			throw new Carro();
		}
		System.out.println("Nao é uma ferrari");
	}
}
