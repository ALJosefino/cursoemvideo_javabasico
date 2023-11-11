
package operadoresatribuicao;

public class OperadoresAtribuicao {

    public static void main(String[] args) {
    
        float cachorro = 9;
        
                       
        System.out.println("O conteúdo atribuido a variável criada com nome cachorro é: " + cachorro);        
        
        cachorro += 9;
        
        System.out.println("O conteúdo da variável nome cachorro depois de atribuido adição += de 9 é: " + cachorro);
        
        cachorro -= 8;
        
        System.out.println("O conteúdo da variável nome cachorro depois de atribuido subtração -= de 8 é: " + cachorro);
        
        cachorro *= 5;
        
        System.out.println("O conteúdo da variável nome cachorro depois de atribuido multiplicação *= de 5 é: " + cachorro);
        
        cachorro /= 2;
        
        System.out.println("O conteúdo da variável nome cachorro depois de atribuido divisão /= de 2 é: " + cachorro);
        
        cachorro %=  7;
        
        System.out.println("O conteúdo da variável nome cachorro depois de atribuido resto %= de 7 é: " + cachorro);
    }
    
}
