package cap2.estatico;

public class Melancia extends Fruta{
	
	public static void nomeFruta(){
		System.out.println("Melancia");
	}
	
	 public static void main(String[] args) {
		
		 Melancia.nomeFruta();
		 
		 Fruta fruta = new Melancia();
		 fruta.nomeFruta();
	}
}
	
	/**
	 Observe que temos o mesmo metodo da super-class, mas esse nao é o mesmo método
	 ou seja, nao estamos sobrescrevendo esse metodo pois ele é static
	 Lembre: Métodos static nao sao subscritos
	 
	 Metodo static nao precisamos utilizar o operador NEW 
	 ja basta o nome da class e o nome do metodo
	 
	 Ja para buscar o metodo da super class precisamos utilizar o operador NEW
	 ou seja pegamos a referencia da super class mais o objeto da sub-class
	 Melancia É UMA Fruta
	 com a referencia da super-class Fruta pegamos o metodo
	 */
		