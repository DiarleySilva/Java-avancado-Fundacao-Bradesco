package br.com.java;

/**
 * @author diarley
 */
public class TesteConta {
    
    public static void main(String[] args) {
        
        // Atribuindo com o construtor
        Conta cc = new Conta(123, 50);
        
        // Atribuindo com o construtor vazio
        // cc.setNumero(123); 
        
        System.out.println(cc.recuperarSaldo());
        
        
        /*
        Conta contaCorrente = new Conta();
        Conta contaPoupanca = new Conta();
        Conta contaInvestimento = new Conta();
        
        contaCorrente.numero = 11;
        contaCorrente.saldo = 20.5;
        contaCorrente.novoCliente.nome = "Diarley";
        contaCorrente.novoCliente.idade = 23;
        
        contaPoupanca.numero = 22;
        contaPoupanca.saldo = 30;
        contaPoupanca.novoCliente.nome = "Fulano";
        contaPoupanca.novoCliente.idade = 30;
        
        contaInvestimento.numero = 33; 
        contaInvestimento.saldo = 40;
        contaInvestimento.novoCliente.nome = "Ciclano";
        contaInvestimento.novoCliente.idade = 50;
        
        System.out.println("Número da conta: " + contaCorrente.numero);
        System.out.println("Saldo da conta: R$" + contaCorrente.saldo);
        System.out.println("Nome do cliente: " + contaCorrente.novoCliente.nome);
        System.out.println("Idade do cliente: " +contaCorrente.novoCliente.idade);
        */
    }
}