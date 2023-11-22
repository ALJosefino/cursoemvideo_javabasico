package aula14exercicio02;

/**
 *
 * @author andre
 */

public class Aula14Exercicio02 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        String s = "CURSOEMVIDEO";
        
        char [] r = new char[12];
        
        for ( int c = s.length() - 1; c >= 0; c --) {
        
            r [c] = s.charAt(c);
                
        }
            for (char l : r) {
            
                System.out.print(l);
                
            }
        
        System.out.println("");
    }
    
}
