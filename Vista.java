/**
 * @author Javier Sebastián Valle Balsells 
 * Carnet 20159
 * Sección 10
 * 
 * Clase Vista: Esta clase será la encargada de hacer que el usuario interactúe con el programa.
 * 
 */
//Imports necesarios.
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Vista 
{
    //Variables a usar para poder enviarlas al VectorHeap.
   static String nombre;
   static String emergencia; 
   static String codigo; 
    
    //Variables para los separadores.
    static int separador1;

    //Variables para las elecciones.
    private static int eleccion; 
    private static Scanner ele;  

    
    //Instancias de las clases.
    //static VectorHeap<paciente> vectorheap = new VectorHeap<>(); 

    /**
     * Método menu: Este método será el encargado de darle al usuario la opción de usar la implementación de VectorHeap o la opción de Java Collection Framework para poder usar el sistema hospitalario.
     */


    public static void menu()
    {
        System.out.println("Bienvenido al sistema hospitalario de atención de pacientes.");
        System.out.println("1. Usar la implementación de VectorHeap");
        System.out.println("2. Usar la implementación de Java Collection Framework");
        System.out.println("0. Salir del sistema.");

        //While para las elecciones.
        while(true)
        {
            //Progra defensiva.
            try {
                //Eligiendo una implementación.
               System.out.println("¿Cuál implementación desea usar?"); 
               
               eleccion = ele.nextInt(); 

               //Analizando opciones.
               if(eleccion > 2 || eleccion < 0)
               {
                   System.out.println("Esta opción no existe en el menú.");
               }else
               {
                   //Se sigue con la ejecución.
                   break;
               }
            } catch (Exception OpocionInvalida) {
                //Se eligió una opción no numérica.
                ele.nextLine(); 

                System.out.println("Se eligió una opción no numérica, favor elegir una numérica.");
            }
        }

        //Trayendo métodos.
        //if(eleccion == 1){Heap();}
    }

}
