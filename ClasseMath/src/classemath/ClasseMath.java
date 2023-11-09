package classemath;

public class ClasseMath {

    public static void main(String[] args) {
    
        float numero_pi = (float) Math.PI;
        
        System.out.printf("Número PI %.16f \n", numero_pi);
        
        float exponen = (float) Math.pow(5,4);
        
        System.out.format("5 elevado 4 %.2f \n", exponen);
        
        float r_quad = (float) Math.sqrt(121);
        
        System.out.format("%.2f \n", r_quad );
        
        float r_cubi = (float) Math.cbrt(27);
        
        System.out.printf("%.2f \n", r_cubi);
    }
}
