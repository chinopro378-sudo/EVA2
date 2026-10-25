
package eva2_7_nodo;

/**
 *
 * @author chino
 */
public class ListaGrafo<T> {

  private Nodo inicio;
    private Nodo fin;
    public int longitud ;
    
    public int longitud(){
        Nodo temp = inicio;
        int cont = 0;
        while (temp != null) {
            cont++;
            temp = temp.getSiguiente();
        }
        return cont;
    }
    public int longitud2(){
       return this.longitud();
    }
    public boolean listaVacia(){
         if (inicio == null){ 
            return true;
         }else 
            return false;
        }
     public void agregar(int valor){
        Nodo nuevo = new Nodo(valor);
        if (inicio == null){ 
            inicio = nuevo;
            fin = nuevo;
        } else{
            fin.setSiguiente(nuevo);
            nuevo.setPrevio(fin);
            fin = nuevo;
        }
    }
     public void vaciarLista(){
        inicio = null;
        fin = null;
    }

}
