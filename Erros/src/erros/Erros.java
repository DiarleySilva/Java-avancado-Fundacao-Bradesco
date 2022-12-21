package erros;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author diarley
 */
public class Erros {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boolean continuar = false;

        do {
            try 
            {

                System.out.print("Numero: ");
                int a = teclado.nextInt();

                System.out.print("Divisor: ");
                int b = teclado.nextInt();

                System.out.println("O resultado é: " + a / b);

                continuar = false;
            }
            
            catch (InputMismatchException erro1) 
            {
                System.err.println("Insira números inteiros.");
                System.out.println("Erro de InputMismatchException capturado.");
                teclado.nextLine();
            }
            
            catch (Throwable erro2) 
            {
                System.err.println("O divisor deve ser diferente de zero.");
                System.out.println("Erro de ArithmaticException capturado.");
            }
            
            finally
            {
                System.out.println("Finally executado.");
            }
        } while(continuar);
    }
}
