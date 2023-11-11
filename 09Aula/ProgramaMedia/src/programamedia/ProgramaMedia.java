package programamedia;

import java.util.Scanner;

public class ProgramaMedia {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite Nota 1: ");
            float nota1 = teclado.nextFloat();
            System.out.printf("%.1f digitada como Nota 1 \n", nota1);
        
        System.out.print("Digite Nota 2: ");
            float nota2 = teclado.nextFloat();
            System.out.printf("%.1f digitada como Nota 2 \n", nota2);
        
        float media = (nota1 + nota2) / 2;
        
        System.out.printf("%.1f de média entre Nota1 e Nota2. \n", media);
            
        
        if (media>9) {
                System.out.println("Média 9 ou acima! PARABÉNS!!");
        }
    }
}
