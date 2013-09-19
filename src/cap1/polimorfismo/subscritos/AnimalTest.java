package cap1.polimorfismo.subscritos;

public class AnimalTest {
	public static void main(String[] args) {
		
		Animal animal1 = new Animal();
		animal1.correr();
		
		Animal animal2 = new Leao();
		animal2.correr();
		
	}
		
}
	/**
	Veja que foi impresso dois metodos
	O primeiro � o metodo correr da classe animal, s� foi possivel instanciar a class animal
	porque nao est� anotado como uma class abstract
	
	O segundo metodo conseguimos sobescrever o metodo correr da classe Animal na classe Leao
	Entao agora o metodo correr imprimi o valor Leao Correndo
	
	Gra�as a Heran�a dizemos que um Leao � UM Animal
	
	Um detalhe importante que nao foi mostrado � um seguinte:
	Se tivesse um metodo na class Leao que nao tem na sua super-class Animal
	Quando eu fosse testar:
	Animal animal = new Leao();	Aqui tenho uma referencia animal, mais � um objeto Leao.
	No exemplo acima conseguimos pegar o metodo correr, mas se tivesse outro metodo nao conseguia
	pegar esse metodo pois nao est� na sua super-class 
	*/