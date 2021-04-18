/**
 * Nombre: Javier Sebastián Valle Balsells
 * Carnet: 20159
 * Sección: 10
 * 
 * Clase de tipo interfaz llamada PriorityQueue: esta es la encargada de darle los métodos a la clase Vector Heap.
 * 
 * 
 * @param <E> se le asigna la E, porque será un objeto.
 */

public interface PriorityQueue<E extends Comparable<E>>
{
	public E getFirst();
	// pre: el vector debe estar lleno para poder recoger el primer valor del mismo.
	// post: se retorna el mínimo valor en la cola prioritaria.
	
	public E remove();
	// pre: el vector debe estar lleno para poder remover el objeto deseado.
	// post: se retorna y se elimina el mínimo valor de la cola.
	
	public void add(E value);
	// pre: comparable el valor es no nulo y es capaz de ser comparado.
	// post: el valor es añadido a la cola prioritaria.
	
	public boolean isEmpty();
	// post: se retorna verdadero si en caso la cola está vacía.
	
	public int size();
	// post: se retorna la cantidad de elementos que hay en la cola.
	
	public void clear();
	// post: se eliminan todos los elementos de la cola.
}