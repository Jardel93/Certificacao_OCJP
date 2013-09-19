package cap2.heranca;

public class EletrodomesticoMain {
	public static void main(String[] args) {
		
		Microondas m = new Microondas();
		
		m.ligar();
		
		m.voltagem();
		
	}
	
	/**
	 Sobresvemos o metodo ligar da super class Eletrodomestico
	 e agora a ação do metodo é ligar microondas.
	 Repare tambem que pegamos o metodo Voltagem da class Eletrodomestico, mas nao sobrescrevemos ele
	 entao aproveitamos o metodo criado para exibir para microondas
	 */
}
