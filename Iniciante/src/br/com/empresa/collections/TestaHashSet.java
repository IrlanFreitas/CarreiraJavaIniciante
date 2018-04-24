package br.com.empresa.collections;

import java.util.ArrayList;

public class TestaHashSet {


	public static void main(String[] args) {

/*		Set<Conta> listagemNaoRepetida = new HashSet<>();
		Conta item = null;
		
		for (int i = 0; i < 10; i++) {
			item = new ContaCorrente();
			item.setNumero(i + 1);
			listagemNaoRepetida.add(item);
			listagemNaoRepetida.add(item);
			listagemNaoRepetida.add(item);
		}		
		System.out.println(listagemNaoRepetida.size());
		
		TreeSet<Integer> listagemInversa = new TreeSet<>();
		for (int i = 0; i < 10; i++) {
			listagemInversa.add(i+1);
		}
		for(Integer in : listagemInversa){
			System.out.println(in);
		}
		Iterator<Integer> i = listagemInversa.descendingIterator();
		
		while(i.hasNext()){
			System.out.println(i.next());
		}*/
		
		ArrayList<Integer> listagemInversa = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			
			listagemInversa.add(i+1);
		}
		for(Integer in : listagemInversa){
			System.out.println(in);
		}
		
		for (int i = (listagemInversa.size() - 1); i >= 0; i--) {
			System.out.println(listagemInversa.get(i));
		}
		
		
	}

}
