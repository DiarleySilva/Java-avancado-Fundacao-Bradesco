package projetoconta;

/**
 * @author diarley
 */
public class ContaTeste {
    
    public static void main(String[] args) {
        
        Conta contaNova = new Conta(); 
        contaNova.cliente = "Diarley";
        contaNova.saldo = 1000;
        
        Conta destino = new Conta();
        contaNova.cliente = "Teste";
        contaNova.saldo = 500;
        
        /*
        contaNova.Saque(500); // Fazendo um saque de 500 reais
        contaNova.exibeSaldo(); // Exibe o saldo após o saque
        
        contaNova.Deposito(2000); // Fazendo um deposito de 2000 reais
        contaNova.exibeSaldo(); // Exibindo o saldo após o deposito
        */
        
        contaNova.exibeSaldo();
        destino.exibeSaldo();
    }    
}