
package operadore_logicos;

/**
 *
 * @author Kevin Mauricio
 */
public class Operadore_Logicos {
   // diferente de  ( != )                   // negacion ( ! )
   // mayor que  ( > )                      // "o" selecciona una u otra opcion ( || )
   // menor que ( < )                       //  "i" se cumplen las 2 condiciones  ( && ) 
   // mayor o igual que  ( >= )             // comparacion ( == )
   // menor o igual que  ( <= ) 
 
    public static void main(String[] args) {
        System.out.println("ejemplo de los operadores mayor y menor ");
        int x=100 , y=200 ;
        if(x<y)
        {
            System.out.println("la variable x es mayor");
        }
        
        // ejemplo de comparacion entre 2 variables  solo da un valor true o false 
        System.out.println("Ejemplo de el operador de comparacion");
        int a =202;
        int b = 200;
        a=b; // aqui a la variable "a" le asigno el valor de la variable "b"  a=200 
        
        if(a==b) // para que esta condidion se cumpla a =200 y b= 200 se cumple el if
        {
            System.out.println("if ejecutado correctamente ");
        }
        else
        {
            System.out.println("else ejecutado correctamente");
        }
        
        
        System.out.println("ejemplo operador && and");
        // se tiene que cumpir las 2 condiciones para que sea verdadero
        int var1 =20 , var2=21;
        
        if(var1==20 && var2==20)
        {
            System.out.println("se ejecuta el if ");            
        }
        else
        {
            System.out.println("se ejecuta el else");
        }
        
         System.out.println("ejemplo operador || or");
         // aqui solo se necesita cumplir una condicion para que sea verdadero
          int kevs1=30 ,kevs2=40;
          if(kevs1==30 || kevs2==30)
          {
              System.out.println("se ejecuta el if");
          }
          else
          {
              System.out.println("se ejecuta el else");
          }
        
        
        
        
        
        
                    
             
        
        
        
    }
    
}
