package br.com.empresa.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class TestaColecoesSets {

	public static void main(String[] args) {
		
		//Cole��es as quais n�o � permitido inserir o mesmo
		//elemento duas vezes ou mais, caso isso ocorra
		//o elemento em quest�o � ignorado. Facilitando
		//a busca, pois o metodo utilizado para compara��o
		//� quase o mesmo
		
		Set<String> nomes = new HashSet<String>();
		nomes.add("Mauricio");
		nomes.add("Guilherme");
		nomes.add("Lucas");
		nomes.add("Lucas");
		
		//System.out.println(nomes.size());
		
		//Para implementar a compara��o � necessario um m�todo
		//chamado hashCode() que funciona como um indexador
		//que retorna um numero baseado nos dados do objeto
		//facilitando a compara��o entre eles, se forem iguais
		// ir� gerar o mesmo valor
		
        //Set<Conta> contas = new HashSet<Conta>();
		
		//Interface comun entre os Lists e Sets, Collection
		Collection<Conta> contasSets = new HashSet<Conta>();
		
		Conta c1 = new ContaCorrente(500);
		Conta c2 = new ContaCorrente(700);
		
		contasSets.add(c1);
		contasSets.add(c1);
		contasSets.add(c2);
		
		//System.out.println(contas.size());
		
	}
}
