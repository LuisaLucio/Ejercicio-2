package buscarelemento;
import java.util.Scanner;

/**
 *
 * @author Luisa Lucio
 */
public class BuscarElemento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        //Declaracion e inicializacion 
        int [] arrayNumeros = new int [10];
                
        //Asignacion de valores en el arrray
        for(int i=0; i < arrayNumeros.length; i++){
            arrayNumeros[i]= i +  18;
            System.out.print(arrayNumeros[i]+ " ");
            
        }
        
        System.out.println();     
        
        //Pide un numero a buscar en el array
        System.out.println("INGRESE UN NUMERO A BUSCAR: ");
        int x= sc.nextInt();

        //Buscar y mostrarel indice
        boolean encontrado= false;
        
        for(int i=0; i < arrayNumeros.length; i++){ 
            if (arrayNumeros[i]== x){
                System.out.println("EL NUMERO QUE FUE ENCONTRADO EN EL INDICE: "+ i);
                encontrado=true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("EL NUMERO NO FUE ENCONTRADO EN EL ARRAY");
        }
    }    
}
