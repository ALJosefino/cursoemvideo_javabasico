package vetor07;

import java.util.Scanner;

/**
 *
 * @author andre
 */

public class Vetor07 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Este é um ano bissexto?");
        
        System.out.print("Digite sim ou nao: ");
        
        String bis  = teclado.nextLine();
        
        boolean resposta = bis.equals("sim") || bis.equals("nao") ? 
                true : false ;
        
               
        while (resposta == false) {
            
                    System.out.print("Foi digitado " + bis + " diferente de "
                 + "sim ou nao, por favor digite sim ou nao: ");
    
                    bis   = teclado.nextLine();
                    
                   resposta = bis.equals("sim") || bis.equals("nao") ? 
                           true : false ;
                    
        }
                       
        if ( bis.equals("sim")) System.out.println("Foi digitado " + bis + 
                " é um ano bissexto");
            
            else System.out.println("Foi digitado " + bis + 
                    ", não é um ano bissexto");   
        
        String [] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", 
            "Junho", "Julho", "Agosto", "Setembro", "Outubro", 
            "Novembro", "Dezembro"};
        
        int [] dias = {28,29,30,31};
        
        for ( int c = 0 ; c < meses.length ; c ++) {
                    
            String m = meses[c];
            
            if (m.equals("Janeiro") ||  m.equals("Março") || 
                m.equals("Maio") || m.equals("Julho") || 
                m.equals("Agosto") ||  m.equals("Outubro") || 
               m.equals("Dezembro")) {
                      
            
        } else if (m.equals("Abril") ||  m.equals("Junho") ||
                m.equals("Setembro") ||  m.equals("Novembro")) {
            
            
        } else {
        
        }
        }
        
        System.out.println(bis);
     
    }

}