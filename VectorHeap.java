/**
 * Nombre: Javier Sebastián Valle Balsells
 * Carnet: 20159
 * Clase VectorHeap: Esta clase será la encargada 
 * Referencia: Ejemplo publicado en Canvas. 
 */

import java.util.Vector;

public class VectorHeap<E extends Comparable<E>> implements PriorityQueue<E>
{

	protected Vector<E> data; //Creando el vector data, que guardará los datos en el orden heap.

    /**
     * Constructor VectorHeap: este crea una cola de prioridad con un vector.
     * 
     */

	public VectorHeap()
	// post:construye un vector que hará una cola con prioridad.
	{
		data = new Vector<E>();
	}

    /**
     * Constructor 2 de VectorHeap: este añade los valores que se le enviarán al vector.
     * @param v
     */

	public VectorHeap(Vector<E> v)
	// post: se crea una cola con prioridad a partir de un vector no ordenado.
	{
		int i;
		data = new Vector<E>(v.size()); //se conoce el tamaño del vector.
		for (i = 0; i < v.size(); i++)
		{  //se añaden elementos al heap.
			add(v.get(i));
		}
	}

    /**
     * Método parent: Este método será el encargado de darle una llave a los valores ingresados.
     * @param i es un entero que será asignado luego.
     * @return es un retorno del entero que se asignará.
     */

	protected static int parent(int i)
	// pre: 0 <= i < size es un valor entre cero y el tamaño del vector.
	// post: se retorna un "padre" de un nodo en una ubicación i-ésima.
	{
		return (i-1)/2;
	}

    /**
     * 
     * Método left: este método se encarga de darle a un hijo en el lado izquierdo del árbol un index.
     * 
     * @param i valor numérico que se le dará al hijo ubicado en la rama derecha del árbol.
     * @return se retorna el index del hijo.
     */

	protected static int left(int i)
	// pre: 0 <= i < size se ubica el index del hijo ubicado en el lado izquierdo del árbol.
	// post: se retorna el index asignado al hijo derecho del nodo ubicado en una i-ésima ubicación.
	{
		return 2*i+1;
	}


    /**
     * 
     * Método right: este es el encargado de darle la llave al hijo que se ubica en la rama derecha del árbol.
     * 
     * @param i se recibe como parámetro un número que se asignará posteriormente.
     * @return se retorna el valor ya asignado al hijo derecho.
     */
    
	protected static int right(int i)
	// pre: 0 <= i < size se identifica en dond está el hijo derecho.
	// post: se le asigna al hijo derecho la llave que le corresponde.
	{
		return (2*i+1) + 1;
	}

    /**
     * Este método será el encargado de mover hacia arriba a un nodo cuando sea necesario.
     * 
     * @param leaf esta es la variable que será la encargada de ubicar el index del nodo que se moverá.
     */

	protected void percolateUp(int leaf)
	// pre: 0 <= leaf < size se ubica el index de la variable que se desea movere.
	// post: se mueve hasta arriba al nodo que se deseaba mover.
	{
		int parent = parent(leaf);
		E value = data.get(leaf);
		while (leaf > 0 &&
		(value.compareTo(data.get(parent)) < 0))
		{
			data.set(leaf,data.get(parent));
			leaf = parent;
			parent = parent(leaf);
		}
		data.set(leaf,value);
	}

    /**
     * Método add: este será el encargado de insertar los valores que se le estarán enviando al vector "data".
     * 
     * 
     */

	public void add(E value)
	// pre: es un valor no nulo que es capaz de ser comparado.
	// post: se agrega ya el valor deseado al vector "data".
	{
		data.add(value);
		percolateUp(data.size()-1);
	}

    /**
     * Método pushDownRoot: este método es el encargado de mover hacia abajo el nodo que se desea mover.
     * 
     * @param root se recibe como parámetro el index o llave del nodo a mover.
     */

	protected void pushDownRoot(int root)
	// pre: 0 <= root < size se busca el index del nodo a mover.
	// post: moves node at index root down se mueve hacia abajo el objeto a mover a una posición dada en un subárbol.
	{
		int heapSize = data.size();
		E value = data.get(root);
		while (root < heapSize) {
			int childpos = left(root);
			if (childpos < heapSize)
			{
				if ((right(root) < heapSize) &&
				((data.get(childpos+1)).compareTo
				(data.get(childpos)) < 0))
				{
					childpos++;
				}
			// Igualación: se busca al hijo más pequeño a mover.
			if ((data.get(childpos)).compareTo
				(value) < 0)
			{
				data.set(root,data.get(childpos));
				root = childpos; // se sigue moviendo hacia abajo el hijo.
			} else { //se encontró la posición correcta.
				data.set(root,value);
				return;
			}
			} else { // se inserta en una hoja lo que se desaba ingresar.
				data.set(root,value);
				return;
			}
		}
	}

    /**
     * Método para mover un elemento del árbol.
     */

	public E remove()
	// pre: el árbol, en este caso el vector, debe estar con contenido cargado.
	// post: se hace el retorno y se elimina el valor más pequeño de la cola.
	{
		E minVal = getFirst();
		data.set(0,data.get(data.size()-1));
		data.setSize(data.size()-1);
		if (data.size() > 1) pushDownRoot(0);
		return minVal;
	}

    /**
     * 
     * Implementaciones que requeria la clase hacer.
     * 
     */

    @Override
    public E getFirst() {
        // TODO Auto-generated method stub
        return data.get(0);
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        
    }

}