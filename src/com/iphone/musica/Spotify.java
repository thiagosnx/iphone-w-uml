package com.iphone.musica;

public class Spotify implements ReprodutorMusical {
	
	
	
	
	@Override
	public void tocar() {
		System.out.println("Tocando música");
		
	}
	@Override
	public void pausar() {
		System.out.println("Música pausada");
		
	}
	@Override
	public void selecionarMusica() {
		System.out.println("Música selecionada");
		
	}

	
	
	
}
