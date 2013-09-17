package cap1.modificadores_de_acesso;

public class MetodoFinal {
	
	public void dinheiro(final int valor){
		
	//	valor = 10;
		
		System.out.println(valor);
	}
	
	public static void main(String[] args) {
		
		new MetodoFinal().dinheiro(10);
	}
}

	/**
	 Essa classe nao compila pois veja que no metodo dinheiro definimos no parametros como final
	 e depois estamos sobrescrevendo esse valor. OBS: Ignore o comentario na linha 7 
	 Lembre-se que quando algo é declarado com modificador final nao poderá ser sobrescrito.
 	
 	 Para funcionar eu teria que apagar no metodo dinheiro a variavel valor = 10;
 	 E dentro do meu Main eu acesso a classe que contém meu metodo e passo o valor para ele.
	 */
