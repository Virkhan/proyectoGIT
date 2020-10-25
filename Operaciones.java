import java.util.Scanner;                                                    
public class Operaciones{
     public static void main(String[ ] args) {
     
       Scanner teclado = new Scanner(System.in);   
  
       int priment;
       int segent;
       int pulsado;
       int resultadoFinal=0;


       System.out.println("\nIntroduce un número entero:");
       priment = teclado.nextInt();

       System.out.println("Introduce otro número entero");
       segent = teclado.nextInt();

       System.out.printf("\n-------------------------");
       System.out.printf("\n 1  SUMA");
       System.out.printf("\n 2  RESTA");
       System.out.printf("\n 3  MULTIPLICACIÓN");
       System.out.printf("\n 4  DIVISIÓN");
       System.out.printf("\n 5  Resto de la división");
       System.out.printf("\n-------------------------");     

       System.out.println("\nNúmero de ejecución:");
       pulsado = teclado.nextInt();        

      
       switch (pulsado)
           {
            case 1:
               resultadoFinal=priment+segent;
               break;
            case 2:
               resultadoFinal=priment-segent;
               break;
            case 3:
               resultadoFinal=priment*segent;
               break;
            case 4:
               resultadoFinal=priment/segent;
               break;
            case 5:
               resultadoFinal=priment%segent;
               break;
            default:
               System.out.println("\nERROR");
              
           }



     System.out.printf("\nEl resultado final es de %d unidades\n", resultadoFinal); 
       
     }               
} 
