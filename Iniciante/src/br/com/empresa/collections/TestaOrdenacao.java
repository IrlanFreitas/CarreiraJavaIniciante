package br.com.empresa.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class TestaOrdenacao {

	public static void main(String[] args) {
		
		List<Conta> contas = new LinkedList<Conta>();
		String[] nomes = {"Lucas", "Pedro","Irlan", "Alan", "Dandara"};
		
		Conta todas = null;
		
		for (int i = 0; i < 5; i++) {
			todas = new ContaCorrente();
			todas.setNumero(i);
			todas.setNome(nomes[i]);
			todas.setSaldo((new Random().nextDouble() * 1000000));
			contas.add(todas);
		}
		
		Collections.sort(contas);
		
		//System.out.println(contas);
		
		System.out.println("------------");
		for(Conta c : contas){
			System.out.println(c.getNumero());
			System.out.println(c.getNome());
			System.out.println(c.getSaldo());
		}
		/*
		//Randomiza os elementos da lista
		Collections.shuffle(contas);
		System.out.println("------------");
		for(Conta c : contas){
			System.out.println(c.getNumero());
		}
		
		//Rotaciona os elementos da lista
		Collections.rotate(contas, 1);
		System.out.println("------------");
		for(Conta c : contas){
			System.out.println(c.getNumero());
		}
		
		//Reverte a lista
		System.out.println("------------");
		Collections.reverse(contas);
		for(Conta c : contas){
			System.out.println(c.getNumero());
		}
*/		
	}

}
