package cap2.heranca;

/**
 * Essa class ser� uma super class As outras sub class que herda essa class tem
 * acesso aos seus atributos e m�todos
 * 
 * A vantagem de utilizar Heran�a: Temos c�digos mais f�cil de entender Evita
 * duplicac�o de c�digos Podemos aproveitar codigos ja criados evitando
 * duplicacao
 */
public class Eletrodomestico {

	public void ligar() {
		System.out.println("Ligando Eletrodom�stico");
	}

	public void voltagem() {
		System.out.println(110);
	}

}
