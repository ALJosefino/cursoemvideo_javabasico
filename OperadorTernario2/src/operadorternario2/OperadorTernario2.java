package operadorternario2;

import java.util.Scanner;

public class OperadorTernario2 {

    public static void main(String[] args) {
     
        System.out.println("Operador ternário: 0 se verdadeiro");
        
        System.out.println("Operador ternário: 1 se falso");
        
        int n1 = 4, n2 = 3;
        
        int r = n1 > n2 ? 0 : 1;
        
        System.out.printf("Resultado de n1 > n2: %d \n", r);
        
        int k1 = 5, k2 = 6, x;
        
        x = k1 > k2 ? 0 : 1;
        
        System.out.printf("Resultado de k1 < k2: %d \n", x);
        
        int f1 = 7, f2 = 7, d;
        
        d = f1 == f2 ? 0 : 1;
        
        System.out.printf("Resultado de f1 = f2: %d \n", d);
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.printf("Digite um número:");
        
        int e1 = (Integer) teclado.nextInt();
        
        System.out.printf("Digitado %d. \n", e1);
        
        System.out.printf("Digite outro número:");
        
        int e2 = (Integer) teclado.nextInt();
        
        System.out.printf("Digitado %d. \n", e2);
        
        int l = e1 > e2 ? e1 + e2 : e2 - e1;
        
        System.out.printf("Este número é o resultado de uma adição ou subtração %d. \n", l);
        
        System.out.printf("Digite um número:");
        
        int g1 = (Integer) teclado.nextInt();
        
        System.out.printf("Digitado %d. \n", g1);
        
        System.out.printf("Digite um número:");
        
        int g2 = (Integer) teclado.nextInt();
        
        System.out.printf("Digitado %d. \n", g2);
        
        int o = g1-g2 > g2+g1 ? 9 : 0;

        System.out.printf("Adição maior do que Subtração ou não %d. \n", o);
    }
    
}
