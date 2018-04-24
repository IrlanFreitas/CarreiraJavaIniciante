package br.com.empresa.collections;

import java.util.HashMap;
import java.util.Map;

import br.com.empresa.banco.conta.Conta;

public class Banco {
	
	//Essa classe é usada para explificar 
	//a utilização do polimorfismo
	
	private static Map<String, Conta> contas = new HashMap<>();
	
	public static void adiciona(Conta c){
		contas.put(c.getNome(), c);
	}
	
	public static Conta pega(String nome){
		return contas.get(nome);
	}
	
	public static int pegaQuantidadeDeContasPagas(){
		return contas.size();
	}

	public static Map<String, Conta> getContas() {
		return contas;
	}

	public static void setContas(Map<String, Conta> contas) {
		Banco.contas = contas;
	}

}
