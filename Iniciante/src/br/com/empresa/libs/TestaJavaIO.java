package br.com.empresa.libs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TestaJavaIO {

	public static void main(String[] args) throws IOException {
		
		//Definido o arquivo que será lido, porem, somente byte a byte
		InputStream is = System.in;//new FileInputStream("leitura.txt");
		//Consegue ler o arquivo porem, char a char
		InputStreamReader isr = new InputStreamReader(is);
		//Cria um buffer de memória com os dados
		BufferedReader br = new BufferedReader(isr);
		
		
		//Utilizado para escrever bytes
		OutputStream os = /*System.out;*/new FileOutputStream("saida.txt");
		//Utilizado para escrever chars
		OutputStreamWriter osw = new OutputStreamWriter(os);
		//Utilizado para escrever Strings
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		
		String linha = br.readLine();
		
		while (linha != null) {
			bw.append(linha);
			bw.newLine();
			//System.out.println(linha);
			linha = br.readLine();
			
		}
		
		bw.close();
		br.close();
		
	}

}
