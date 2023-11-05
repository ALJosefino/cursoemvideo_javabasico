package tiposprimitivos;

public class TiposPrimitivos {

    public static void main(String[] args) {
        
        /* Comentários padrão e automaticos deletados
        * Declaração das variaveis feitas abaixo
        */ 
        
        float nota = 8.5f; //f no final de 8.5 para indicar tipo float
        
        float nota1 = (float) 5.5; //declaração usando typecast
        
        float nota2 = 4.7f; //Declaração de variável para testar o comando sout
        
        float nota3 = (float) 9.2;
        
        float nota4 = 6.1f;
        
        String nome_aluno = "André";
        
        float nota5 = (float) 9.072;
        
        String nome_aluno1 = "Luis";
        
        System.out.println("A nota é: " + nota ); //Este é L N para Line New
        
        System.out.print("A nota1 é: " + nota1); /* A mensagem construido com 
        * sucesso fica colada por não ter espaçamento
        */ 
        
        System.out.println("A nota2 é: " + nota2); // Usado comando sout com TAB
        
        System.out.printf("A nota3 somente com percent e f é %f", nota3);
       
        System.out.printf("A nota3 com percent ponto e 2f %.2f", nota3);
       
        System.out.printf("A nota3 com percent ponto e 1f %.1f \n", nota3);
        
        System.out.printf("A nota3 somente com percent e f é %f \n", nota3);
       
        System.out.printf("A nota3 com percent ponto e 2f %.2f \n", nota3);
       
        System.out.printf("A nota3 com percent ponto e 1f %.1f \n", nota3);
          
        System.out.printf("A nota4 do aluno %s é %.2f \n", nome_aluno, nota4);
        
        System.out.format("A nota5 do aluno %s é %.3f \n", nome_aluno1, nota5);
    }
    
}
