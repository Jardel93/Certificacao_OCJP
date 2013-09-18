package cap1.Enum;

import java.util.Scanner;

public class Automovel {

	enum automovel {
		FERRARI(1), FUSCA(2), PORSHE(3);

		automovel(int a) {
			cod = a;
		}

		private int cod;

		public int getSec() {
			return cod;
		}
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha um número de 1 a 3");

		int opc = sc.nextInt();

		switch (opc) {

		case 1:
			System.out.println("Carro: " + automovel.FERRARI);
			break;

		case 2:
			System.out.println("Carro: " + automovel.FUSCA);
			break;

		case 3:
			System.out.println("Carro: " + automovel.PORSHE);
			break;

		default:
			System.out.println("Número Inválido!");
		}
	}

}
