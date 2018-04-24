package all;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Lambda {

	public static void main(String[] args) {
		ordenaStrings();
	}

	public static void ordenaStrings() {
		List<String> letras = new ArrayList<>();

		letras.add("Tudo bem como está você?");
		letras.add("Casa");
		letras.add("Oi");
		letras.add("Tchau");

		letras.sort(
				// new Comparator<String>() {
				// public int compare - Uma das formas de lambda baseado na ideia que tudo que se passa já é um consumer
				(String stg1, String stg2) -> {
					return stg1.length() > stg2.length() ? 1 : stg1.length() < stg2.length() ? -1 : 0;
				}
		// }
		);

		//Usando Lambda + Method References
		//Onde basicamente indica, lista letras ordene a string ignorando o camel
		letras.sort( String::compareToIgnoreCase );
		
		letras.forEach(System.out::println);
		
		System.out.println("Depois do Method References");
		
		//Forma enxuta
		//Não precisa do tipo no parametro - ele infere
		//Não precisa de return por conta da Interface Funcional é notavel o funcionamento, duas Strings de paramentro e um int de retorno
		//Por ter uma linha, não precisa ter ponto e vírgula no statement 
		letras.sort( (stg1, stg2) -> Integer.compare( stg1.length(), stg2.length() ) );
		
		
		// Primeira forma vista do lambda - Pra mim
		letras.forEach((String item) -> {
			System.out.println(item + " " + item.length());
		});

		// Forma mais enxuta
		letras.forEach(item -> System.out.println(item + " " + item.length()));
		
		// Compilador infere e "transforma" a expressão lambda em um Interface Funcional
		Consumer<String> consumidorLambda = item -> System.out.println(item + " " + item.length()) ;
		
		Comparator<String> comparadorLambda = (item1, item2) -> Integer.compare(item1.length(), item2.length()) ;
		
	}

}
