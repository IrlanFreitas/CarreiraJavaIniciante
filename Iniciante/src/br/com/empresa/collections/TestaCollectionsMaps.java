package br.com.empresa.collections;

import java.util.HashMap;
import java.util.Map;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class TestaCollectionsMaps {

	public static void main(String[] args) {
		
		
		//Collections que facilam ainda mais as buscas por
		//elementos pela chave, por uma pseudo banco de dados
		//em momeria, trabalhando com coleções do tipo, 
		//chave e valor, dado uma chave, busque um valor

		Map<String, Conta> contasMap = new HashMap<String, Conta>();
		Conta c1 = new ContaCorrente(500);
		Conta c2 = new ContaCorrente(700);
		Conta c3 = new ContaCorrente(15000);
		
		contasMap.put("desenvolvedor", c3);
		contasMap.put("diretor", c1);
		contasMap.put("dba", c2);
		
		System.out.println(contasMap.get("desenvolvedor").getSaldo());
		
	}
	
}
