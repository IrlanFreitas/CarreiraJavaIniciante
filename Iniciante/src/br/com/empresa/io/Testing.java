package br.com.empresa.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Testing {

	public static void main(String[] args) throws IOException {

		// InputStream is = System.in;

		BufferedReader bf = new BufferedReader(
								new InputStreamReader(
										new FileInputStream("arquivo.txt")));

		String[] linhas = null;
		String linha = "";
		String verifica = "";

		do {
			verifica = bf.readLine();
			if (verifica != null) {
				linha += verifica;
			}

		} while (verifica != null);

		linhas = linha.split(" ");

		System.out.println("\n");
		for (String string : linhas) {
			System.out.println(string);
		}
		bf.close();

	}

}
