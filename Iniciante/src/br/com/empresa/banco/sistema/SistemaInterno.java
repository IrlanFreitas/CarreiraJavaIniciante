package br.com.empresa.banco.sistema;

import br.com.empresa.banco.conta.Autenticavel;

public class SistemaInterno {
	
	public void autentica(Autenticavel f){
		
		int senha = 123;
		
		if (f.autentica(senha) == true) {
			System.out.println("Bem vindo.");
		} else {
			System.out.println("Senha incorreta.");
		}
		
	}
	
}
