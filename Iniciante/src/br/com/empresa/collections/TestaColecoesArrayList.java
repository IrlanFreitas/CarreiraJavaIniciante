package br.com.empresa.collections;

import java.util.ArrayList;
import java.util.Collections;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class TestaColecoesArrayList {
	
	public static void main(String[] args) {
		
		//Usando ArrayList não tipado
		//ArrayList nomes = new ArrayList();
		
		//Usando arraylist tipado, somente String
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Mauricio");
		nomes.add("Guilherme");
		nomes.add("Lucas");
		nomes.add("Pedro");
		nomes.add("Alane");
		
		/*System.out.println(nomes.get(0));
		System.out.println(nomes.contains("Guilherme"));
		*/
		//Para cara tipo s dentro de lista
		//Para cara String s dentro de Nomes
		/*for(String s : nomes){
			System.out.println(s);
		}*/
		
		ArrayList<Conta> contas = new ArrayList<Conta>();
		Conta c1 = new ContaCorrente(500);
		Conta c2 = new ContaCorrente(700);
		Conta c4 = new ContaCorrente(1500);
		Conta c5 = new ContaCorrente(1700);
		Conta c6 = new ContaCorrente(800);
		Conta c7 = new ContaCorrente(100);
		
		contas.add(c1);
		contas.add(c2);
		contas.add(c4);
		contas.add(c5);
		contas.add(c6);
		contas.add(c7);
		
		//foreach
		for(Conta c : contas){
			System.out.println(c.getSaldo());
		}
		
		//System.out.println(contas.get(1));
		
		
		//Ordenando de forma alfabetica
		//Com Strings é mais fácil pois o método de comparação
		//é alfabetica, quando se trata de uma classe é 
		//necessário implementar Comparable e implementar o 
		//método compareTo(param)
		
		/*Collections.sort(nomes);
		
		for(String s : nomes){
			System.out.println(s);
		}*/
		
		
		Collections.sort(contas);
		
		System.out.println("\nOrdenado:\n");
		for(Conta c : contas){
			System.out.println(c.getSaldo());
		}

		
		
	}
	
}
