package operadoreslogicos;

public class OperadoresLogicos {

    public static void main(String[] args) {
        
        int x = 4, y = 7, z = 12;
        
        boolean r;
        
        r = (x < y && y < z);
        
        System.out.printf(" V && V resultado é: %b \n", r);
        
        r = (x < y && y == z);
        
        System.out.printf(" V && F resultado é: %b \n", r);
        
        int q = 4, w = 7, e = 12;
        
        boolean t;
        
        t = (q < w || w == e);
        
        System.out.printf(" V || F resultado é: %b \n", t);
        
        t = (q < w ^ w == e);
        
        System.out.printf(" V ^ F resultado é: %b \n", t);
        
        t = (q < w ^ w < e);
        
        System.out.printf(" V ^ V resultado é: %b \n", t);
        
    }
    
}
