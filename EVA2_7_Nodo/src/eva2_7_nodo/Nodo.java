package eva2_7_nodo;

public class Nodo<T> {
    //DOS ATRIBUTOS
    private T Valor;
    private Nodo Siguiente ;
    private Nodo previo;
    //CONSTRUCTORES
    public Nodo() {
        Siguiente = null; // ESTO ES MUY IMPORTANTE MARCA EL FINAL DE LA LISTA
    }
    public Nodo(T Valor) {//PONER EL VALOR A GUARDAR AL MOMENTO DE CREAR EL NODO
        this.Valor = Valor;
        Siguiente = null;
        previo = null;
    }
    //get y set 
    public T getValor() {
        return Valor;
    }
    public void setValor(T Valor) {
        this.Valor = Valor;
    }
    public Nodo getSiguiente() {
        return Siguiente;
    }
    public void setSiguiente(Nodo Siguiente) {
        this.Siguiente = Siguiente;
    }
    public Nodo getPrevio() {
        return previo;
    }
    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }   
}