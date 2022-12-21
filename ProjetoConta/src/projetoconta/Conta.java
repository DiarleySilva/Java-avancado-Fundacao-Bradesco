package projetoconta;

/**
 * @author diarley
 */
public class Conta {
    
    String cliente;
    double saldo;
    
    void exibeSaldo(){
        System.out.println(cliente + ", seu saldo é de: R$" + saldo);
    }

    void Saque(double valor){
        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso!");
    }
    
    void Deposito(double valor){
        saldo += valor;
        System.out.println("Deposito de R$" + valor + " realizado com sucesso!");
    }
    
    void TransferirValor(Conta destino, double valor){
        this.Saque(valor);
        destino.Deposito(valor);
        System.out.println("Transferência de R$" + valor + " realizada com sucesso!");
    }
}