package operadorternario2;

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
        
        
    }
    
}
