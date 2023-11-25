
package classes;

/**
 *
 * @author andre
 */

public class Fatorial {
    
    private int numero = 0;
    
    private int fatorial = 1;
    
    private String formula = "";
    
    public void setNumero(int num) {
    
        numero = num;
        
        int fator = 1;
        
        String s = "";
        
        for (int contador = num; contador > 1; contador -- ) {
        
            fator *= contador;
            
            s += contador + " x ";
        
        }
        
        s += " 1 ";
        
        fatorial = fator;
        
        formula = s;
        
    }

    public int getFatorial() {
        
        return fatorial;
    
    }
    
    public String getFormula() {
    
        return formula;
        
    }
    
}
