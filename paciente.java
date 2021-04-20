/**
 * 
 * @author Javier Sebastián Valle Balsells
 * @carnet 20159
 * @sección 10
 * 
 */
public class paciente implements Comparable<paciente>
{
    /**
     * Sección de variables. :V
     */
    private String nombre;
    private String desc; 
    private String let; 

    /**
     * Constructor que se encargará de almacenar las variables necesarias para poder usarlas.
     * 
     * @param nombre esta variable recibe el nombre del paciente.
     * @param desc esta variable recibe la descripción de lo que tiene.
     * @param let esta variable recibe la letra de urgencia.
     */

   public paciente(String nombre, String desc, String let)
   {
        this.nombre = nombre;
        this.desc = desc;
        this.let = let;
   }

   /**
    * Método que devuelve al paciente con sus descripciones necesarias.
    */

   public String toString()
   {
       return this.getNombre() + "/" + this.getDesc() + "/" + this.getLet();
   }

   /**
    * Este método servirá para hacer comparaciones.
    */

   @Override
   public int compareTo(paciente o) {

       // Se hace la comparación necesaria para la prioridad.

       return this.getLet().compareTo(o.getLet());
   }

   /**
    * Getter del nombre del paciente.
    * @return se retorna el nombre del paciente deseado.
    */

   public String getNombre()
   {
       return nombre;
   }

   /**
    * Setter del nombre del paciente.
    * @param nombre se recibe como parámetro el nombre del paciente a ingresar.
    */

   public void setNombre(String nombre)
   {
        this.nombre = nombre; 
   }

   /**
    * Getter de la descripción del paciente.
    * @return se retorna la descripción del paciente ingresado.
    */
   public String getDesc()
   {
       return desc;
   }

   /**
    * Setter de la descripción del paciente.
    * @param desc Se recibe la descripción del paciente ingresado.
    */
   public void setDesc(String desc)
   {
        this.desc = desc; 
   }


   /**
    * Getter de la letra que da la prioridad al paciente.
    * @return se retorna la letra de prioridad del paciente.
    */

   public String getLet()
   {
       return let;
   }

   /**
    * Setter de la letra que le dará prioridad al paciente que se ingresa.
    * @param let se envía como parámetro la letra que le da la prioridad al paciente.
    */
   public void setLet(String let)
   {
        this.let = let; 
   }
}
