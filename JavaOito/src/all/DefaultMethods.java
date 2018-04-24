package all;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethods {
	public static void main(String[] args) {
		ordenaStrings();
	}

	public static void ordenaStrings() {

		List<String> letras = new ArrayList<>();

		letras.add("Tudo bem como está você?");
		letras.add("Casa");
		letras.add("Oi");
		letras.add("Tchau");
		
		for (String item : letras) {
			System.out.println(item);
		}

		//Classe Anonima que funcionam encima das Interfaces funcionais, que
		//basimente são interfaces que tem um ou poucos métodos
		Comparator<String> letrasComparatorTamanho = new Comparator<String>() {
			
			public int compare(String stg1, String stg2) {
				return stg1.length() > stg2.length() ? 1 : stg1.length() < stg2.length() ? -1 : 0;
			}
			
		};
		
		//Classes Anonimas
		letras.sort(new Comparator<String>() {
			
			public int compare(String stg1, String stg2) {
				return stg1.length() > stg2.length() ? 1 : stg1.length() < stg2.length() ? -1 : 0;
			}
			
		}); //Java 8 - Default Methods

		System.out.println("__________");
//		Collections.sort(letras, letrasComparatorTamanho);
		
		for (String item : letras) {
			System.out.println(item);
		}
		
//		Consumer<String> consumidor = new ImprimeNaLinha();
//		System.out.println("forEach");
//		letras.forEach(consumidor);

	}
	
	public static void exibePessoas(){
		Pessoa p1 = new Pessoa("Irlan", 22 ,"M");
		Pessoa p2 = new Pessoa("Lucas", 16 ,"M");
		Pessoa p3 = new Pessoa("Pedro", 22 ,"M");
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		
		Consumer<Pessoa> consumer = new Consumidor();
		
		pessoas.forEach(consumer);
		
	}
}


class ImprimeNaLinha implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
	}
	
}

class Consumidor implements Consumer<Pessoa> {

	@Override
	public void accept(Pessoa t) {
		System.out.println("_____________________________");
		System.out.println("           Dados");
		System.out.println("Nome: "+ t.getNome());
		System.out.println("Idade: "+ t.getIdade());
		System.out.println("Sexo: "+ t.getSexo());
		System.out.println("_____________________________");
	}
	
}