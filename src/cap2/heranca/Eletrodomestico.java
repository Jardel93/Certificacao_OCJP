package cap2.heranca;

/**
 * Essa class será uma super class As outras sub class que herda essa class tem
 * acesso aos seus atributos e métodos
 * 
 * A vantagem de utilizar Herança: Temos códigos mais fácil de entender Evita
 * duplicacão de códigos Podemos aproveitar codigos ja criados evitando
 * duplicacao
 */
public class Eletrodomestico {

	public void ligar() {
		System.out.println("Ligando Eletrodoméstico");
	}

	public void voltagem() {
		System.out.println(110);
	}

}
