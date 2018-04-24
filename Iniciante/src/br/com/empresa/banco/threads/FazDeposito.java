package br.com.empresa.banco.threads;

import br.com.empresa.banco.conta.Conta;

public class FazDeposito implements Runnable{
	
	private Conta conta;
	
	public FazDeposito(Conta c) {
		this.conta = c;
	}

	@Override
	public void run() {
		conta.deposita(200);
		System.out.println("Depositado com sucesso!");
	}
	
	//Depois de debugado foi visto que não há necessidade de retornar o valor modificado
	public Conta atualizado(){
		return this.conta;
	}

}
