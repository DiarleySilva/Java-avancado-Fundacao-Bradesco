package br.com.java;

/**
 * @author diarley
 */
public class Conta {
    
    private int numero;
    private double saldo;
    
    // Construtor vazio(padrão)
    public Conta(){
    }
    
    // Construtor de classe sem receber todos os atributos
    public Conta(int numero){
        this.numero = numero;
        this.saldo = 0; // Criando um número, mas com o saldo 0
    }
    
    // Construtor que recebe apenas o atributo saldo, pórem precisar receber em double
    // Se não, ira cair no construtor que recebe o int, que é um número de conta
    public Conta(double saldo){
        this.saldo = saldo;
    }
    
    // Construtor de classe
    public Conta(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
        
        System.out.println("Número: " + numero);
        System.out.println("Saldo: R$" + saldo);
    }
    
    // Metódos
    public double recuperarSaldo(){
        return saldo;
    }
    
    public void depositar(double valor){
        saldo = saldo + valor;
        // Ou saldo += valor;
    }
    
    // Sobrecarga de metódos
    public void retirar(double valor){
        saldo = saldo - valor;
    }
    
    public void retirar(double valor, double taxa){
        saldo = saldo - valor - taxa;
    }
    
    // Sobrecarga de atributos
    int agencia;
    
    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
    
    // Metódos gets e sets
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}