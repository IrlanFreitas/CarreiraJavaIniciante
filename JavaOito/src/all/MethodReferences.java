package all;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodReferences {

	public static void main(String[] args) {		
		ordenaStrings();
	}
	
	public static void ordenaStrings() {
		List<String> palavras = new ArrayList<>();

		palavras.add("Tudo bem como está você?");
		palavras.add("Casa");
		palavras.add("Oi");
		palavras.add("Tchau");
		
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()) );
		
		/*Novos métodos em interfaces antigas como o Comparator com o método estático
		comparing, que recebe uma função! que loco
		O que significa? s1 -> s1.lenght(), dada a String s1, obtenha o tamanho s1.length()
		Dessa forma o código tem muito mais expressivida de, como se lê uma frase seria,*/
		
		
//		Uma das novas interfaces funcionais, function que tem como assinatura o primeiro elemento
//		o que é passado de paramentro e o segundo o retorno
		Function<String, Integer> funcao = s1 -> s1.length() ;
		//Function<String, Integer> funcao2 = String::length ; //Indica que invoca somente um método.Isso é Lambda não reflection
		
		/*Palavras ordene comparando o tamanho da String*/
		palavras.sort( Comparator.comparing( funcao ) );
		
//		Sintaxe nova
		palavras.sort( Comparator.comparing( String::length ) );
		
//		palavras.forEach(p -> System.out.println(p));
		//Method References
//		palavras.forEach(System.out::println);
		
		 List<String> pM10 = palavras.stream().filter(s -> s.length() > 10).collect(Collectors.toList());
		 
		 pM10.forEach(System.out::println);
	}
}
