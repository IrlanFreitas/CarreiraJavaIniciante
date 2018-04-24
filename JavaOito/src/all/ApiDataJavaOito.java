package all;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class ApiDataJavaOito {
	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate olimpiadasRussia = LocalDate.of(2019, Month.JUNE, 5);
		
		Period periodo = Period.between(hoje, olimpiadasRussia);
		
		System.out.println(periodo);
		
		//Conceito de Imutabilidade - Mesmo das Streams
		LocalDate proxOlimpRussia = olimpiadasRussia.plusYears(4);
		
		System.out.println(proxOlimpRussia);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String valorFormatado = proxOlimpRussia.format(formatador);
		
		System.out.println(valorFormatado);
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		
		LocalDateTime agora = LocalDateTime.now();
		
		System.out.println(agora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm")));
		
		YearMonth mesAno = YearMonth.now();
		
		LocalTime intervalo = LocalTime.of(14, 0);
		
		
	}
}
