/**
 * @author: Javier Sebastián Valle Balsells
 * @Carnet: 20159
 * @see: https://docs.oracle.com/javase/7/docs/api/java/util/PriorityQueue.html
 * @see: https://www.freecodecamp.org/news/priority-queue-implementation-in-java/
 * 
 */

import java.util.PriorityQueue;

public class Imple<E>{
    
    protected PriorityQueue Pac = new PriorityQueue<>(); //Lista que se usará para los pacientes del hospital.


    /**
     * 
     * @param a se envían los parámetros a obtener de la cola prioritaria.
     */
    public Imple(PriorityQueue<E> a)
    {
        Pac = new PriorityQueue<E>(a.size());
        for(int i = 0; i<a.size(); i++)
        {
            a.poll();
        }
    }

     /**
      * 
      * @param value se envía como valor los objetos a añadir, en este caso la info de los pacientes.
      */

    public void add(E value)
    {
        Pac.add(value);
 
    }

    /**
     * Método String siguiente: este será el encargado de obtener a los pacientes de baja prioridad. 
     * @return
     */

    public String siguiente()
    {
        if(!Pac.isEmpty())
        {
            //Si la lista no está vacía, entonces se envía de regreso al paciente a atender en el hospital.
            String paciente = Pac.poll().toString();
            return paciente;
        }else
        {
            //Si la lista está vacía, entonces se notifica que no se atenderá a nadie.
            return "Ya no quedan pacientes por atender";
        }
    }

    /**
     * Método String prioridad: este será el encargado de poder enviar al paciente de alta prioridad a atender en el hospital.
    */
    public String prioridad()
    {
        if(!Pac.isEmpty())
        {
            //Si en caso la lista tiene contenido, entonces se atenderá a la persona con mayor prioridad.
            String paciente = Pac.peek().toString();

            return paciente; 
        }else
        {   
            //Si en caso la lista está vacía, entonces se notifica que no hay pacientes a atender.
            return "No hay pacientes por atender";
        }
    }
} 