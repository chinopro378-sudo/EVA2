
package eva2_5_stack;


public class Nodo {
        private Nodo siguiente;
        private Nodo anterior;
         private int valor; 
        public Nodo(){
            this.siguiente = null;
            this.anterior = null;
        }
        public Nodo(int valor){
            this.valor = valor;
            this.siguiente = null;
            this.anterior = null;
        }
        public int getValor() {
            return valor;
        }
        public void setValor(int valor) {
            this.valor = valor;
        }
        public Nodo getSiguiente() {
            return siguiente;
        }
        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }
        public Nodo getAnterior() {
            return anterior;
        }
        public void setAnterior(Nodo anterior) {
            this.anterior = anterior;
        }
    }


    
