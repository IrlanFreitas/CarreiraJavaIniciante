package br.com.empresa.libs;

import br.com.empresa.banco.conta.Cliente;
import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class TestaJavaLang {

	public static void main(String[] args) {
		
		Conta c1 = new ContaCorrente(500);
		Conta c2 = new ContaCorrente(500);
		
		GuardadorDeObjetos armario = new GuardadorDeObjetos();
		armario.adicionar(c1);
		armario.adicionar(c2);
		
		Conta c1NoArmario =(Conta) armario.pega(0);
		Cliente joao = new Cliente();
		
		System.out.println(c1NoArmario.toString());
		
		if (c1.equals(joao)) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}

	}

}
