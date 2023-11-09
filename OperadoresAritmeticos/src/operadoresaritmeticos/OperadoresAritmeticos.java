
package operadoresaritmeticos;


public class OperadoresAritmeticos {

    public static void main(String[] args) {
      int n1 = 3;
      int n2 = 5;
      float media = (n1+n2)/2;
      System.out.println("A média é igual a " + media);
      
      int n3 = 6;
      int n4 = 4;
      float media1 = n3+n4/2;
      System.out.println("A regra da precedência começa primeiro a \n"
              + "divisão e depois soma " + media1);
      
    }
    
}
