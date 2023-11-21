
package vetor11;

/**
 *
 * @author andre
 */
public class Vetor11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Instaciado o vetor n e criado com "
                + "atribuição vetor x");
                
        int [] n = new int [2];
        
        System.out.println("A quantidade de indices do vetor n é: " + n.length);
        
        int x [] = {9,5,7,3,1,8};
    
        System.out.println("A qunatidade de indices do vetor x é: " + x.length);
        
        n = x;
        
        System.out.printf("Vetor x foi atribuido ao vetor n e agora "
                + "tem a quantidade de indice %d ", n.length);
        
        for (int c = 0; c <= n.length -1; c++) {
        
            //Neste exemplo o conteúdo do indice 0 não será exibido
            
            System.out.println("Na posição " + c + " o conteúdo no "
                    + "vetor é " + n[c]);
            
        }
        
    }
    
}
