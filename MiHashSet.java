
/**
 * Write a description of class MiHashSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashSet
{
    private ArrayListInt lista;

    /**
     * Constructor for objects of class MiHashSet
     */
    public MiHashSet()
    {
        lista = new ArrayListInt();
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
            int indice = lista.indexOf(elemento);//metodo que te selecciona el indice del elemento 
            //deseado
            lista.remove(indice);
            enLaLista = true;
        }
        else
        {
            enLaLista = false;
        }
        return enLaLista;

    }

    /**
     * Devuelve el numero de elementos de la lista
     */
    public int size()
    {
        return lista.size();
    }

    /**
     * devuelve una cadena conteniendo todos los elementos del conjunto separados por comas 
     * y entre corchetes.
     */
    public String toString()
    {
        String cadena = "[";
        int index = 0;
        while(size() > index)
        {
            if(index == 0)
            {
                cadena = cadena + lista.get(index);
            }
            else
            {
                cadena = cadena + ", " + lista.get(index);
            }
            index++;
        }

        cadena = cadena + "]";
        return cadena;
    }

    /**
     *  devuelve verdadero si el parámetro es igual al conjunto sobre el que se invoca 
     *  y falso en otro caso.
     */
    public boolean equals(MiHashSet otroConjunto)
    {
        boolean iguales = true;
        if(size() == otroConjunto.size() )
        {
            int index = 0;
            while( index < size() && (iguales) )
            {
                if (!otroConjunto.contains(lista.get(index)))
                {
                    iguales = false;
                }
                index++;
            }
        }
        else
        {
            iguales = false;
        }
        return iguales;
    }
}
