package br.com.empresa.banco.threads;

import java.util.Collection;

public class ProduzMensagens implements Runnable {
    private int comeco;
    private int fim;
    private Collection<String> mensagens;

    public ProduzMensagens(int comeco, int fim, Collection<String> mensagens) {
        this.comeco = comeco;
        this.fim = fim;
        this.mensagens = mensagens;
    }

    @Override
	public  void run() {
        for (int i = comeco; i < fim; i++) {
            
        	//Usando Theard safe, Vector n�o ha necessidade de synchronized
        	//pois a classe � thead safe
        	//synchronized(mensagens){
        	mensagens.add("Mensagem: " + i);
           //}
        }
    }
}
