
package tiposprimitivosdoteclado;

import java.util.Scanner;

public class TiposPrimitivosDoTeclado {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Olá! Seja bem vindo(a) a calculadora notas.");
        
        System.out.print("Por favor, digite o nome do aluno(a): ");
        
        String nome_aluno = teclado.nextLine();
                
        System.out.printf("O nome do aluno(a) digitado foi: %s \n", nome_aluno);
        
        System.out.printf("Agora digite a nota de %s :", nome_aluno);
    
        float nota = teclado.nextFloat();
        
        System.out.printf("A nota digitada acima foi: %.2f ", nota);
        
        System.out.format("O nome digitado foi %s e a nota atribuida a este nome foi %.2f \n", nome_aluno, nota);
        
        System.out.print("Por favor digite a segunda nota: ");
        
        double nota1= teclado.nextDouble();
        
        System.out.printf("A segunda nota digitada foi %.2f \n", nota1);
        
        double soma = (double) 0;
        
        soma = nota + nota1;
        
        System.out.format("As notas somadas resulta em: %.2f ", soma);
    }
        
}
