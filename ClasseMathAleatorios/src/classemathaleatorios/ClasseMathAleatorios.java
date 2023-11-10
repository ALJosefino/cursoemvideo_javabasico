package classemathaleatorios;

public class ClasseMathAleatorios {

    public static void main(String[] args) {
        
        double aleatorio = Math.random();
        
        System.out.printf("Número gerado pelo método random da classe Math %f \n", aleatorio);
        
        int intervalo = (int) (1 + aleatorio * (10-1));
        
        System.out.printf("Número no intervadlo de %d \n", intervalo);
        
        int intervalo1 = (int) (1 + aleatorio * (10-5));
        
        System.out.printf("Número no intervadlo de %d \n", intervalo1);
        
        int intervalo2 = (int) (1 + aleatorio * (20-1));
        
        System.out.printf("Número no intervadlo de %d \n", intervalo2);
        
        
        int intervalo3 = (int) (1 + aleatorio * (50-1));
        
        System.out.printf("Número no intervadlo de %d \n", intervalo3);
    }
    
}
