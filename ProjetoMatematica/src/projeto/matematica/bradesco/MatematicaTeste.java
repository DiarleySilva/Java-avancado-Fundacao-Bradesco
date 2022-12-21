package projeto.matematica.bradesco;

/**
 * @author diarley
 */
public class MatematicaTeste {

    public static void main(String[] args) {

        Matematica numero = new Matematica();
        int maior = numero.maior(20, 30);
        System.out.println(maior);

        double soma = numero.soma(50, 60);
        System.out.println(soma);
    }
}