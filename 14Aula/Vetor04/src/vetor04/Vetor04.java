
package vetor04;

/**
 *
 * @author andre
 */

public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        int x[] = { 3, 2, 8, 7, 5, 4 };
                                
        int []n = new int[6];
        
        n = x;
        
        //Dois tipos de fazer o mesmo vetor e atribuido um ao outro
        
        if ( x == n ) System.out.println( "vetor x igual ao vetor n" );
        
        else System.out.println("vetor x diferente ao vetor n");
        
        
        for ( int c = 0; c <= 5; c ++ ){
        
            System.out.println(n[c]);
            
        }
                       
        for ( int c = 0; c <= 5; c ++ ){
        
            System.out.print(n[c] + " ");
            
        }
        
        System.out.println("");
        
        for ( int c = 0; c < n.length; c ++ ) {
        
            System.out.printf("Na posição %d esta o conteúdo %d.\n", c, n[c]);
        }
                
    }
    
}
