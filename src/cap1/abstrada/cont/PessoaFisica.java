package cap1.abstrada.cont;

import cap1.abstrada.Pessoa;

class PessoaFisica extends Pessoa{
	
	public static void main(String[] args) {
			
		PessoaFisica pf = new PessoaFisica();
		pf.andar();
		System.out.println("Hello World");
	}
	
	/** Essa class compila pois temos a class Pessoa com public e assim ela pode ser importada e vista
	 por todos os package do projeto.
	 
	 Observe que obtermos o metodo da class Pessoa isso tambem porque no metodo andar definimos como public
	 assim podemos obter esse metodo na class PessoaFisica, mas nao obrigatoriamente temos que obter esse metodo
	 andar pois ele nao esta anotado como um metodo abstract
	 
	 Eu nao sobrescrevir o metodo assim ele vai imprimir o valor que está na class Pessoa
	 
	 --
	 
	 Exemplo com metodo abstract:
	 
	 Se eu fizesse isso na class Pessoa
	 
	 public abstract void andar();
	 
	 Na class PessoaFisica obrigatoriamente temos que herdar esse metodo e sobrescrever o metodo
	 
	 public void andar(){
	 System.out.println("PessoaFisica andando");
	 }
	 
	 A classe imprimiria "PessoaFisica andando" pois eu sobrescrevir o metodo andar da class Pessoa.
	 
	 */
	
}
