package vetor05;

/**
 *
 * @author andre
 */

public class Vetor05 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
                    
    int [] vetor = new int[100];
    
    int vetor1 [] = { 5, 2, 6, 0, 8, 9, 1, 7};
    
    int [] vetor2 = new int[20];
    
    System.out.printf("Total de indices deste vetor %d \n", vetor.length);
    
    System.out.println("__________________________");
    
    if (vetor == vetor1) System.out.printf("Comparação vetor e "
            + "vetor1 são iguais \n");
   
    else System.out.printf("Comparação vetor e vetor1 são diferentes \n");
    
    vetor = vetor1;
    
    System.out.println("__________________________");
    
    if (vetor == vetor1) System.out.printf("Comparação vetor e "
            + "vetor1 são iguais \n");
   
    else System.out.printf("Comparação vetor e vetor1 são diferentes \n");
    
    System.out.println("__________________________");
    
    System.out.printf("Total de indices deste vetor %d \n", vetor.length);
    
    System.out.println("__________________________");
    
    for ( int c = 0 ; c < vetor.length ; c ++ ) {
        
        System.out.printf("Posição %d no vetor número %d como contéudo. \n"
                , c , vetor[c] );
    
    }
    
    System.out.println("__________________________");
    
    System.out.printf("Total de indices deste vetor %d \n", vetor2.length);
    
    System.out.println("__________________________");
    
    for ( int c = 0 ; c < vetor2.length ; c ++ ) {
        
        System.out.printf("Posição %d no vetor número %d como contéudo. \n"
                , c , vetor2[c] );
               
    }    
     
    System.out.println("__________________________");
      
    
    
    }
    
}
