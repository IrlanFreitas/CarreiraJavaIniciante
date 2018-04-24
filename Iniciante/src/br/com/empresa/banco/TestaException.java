package br.com.empresa.banco;

import java.io.FileInputStream;
import java.io.IOException;

import br.com.empresa.banco.conta.Conta;

public class TestaException {

	public static void main(String[] args) {
		Conta c = null;
		FileInputStream fileInputStream = null;
		
		try{
			System.out.println(c.getNome());
		} catch(NullPointerException e){
			System.out.println(e);
		}
		
	    try {
	    	fileInputStream = new java.io.FileInputStream("arquivo.txt");
	    	fileInputStream.close();
	    } catch (java.io.FileNotFoundException e) {
	        System.out.println("Nao foi possível abrir o arquivo para leitura");
	    } catch (IOException e) {
			e.printStackTrace();
		} finally {

		}
		
	}
	
}
