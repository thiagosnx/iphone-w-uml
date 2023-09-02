package com.iphone.nav;

public class Safari implements Navegador {

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo páginas");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova página adicionada");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada");
		
	}

}
