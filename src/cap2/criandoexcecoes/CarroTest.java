package cap2.criandoexcecoes;

	/**
	 Para utilizar o metodo, basta instanciar minha class que contém o metodo atraves da
	 referencia chamo o metodo e passo o valor
	 */
public class CarroTest {
	public static void main(String[] args) {

		Carro carro = new Carro();
		try {
			carro.nome("Outro Carro");
		} catch (Carro c) {
			System.out.println("Falha");
		}
	}
}
	/**
	 Temos um metodo na class carro que diz:
	 	Se o Carro for igual a ferrari ele lanca uma excecao
	 	
	 É importante saber que:
	 
	 Try: Usa para indicar um bloco de codigo aonde possa ter um erro(excecao)
	 Catch: Trata o erro(excecao)
	 
	 Posso ter um Try seguido de Catch ou Finally
	 Não posso ter apenas um Try sem o Catch ou Finally
	 Posso ter as três condições
	 */
