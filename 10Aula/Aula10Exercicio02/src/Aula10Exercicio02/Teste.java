
package Aula10Exercicio02;

/**
 *
 * @author andre
 */

public class Teste {
    
    public static void main(String [] args) {
        
        String nome = "João";
        
        imprimeNome("Empty");
        
        System.out.println("Contéudo da varável local nome no método principal " + nome);
    }
    
    public static void imprimeNome(String nome) {
        
        System.out.println("Conteúdo da variável nome trazido pelo método imprimeNome " + nome);
        
        if (!nome.isEmpty()) {
        
            System.out.println("Tudo bem " + nome + "?");
        
        } else {
                
                System.out.println("O nome é " + nome + "?");
        }
    }
}
