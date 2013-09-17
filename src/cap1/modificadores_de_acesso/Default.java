package cap1.modificadores_de_acesso;
		
	/**
	Não é possível ter acesso ao membro de outro pacote
	 */
class Default {
	
	int x = 0;
	
}

  /**
 	Nenhuma outra classe que esteja em outro package tem acesso a minha classe Default
 	Mesmo que a minha classe fosse public e a variavel x for default ela nao pode ser acessada 
 	de outra classe que esteja em outro package
   */