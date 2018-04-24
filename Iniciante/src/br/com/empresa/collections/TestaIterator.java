package br.com.empresa.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class TestaIterator {
	
	public static void main(String[] args) {
		
/*		List<String> nomes = new ArrayList<>();
		nomes.add("Mauricio");
		nomes.add("Guilherme");
		nomes.add("Lucas");
		nomes.add("Lucas");

		Iterator<String> i = nomes.iterator();
		
		while(i.hasNext()){
			System.out.println(i.next());
		}*/
		
		
		List<Conta> contas = new ArrayList<Conta>();
		
		Conta c1 = new ContaCorrente(500);
		Conta c2 = new ContaCorrente(700);
		Conta c3 = new ContaCorrente(900);
		
		contas.add(c1);
		contas.add(c3);
		contas.add(c2);
		
		Iterator<Conta> c = contas.iterator();
		
		while(c.hasNext()){
			System.out.println(c.next().getSaldo());
		}
		
		
	}
}
