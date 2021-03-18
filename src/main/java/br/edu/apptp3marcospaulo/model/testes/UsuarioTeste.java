package br.edu.apptp3marcospaulo.model.testes;

import br.edu.apptp3marcospaulo.model.negocio.Usuario;

public class UsuarioTeste {

	public static void main(String[] args) {
		
		Usuario marquinho = new Usuario();
		marquinho.setId(1);
		marquinho.setNome("Marcos");
		marquinho.setEmail("marcos@marquinho.com");
		marquinho.setSenha(1234, null);
		System.out.println("Topzera " + marquinho);
		
		Usuario zezinho = new Usuario();
		zezinho.setId(2);
		zezinho.setSenha(1111, null);
		System.out.println("Pato " + zezinho);
		
	}
}