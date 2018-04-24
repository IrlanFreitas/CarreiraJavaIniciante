package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ContaPoupanca;
import br.com.empresa.banco.sistema.AtualizadorDeContas;

public class TestaAtualizadorDeContas {

    public static void main(String[] args) {
    	//Conta[] c = new Conta[10];
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        
        cc.deposita(1000); 
        cp.deposita(1000);

        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

        adc.roda(cc);
        adc.roda(cp);

        System.out.println("Saldo Total: " + adc.getSaldoTotal());
    }

}
