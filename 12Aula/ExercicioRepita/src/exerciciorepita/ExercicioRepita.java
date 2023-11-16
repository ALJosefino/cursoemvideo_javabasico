package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // JOptionPane.showMessageDialog(null, "Olá Mundo!");
        
        int numero_digitado; 
        
        int soma_digitados = 0, 
            pares = 0, 
            impares = 0, 
            acima100 = 0, 
            quantidade_numeros = 0,
            media_soma_digitados;
        
        do {
        
        numero_digitado = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "<HTML> Informe um número <BR> "
              + "<EM> Número 0 interroompe </EM>: </HTML>"));
        
        JOptionPane.showMessageDialog(null,
                "Você digitou o número:" + numero_digitado);
                     
        ++quantidade_numeros;
        
        soma_digitados += numero_digitado;
        
        if  ( numero_digitado % 2 == 0 ) pares++;
        
        else impares++;
        
        acima100 = (numero_digitado > 100) ? ++acima100 : acima100 ;
    
        media_soma_digitados =(soma_digitados/ quantidade_numeros);    
                
        } while (numero_digitado != 0);
            
        JOptionPane.showMessageDialog(null, "<HTML>Resultado final<BR><HR><BR>"
                + "Somatório dos números: " + soma_digitados + "<BR>"
                + "Total de números pares: " + pares + "<BR>"
                + "Total de números impares: " + impares + "<BR>" 
                + "Números acima de 100: " + acima100 + "<BR>" 
                + "Média dos números digitados: " + media_soma_digitados 
                + "<BR>" + "</HTML>");
        
    }
    
}
