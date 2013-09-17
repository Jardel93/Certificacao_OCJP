package cap1.interfaces;


public class Cachorro implements Animal {
		
	public void setNome(String n)
	{
		n = "Leao";
		
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		
		System.out.println(animal);
		new Cachorro().setNome("OutroNome");
	}
	
}
		/**
  	Veja que conseguir obter o valor Gato da minha interface animal, mesmo que minha interface seja default
  	ou seja sem o modificador public, eu consigo acessar as variaveis dessa interface por causa que se encontra
  	no mesmo package caso houvesse em outro package eu teria um erro de compilacao
  		"Unresolved compilation	problem: cannot be resolved";
  	
  	Veja tambem que eu obtenho o metodo nome da class Cachorro e ele me devolve o mesmo nome que foi definido no
  	metodo graças ao System.out.println(n); que foi definido dentro do metodo, e bastou eu definir qualquer outro nome
  	no paramentro dentro do main que ele encontra esse metodo e nao imprimir o nome que foi dado dentro do 
  	parametro no exemplo eu coloquei OutroNome, ele so funciona pois la no meu metodo eu falei que ia passar uma
  	variavel do tipo String.
  	
		*/
