package vetor06;

/**
 *
 * @author andre
 */

public class Vetor06 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        String []meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", 
            "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", 
            "Dezembro" };
        
        int []dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for ( int c=0; c<meses.length; c++ ) {
            
            System.out.println("O mês de " + meses[c] + " tem " + dias[c] + " dias ao todo. ");
            
        }
        
        }
        
    }
