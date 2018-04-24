package br.com.empresa.libs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class TestaJavaIOSimples {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Lendo um arquivo
		Scanner sc = new Scanner(new FileInputStream("leitura.txt"));
		//Escrevendo um arquivo
		PrintStream ps = new PrintStream("saida.txt");
		
		while (sc.hasNext()) {
			
			String linha = sc.nextLine();
			System.out.println(linha);
			ps.append(linha);
			
			
		}
		
		sc.close();
		ps.close();
		
	}

}
