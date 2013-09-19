package cap2.heranca.outroexemplo;

public class AnimalTest {
	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Ralf");
		cachorro.comer();
		cachorro.dormir();
		System.out.println(cachorro.getNome());

		Gato gato = new Gato();
		gato.setNome("D'Lua");
		gato.comer();
		gato.dormir();
		System.out.println(gato.getNome());
	}
}
	
	/**
	 Por causa da sobrescrita de metodo na nossa classe conseguimos modificar o valor a ser impresso 
	 de cada Animal.
	 
	 E veja que conseguimos tambem da um nome para cada animal graças aos getter e setter que criamos na super class
	 
	 Como colocamos a super-class como abstract nao podemos fazer o mesmo para ela
	 Exemplo:
	 	Animal animal = new Animal();
	 	Isso não compila!!!
	 	
	 Um detalhe importante que gostaria de citar é o seguinte:
	 Como os metodos da super class nao está como abstract nao obrigatoriamente podemos utilizar esse metodo
	 Caso algum metodo esteja abstract obrigatoriamente quem herdar dessa class vai ter que utilizar esse metodo
	 
	 */
