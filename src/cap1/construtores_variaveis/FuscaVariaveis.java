package cap1.construtores_variaveis;

	/**
	 * Um Fusca é um Automovel
	 */
public class FuscaVariaveis extends AutomoveisVariaveis{
		
	AutomoveisVariaveis av = new FuscaVariaveis();
}
	/**
	Veja que minha variavel de referencia av é um objeto Fusca do tipo Automovel
	Eu so posso definir uma variavel de referencia apartir da super-class
	nao poderia fazer: FuscaVariaveis fv = new AutomoveisVariaveis();
	 */
	
