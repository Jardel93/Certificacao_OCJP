package cap2.heranca.outroexemplo;
	
	/**
	 Animal é uma super class e terá suas sub class.
	 Repare no outro exemplo que fizemos para Eletrodomestico - Microondas É UM Eletrodomestico
	 No conceito de Herança sempre temos um relacionamento É UM.
	 O mesmo vai ocorrer para nosso exemplo Animal
	 Cachorro É UM Animal
	 Gato É UM Animal
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
	 Repare nossa class, coloquei a class como abstract pois ela nao poderá ser
	 instanciada no meu main, isso porque nao faz sentido eu instanciar uma class Animal
	 que Animal seria esse? Nao faz nenhum sentido, já que eu vou ter seus animais que herda de Animal
	 
	 Criamos tambem um atributo Nome para class isso porque cada Animal que herda dessa Class Animal
	 vai ter um nome
	 
	 E lembre-se: Não é porque tenho uma class abstract que devo ter todos os metodos abstract
	 agora se eu tiver pelo menos um metodo abstract eu devo anotar a class como abstract
	 */
