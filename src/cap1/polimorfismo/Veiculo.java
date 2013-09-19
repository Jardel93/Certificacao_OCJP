package cap1.polimorfismo;
	
	/**
	 Polimorfismo � quando temos uma mensagem para varios objetos, e os seus resultados sao diferente
	 Como exemplo: Temos na class Veiculo um metodo Ligar ele pode ser herdado pela sub-class e sobrescrever o metodo
	 e na hora que for impresso ter� um resultado diferente.
     Uma class pode herdar atributos da super-class e pode tambem implementar os metodos
	 */
public class Veiculo {
	
	public void ligar(){
		System.out.println("Ligar Veiculo");
	}
	
	public static void desligar(){
		System.out.println("Desligar Veiculo");
	}
}
