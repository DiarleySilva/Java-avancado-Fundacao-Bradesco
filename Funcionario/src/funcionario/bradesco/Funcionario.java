package funcionario.bradesco;

/**
 * @author diarley
 */
public class Funcionario {
    
    private String nome;
    private boolean ativo;
    
    // Encapsulamento com os métodos Get e Set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }           
}