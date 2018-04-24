package all;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaisSobreJavaOito {
	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<>();
		cursos.add( new Curso("Python", 45));
		cursos.add( new Curso("JavaScript", 150));
		cursos.add( new Curso("Java 8", 113));
		cursos.add( new Curso("C", 55));
		
		//Classe Optional
		//Geralmente são utilizados em conjunto com todo a declaração da stream
		Optional<Curso> optionalCurso = cursos.stream().filter(c -> c.getAlunos() >= 100).findAny();
		
		//Caso não exista
		Curso elemento = optionalCurso.orElse(null);
		//Se existir
		optionalCurso.ifPresent(c -> System.out.println(c.getAlunos()));
		
		//Depois que ter feito to o necessário com a lista é necessário receber esse valor,
		//por conta da stream não modificar a lista original.
		
		//Collectors é um Factory Methods
		cursos.stream().filter(c -> c.getAlunos() >= 100).collect(Collectors.toList());
		
		
		cursos.stream().filter(c -> c.getAlunos() >= 100)
					   .collect( Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()) )
					   .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos") ) ;
		
	}
	
}
