package cap2.heranca.outroexemplo;
	
	/**
	 Animal � uma super class e ter� suas sub class.
	 Repare no outro exemplo que fizemos para Eletrodomestico - Microondas � UM Eletrodomestico
	 No conceito de Heran�a sempre temos um relacionamento � UM.
	 O mesmo vai ocorrer para nosso exemplo Animal
	 Cachorro � UM Animal
	 Gato � UM Animal
	 */
public abstract class Animal {
	
	private String nome;
	
	public void comer(){
		System.out.println("Animal comendo");
	}
	
	public void dormir(){
		System.out.println("Animal dormindo");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
	
	/**
	 Repare nossa class, coloquei a class como abstract pois ela nao poder� ser
	 instanciada no meu main, isso porque nao faz sentido eu instanciar uma class Animal
	 que Animal seria esse? Nao faz nenhum sentido, j� que eu vou ter seus animais que herda de Animal
	 
	 Criamos tambem um atributo Nome para class isso porque cada Animal que herda dessa Class Animal
	 vai ter um nome
	 
	 E lembre-se: N�o � porque tenho uma class abstract que devo ter todos os metodos abstract
	 agora se eu tiver pelo menos um metodo abstract eu devo anotar a class como abstract
	 */
