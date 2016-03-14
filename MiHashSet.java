import java.util.ArrayList;
/**
 * Write a description of class MiHashSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashSet
{
    
    // lista de enteros
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


}
