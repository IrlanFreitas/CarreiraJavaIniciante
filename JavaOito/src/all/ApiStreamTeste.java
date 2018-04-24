package all;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ApiStreamTeste {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		cursos.add( new Curso("Python", 45));
		cursos.add( new Curso("JavaScript", 150));
		cursos.add( new Curso("Java 8", 113));
		cursos.add( new Curso("C", 55));
				
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		cursos.stream().mapToInt(Curso::getAlunos).average().orElse(0);
		
		cursos.sort((c1, c2) -> Integer.compare(c1.getAlunos(), c2.getAlunos()));
		
		cursos.forEach(c -> System.out.println(c.getNome()) );
		
		// Anony Class
		cursos = cursos.stream().filter(new Predicate<Curso>() {

			@Override
			public boolean test(Curso t) {
				
				return t.getAlunos() > 110;
			}
			
		}).collect(Collectors.toList());

		// Stream + Lambda Expression + Method Reference 
		cursos.stream().filter(curso -> curso.getAlunos() > 50).map(Curso::getAlunos).forEach(System.out::println);
		
		// IntStream + Lambda Expression + Method Reference 
		// Diferença do Stream para o IntStream são os metodos que só são permitidos se trabalhar com int, como
		// soma, maior, menor...
		System.out.println( cursos.stream().filter(curso -> curso.getAlunos() > 100)
										   .mapToInt(Curso::getAlunos)
										   .summaryStatistics()
										   .getMax() );
		
		System.out.println("Filtrados:");
		cursos.forEach(c -> System.out.println(c.getNome()) );
		
		//Mapeando para Stream de String ou List, caso usasse o collect
//		Stream<String> nomes = cursos.stream().map(Curso::getNome);
	}
}


class Curso {
	
	private String nome;
	private int alunos;
	
	public Curso(String nome, int alunos) {
		super();
		this.nome = nome;
		this.alunos = alunos;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAlunos() {
		return alunos;
	}
	public void setAlunos(int alunos) {
		this.alunos = alunos;
	}
	
}