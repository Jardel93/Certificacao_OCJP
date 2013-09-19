package cap1.polimorfismo;

public class Carro extends Veiculo {
	
	public void ligar(){
		System.out.println("Ligar Carro");
	}
	
	public static void desligar(){
		System.out.println("Desligar Carro");
	}
	
	public static void main(String[] args) {
		
		Veiculo v = new Carro();
		v.ligar();
		v.desligar();
		
	}	
	
	/**
	 Conseguimos sobrescrever o metodo Ligar, veja que agora quando for impresso irá imprimi "Ligar Carro"
	 Já o metodo Desligar sobrescrevemos tambem porem como ele está anotaco como static nao poderá ser herdado
	 entao o valor impresso no v.desligar(); será o mesmo nome dado na super-class "Desligar Veiculo"
	 */
}	

