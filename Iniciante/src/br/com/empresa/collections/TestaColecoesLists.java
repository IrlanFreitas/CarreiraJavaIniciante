package br.com.empresa.collections;

import java.util.LinkedList;
import java.util.List;

public class TestaColecoesLists {
	
	public static void main(String[] args) {
		
		//� removido o ArrayList da referencia e colocado o 
		//List pois � melhor programar voltado as interfaces
		
		//Mostrando o poder do polimorfismo
		//Onde � mudado a instancia de ArrayList colocado
		//o LinkedList porem, como a garantia que os
		//metodos estar�o l� (intergface) a lista
		//existe a implementa��o � diferente
		
		//A interface List permite que o mesmo 
		//elemento seja adicionado duas vezes
		
		List<String> nomes = new LinkedList<String>();
		nomes.add("Mauricio");
		nomes.add("Guilherme");
		nomes.add("Lucas");
		nomes.add("Lucas");
		
		System.out.println(nomes.get(0));
		System.out.println(nomes.contains("Alane"));
		
		for(String s : nomes){
			System.out.println(s);
		}
		
	}
	
}
