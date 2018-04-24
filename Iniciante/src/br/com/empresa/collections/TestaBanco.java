package br.com.empresa.collections;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class TestaBanco {

	public static void main(String[] args) {
		//ArrayList<Conta> contas = new ArrayList<Conta>();
		Conta c1 = new ContaCorrente(500);
		c1.setNome("Mauricio");
		Conta c2 = new ContaCorrente(700);
		c2.setNome("Lucas");
		Conta c4 = new ContaCorrente(1500);
		c4.setNome("Alberto");
		Conta c5 = new ContaCorrente(1700);
		c5.setNome("Irlan");
		Conta c6 = new ContaCorrente(800);
		c6.setNome("Nelson");
		Conta c7 = new ContaCorrente(100);
		c7.setNome("Antonio");
		
		Banco.adiciona(c1);
		Banco.adiciona(c2);
		Banco.adiciona(c4);
		Banco.adiciona(c5);
		Banco.adiciona(c6);
		Banco.adiciona(c7);

		System.out.println(Banco.pega("Irlan"));
	}
}
