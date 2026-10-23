package eva2_4_queue;

public class Nodo {
    //DOS ATRIBUTOS
    private int Valor;
    private Nodo Siguiente ;
    private Nodo previo;
    //CONSTRUCTORES
    public Nodo() {
        Siguiente = null; // ESTO ES MUY IMPORTANTE MARCA EL FINAL DE LA LISTA
    }
    public Nodo(int Valor) {//PONER EL VALOR A GUARDAR AL MOMENTO DE CREAR EL NODO
        this.Valor = Valor;
        Siguiente = null;
        previo = null;
    }
    //get y set 
    public int getValor() {
        return Valor;
    }
    public void setValor(int Valor) {
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