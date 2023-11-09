
package operadoresunarios;

public class OperadoresUnarios {

    public static void main(String[] args) {
        
        int numero = 5;
                System.out.println("Declaração da variável nome número recebe: " + numero);
        numero++;
                System.out.println("Usado operador unário de incremento ++ " + numero);
        numero--;
                System.out.println("Usado operador unário de decremento -- " + numero);
        
        System.out.println("__________________________________________________");
        
        int banana = 7;
        int morango = 3 + banana++;
        System.out.println("O conteúdo da variável banana terminou em: " + banana);
        System.out.println("O conteúdo da váriavel morango terminou em: " + morango);
        System.out.println("O conteúdo da váriável banana que foi "
                + "declarada e atribuida 7 "
                + "recebeu pós incremento banana++ " + banana);
                
        
        int caju = 4;
        int pera = 9 + ++caju;
        System.out.println("O conteúdo da variável caju terminou em: " + caju);
        System.out.println("O conteúdo da variável pêra terminou em: " + pera);
        System.out.println("O conteúdo da váriável caju que foi "
                + "declarada e atribuida 4 "
                + "recebeu PRÉ incremento ++pera " + pera);
        
        
    }
    
}
