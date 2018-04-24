package br.com.empresa.io;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class TestingIOSimples {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		PrintStream ps = new PrintStream("exerSaida.txt");
		
		System.out.println("Começe a digitar:");
		
		while (sc.hasNextLine()) {
			ps.println(sc.nextLine());
		}
		ps.close();
		sc.close();
		
		System.out.println("Finalizado com sucesso!");
		
	}
}
