
package eva2_3_lista_doble;


public class Listadoble {
    private Nodo inicio;
    private Nodo fin;
    private int tama;

    public Listadoble() {
        this.inicio = null;
        this.fin = null;
        this.tama = 0;
    }
    
    
    //O(N)
    // O(N)
    public void imprimirInv() {
        Nodo temp = fin;
        while (temp != null) {
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getPrevio();
        }
        System.out.println();
    }
    
    
     public void imprimir(){
        Nodo temp = inicio; //esto es lo que marca el inicio 
        while(temp != null){ // esto es lo que hace que el ciclo no pare asta que el valor sea null
        System.out.print("[" + temp.getValor() + "]"); // esto imprime el valor actual 
        temp = temp.getSiguiente();// esto es lo que hace el cambio al siguiente valor 
        }}
      public int longitud(){
        Nodo temp = inicio;
        int cont = 0;
        while (temp != null) {
            cont++;
            temp = temp.getSiguiente();
        }
        return cont;
    }
      public boolean listaVacia(){
         if (inicio == null){ 
            return true;
         }else 
            return false;

        }
       public void vaciarLista(){
        inicio = null;
        fin = null;
    }
      
     public void agregar(int valor){
            Nodo nuevo = new Nodo(valor);//creo el nodo para el valor a insertar
            // Y LUEGO
            if(inicio == null){//LISTA VACIA VERDADERO
                inicio = nuevo;//nuevo
                fin = nuevo;
        }else{Nodo temp = inicio;
                    fin.setSiguiente(nuevo);
            temp.setSiguiente(nuevo);//conecto nuevo al final de la lista
            fin = nuevo; // El nuevo nodo pasa a ser el fin
        }
        tama++;
   }
           
     public void insertarEn(int posicion, int valor) {

        if (posicion < 0 || posicion > tama) {
            System.out.println("Posición inválida.");
            return;
        }
        if (posicion == 0) {
            Nodo nuevo = new Nodo(valor);
            if (listaVacia()) {
                inicio = nuevo;
                fin = nuevo;
            } else {
                nuevo.setSiguiente(inicio);
                inicio.setPrevio(nuevo);
                inicio = nuevo;
            }
        } 
        else if (posicion == tama) {
            agregar(valor); 
            return; 
        } 
        else {
            Nodo nuevo = new Nodo(valor);
            Nodo temp = inicio;
            
            for (int i = 0; i < posicion; i++) {
                temp = temp.getSiguiente();
            }
            
            Nodo anterior = temp.getPrevio();
            
            nuevo.setSiguiente(temp);
            nuevo.setPrevio(anterior);
            
            anterior.setSiguiente(nuevo);
            temp.setPrevio(nuevo);
        }
        
        tama++; 
    }
     
     
     public void borrarEn(int posicion) {

        if (listaVacia() || posicion < 0 || posicion >= tama) {
            System.out.println("Posición inválida o lista vacía.");
            return;
        }

        if (posicion == 0) {
            inicio = inicio.getSiguiente();
            if (inicio != null) {
                inicio.setPrevio(null); 
            } else {
                fin = null;
            }
        } 

        else if (posicion == tama - 1) {
            fin = fin.getPrevio();
            if (fin != null) {
                fin.setSiguiente(null); 
            } else {
                inicio = null;
            }
        } 
 
        else {
            Nodo temp = inicio;
         
            for (int i = 0; i < posicion; i++) {
                temp = temp.getSiguiente();
            }
            
            Nodo anterior = temp.getPrevio();
            Nodo siguiente = temp.getSiguiente();
            
            anterior.setSiguiente(siguiente);
            siguiente.setPrevio(anterior);
        }
        
        tama--; 
    }
     
     
     
     
     
     
     
     
     
          //segun yo debe de ser como tipo al romper el ciclo y llegar asta donde es 
          //ya solo reconectamos como tipo temp.sisguiente.previo = temp
          //creo que etsoy haciendo algo mal por que no necesito un nodo que concetar osea me refiero
          //solo estoy haciendo un metodo abstracto ni tengo para ingresar un valor que quiero 
          //que valla entre ambos osea no tengo ni un Scanner para leer valores o poner valores en algo 
          //creo que por esto es tan confuso osea mas bien es tipo solo estoy haciendo metodos para luego usar en mi 
          //main
      
            
            // nota metiomos borrar en y insertar en pero los modificamos para que funcionen en las listas dobles 
              
}
