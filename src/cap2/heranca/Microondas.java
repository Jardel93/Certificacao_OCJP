package cap2.heranca;
	
	/**
	 Para utilizar Herança é preciso utilizar anotação extends
	 Microondas é a sub class, ela herda todos os atributos e metodos da sua super-class Eletrodomestico
	 
	 */
public class Microondas extends Eletrodomestico{
	
	public void ligar(){
		System.out.println("Ligando Microondas");
	}
}
