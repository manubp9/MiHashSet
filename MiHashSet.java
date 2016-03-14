import java.util.ArrayList;
/**
 * Write a description of class MiHashSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashSet
{
    private ArrayList lista;

    /**
     * Constructor for objects of class MiHashSet
     */
    public MiHashSet()
    {
        lista = new ArrayList();
    }

    /**
     * añade el elemento al conjunto si no estaba. 
     * Devuelve verdadero en caso de que el elemento no estuviera presente en el conjunto 
     * y falso en caso contrario.
     */
    public boolean add(int valor)
    {
        boolean enLaLista = true;//interruptor logico 
        if((lista.contains(valor)))
        {
            enLaLista = false;
        }
        else
        {
            lista.add(valor);
        }
        return enLaLista;
    }
    /**
     * Vacia la lista
     */
    public void clear()
    {
        lista.clear();
    }
    /**
     *devuelve verdadero si el conjunto contiene el elemento, 
     * falso en caso contrario.
     */
    public boolean contains(int elemento)
    {
        boolean enLaLista = false;
        if(lista.contains(elemento))
        {
            enLaLista = true;
        }
        else
        {
            enLaLista = false;
        }
        return enLaLista;
       
    } 
    /**
     *Devuelve verdadero si el conjunto no contiene elementos.
     */
    public boolean isEmpty()
    {
        boolean vacio = false;
        if(lista.size()== 0)
        {
            vacio =true;
        }
        return vacio;
    }
    /**
     * elimina del conjunto el elemento dado. 
     * Si no existiera devuelve falso; si existía en el conjunto devuelve verdadero.
     */
    public boolean remove(int elemento)
    {
        boolean enLaLista = false;
        if(lista.contains(elemento))
        {
            int indice = lista.indexOf(elemento);//metodo que te selecciona el indice del elemento deseado
            lista.remove(indice);
            enLaLista = true;
        }
        else
        {
            enLaLista = false;
        }
        return enLaLista;
        
    }


}
