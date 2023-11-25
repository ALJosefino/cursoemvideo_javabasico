
package funcao01;

/**
 *
 * @author andre
 */

public class Funcao01 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Fatorial f = new Fatorial();
        
        f.setNumero(5);
        
        System.out.printf(f.getFormula());
        
        System.out.println(f.getFatorial());
    }
    
}
