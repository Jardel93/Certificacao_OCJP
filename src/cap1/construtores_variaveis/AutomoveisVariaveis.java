package cap1.construtores_variaveis;
	
	/**
	As variaveis do tipo primitivo sao: byte, int, long, float, double etc.
	Exemplo de variaveis de referencia: Fusca extends Automove{} posso referenciar minha 
	variavel de referencia para Fusca e para Automovel pois um fusca pode ser um Automovel.
	*/

public class AutomoveisVariaveis {
	public boolean bo1 = false; // Falso
	public boolean bo2 = true; // Verdade
	public char c = 'C'; // 16 bits, Recebe apenas um caracter
	public byte b = 1; // 8 bits, -128 a 127
	public short s = 2; // 16 bits, -32.768 a 32.767 
	public int i = 3; // 32 bits, -2.147.483.648 a 2.147.483.647
	public long l = 4L; // 64 bits, -9.223.372.036.854.775.808 a 9.223.372.036.854.775.80 e deve termina com L
	public float f = 5.1f; // 32 bits, -3.40292347E+38 a +3.40292347E+38 e deve terminar com F
	public double d = 6.10; // 64 bits, -1.79769313486231570E+308 a +1.79769313486231570E+308 
	
}
	
   /**
    	Para saber qual valor maximo cada tipo primitivo pode ter segue a lógica:
    
    	2 elevado ao numero de bits, dividido por 2 menos 1
    	
    	Exemplo de 8 bits:
    	
    	2 elevado a 8 = 256
    	dividido por 2 = 128
    	menos 1 = 127
    	
    	Um Bit suporta ate 127
    */
