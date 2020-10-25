import java.util.Scanner;                                                    
public class Notas {
     public static void main(String[ ] args) {
     
       Scanner teclado = new Scanner(System.in);   
  

 
       int nota;
       System.out.printf("\nIntroduce una nota:");  
       nota =teclado.nextInt();   

       if (nota>=9) 
         {
       System.out.println("Excelente");
         }
       else if (nota>=6.5 && nota<9) 
         {
       System.out.println("Notable");
         }    
       else if (nota>=5 && nota<6.5) 
         {
       System.out.println("Aprobado");
         }   
       else   
         {
       System.out.println("Suspendido");
         }  
 
  
      
     }               
} 
