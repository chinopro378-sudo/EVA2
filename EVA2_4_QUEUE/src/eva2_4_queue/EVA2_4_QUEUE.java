
package eva2_4_queue;

public class EVA2_4_QUEUE {


   
   public class MYQUEUE{
       private Nodo inicio;
       private Nodo fin;
       private int tama;
       
   
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
    public int valorEn(int posicion ) {
        //excepcion
        //VALIDAR posicion
        //1 que posicion son validas de 0 (cero) a N-1(N es la cantidad de nodos)
        posicion = posicion - 1; 
        if (posicion < -1 || posicion >= longitud()) {
            throw new IndexOutOfBoundsException("Posición inválida: " + (posicion + 1));
        }
        Nodo temp = inicio;
        for (int i = -1; i < posicion; i++) {
            temp = temp.getSiguiente();
        }
        return temp.getValor();
    }
     
    
     
      //AGREGA UN VALOR AL FINAL DE LA LISTA 
   public void push(int valor){
       agregar(valor);
   }
   //LEER EL VALOR DIRECTAMENTE ACCESIBLE 
   public int peek(){
      return valorEn(0);
   }
   //
   public int pop(){
       int valorTemporal = valorEn(0); 
        borrarEn(0);                  
        return valorTemporal;            
   

   } 
   }}
