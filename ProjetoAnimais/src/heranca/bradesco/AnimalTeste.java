package heranca.bradesco;

/**
 * @author diarley
 */
public class AnimalTeste {
    
    public static void main(String[] args) {
        
        Cachorro dog = new Cachorro();
        dog.comida = "Ração";
        dog.Dormir();
        
        Galinha cocorico = new Galinha();
        cocorico.Dormir();
    }    
}