package br.com.empresa.collections;

import java.util.LinkedList;
import java.util.List;

public class TestaColecoesLists {
	
	public static void main(String[] args) {
		
		//É removido o ArrayList da referencia e colocado o 
		//List pois é melhor programar voltado as interfaces
		
		//Mostrando o poder do polimorfismo
		//Onde é mudado a instancia de ArrayList colocado
		//o LinkedList porem, como a garantia que os
		//metodos estarão lá (intergface) a lista
		//existe a implementação é diferente
		
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
