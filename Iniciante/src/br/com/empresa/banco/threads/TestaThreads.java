package br.com.empresa.banco.threads;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class TestaThreads {

	public static void main(String[] args) {
		
//		BarraDeProgresso bdp = new BarraDeProgresso();
//		Thread t1 = new Thread(bdp);
//		t1.start();
//		
//		CopiadorDeArquivos cda = new CopiadorDeArquivos();
//		Thread t2 = new Thread(cda);
//		t2.start();
		
		Conta c1 = new ContaCorrente(500);
		FazDeposito acao = new FazDeposito(c1);
		
		Thread t3 = new Thread(acao);
		Thread t4 = new Thread(acao);
		
		t3.start();
		t4.start();
		
		//c1 = acao.atualizado();
		System.out.println(c1.getSaldo());
		
	}	

}
