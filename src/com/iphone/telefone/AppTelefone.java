package com.iphone.telefone;

public class AppTelefone implements Telefone {

	@Override
	public void ligar() {
		System.out.println("Fazendo ligação");
	}

	@Override
	public void atender() {
		System.out.println("Ligação atendida");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz iniciado");
		
	}
	
}
