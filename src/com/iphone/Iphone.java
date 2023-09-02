package com.iphone;

import com.iphone.musica.Spotify;
import com.iphone.nav.Safari;
import com.iphone.telefone.AppTelefone;


public class Iphone extends Internet{
	public static void main(String[] args) {
		Internet verify = new Iphone();
		verify.verificarConexao();	
		System.out.println();
		
		System.out.println("Spotify");
		Spotify msc = new Spotify();
		msc.tocar();
		msc.pausar();
		msc.selecionarMusica();
		
		System.out.println();
		
		AppTelefone call = new AppTelefone();
		System.out.println("Telefone");
		call.ligar();
		call.atender();
		call.iniciarCorreioVoz();
		
		System.out.println();
		
		Safari navegar = new Safari();
		System.out.println("Safari");
		navegar.exibirPagina();
		navegar.adicionarNovaAba();
		navegar.atualizarPagina();
		

	}

	
	
	
	@Override
	protected boolean verificarConexao() {
		System.out.println("Conectado");
		return true;
}}
