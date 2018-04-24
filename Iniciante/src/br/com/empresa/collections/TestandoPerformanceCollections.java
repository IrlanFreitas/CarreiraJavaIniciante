package br.com.empresa.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestandoPerformanceCollections {

		public static void main(String[] args) {
            System.out.println("Iniciando...");
            
            //Testando a velocidade de um ArrayList e HashSet na
            //Inserção e busca de elementos no vetor.
            //HashSet ganha disparado.
            
            Collection<Integer> teste = new ArrayList<>();
            long inicio = System.currentTimeMillis();

            int total = 1000000;

            for (int i = 0; i < total; i++) {
                teste.add(i);
            }

            for (int i = 0; i < total; i++) {
                teste.contains(i);
            }

            long fim = System.currentTimeMillis();
            long tempo = fim - inicio;
            System.out.println("Tempo gasto: " + tempo);

	}

}
