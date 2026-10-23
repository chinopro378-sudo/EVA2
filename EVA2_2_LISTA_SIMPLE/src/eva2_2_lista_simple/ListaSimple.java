
package eva2_2_lista_simple;

public class ListaSimple {
        private Nodo inicio;
        private Nodo fin;
        public ListaSimple(){
            inicio = null; //al crear la lista, se crea vacia
        } 
        
        
        //SIEMPRE SE AGREGA AL FINAL DE LA LISTA
    public void agregar(int valor){
            Nodo nuevo = new Nodo(valor);//creo el nodo para el valor a insertar
            // Y LUEGO
            if(inicio == null){//LISTA VACIA VERDADERO
                inicio = nuevo;//nuevo
                fin = nuevo;
        }else{Nodo temp = inicio;
        while(temp.getSiguiente() != null){
        temp = temp.getSiguiente();
                }
            temp.setSiguiente(nuevo);//conecto nuevo al final de la lista
            }
    }
    public void imprimir(){
        Nodo temp = inicio; //esto es lo que marca el inicio 
        while(temp != null){ // esto es lo que hace que el ciclo no pare asta que el valor sea null
        System.out.print("[" + temp.getValor() + "]"); // esto imprime el valor actual 
        temp = temp.getSiguiente();// esto es lo que hace el cambio al siguiente valor 
            
    }}
        
    //imprimir en orden inverso tengo que lograr que emepzemos por el ultimo pero si inicio en fin no puedo regresar
    //o ir al orden inverso entonces tengo que lograr.... creo que tengo que alterar el orden primero y luego de esto
    //ya despues imprimo igual que antes el priblema es como 
    public void ImprimirInverso() {
        imprimirInversoRec(inicio);
        System.out.println(); // Salto de línea al terminar
    }

    private void imprimirInversoRec(Nodo temp) {
        if (temp == null) {
            return; 
        }
        imprimirInversoRec(temp.getSiguiente());
        System.out.print("[" + temp.getValor() + "]");
    }
        
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
        //validar posicion tenga un valor valido
        //o(N)
        //throw
    
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
     //regresar la primera aparicion del valor de la lista 
    //regresar la posicion 
    //O
    public int encontrarValor(int valor) {
    Nodo temp = inicio; 
    int posicion = 0;
    while (temp != null) {
        if (temp.getValor() == valor) {
            return posicion; 
        }
        temp = temp.getSiguiente();
        posicion++;
    }   
    System.out.println("Valor " + valor + " no encontrado en la lista"); 
    return -1; }
    
    public void insertarEn(int posicion, int valor) {

        if (posicion < 0 || posicion > longitud()) {
            throw new IndexOutOfBoundsException("Posición inválida para insertar: " + posicion);
        }

        if (posicion == 0) {
            Nodo nuevo = new Nodo(valor);
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            if (fin == null) { 
                fin = nuevo;
            }
        } 

        else if (posicion == longitud()) {
            agregar(valor); 
        } 

        else {
            Nodo nuevo = new Nodo(valor);
            Nodo temp = inicio;
            
            for (int i = 0; i < posicion - 1; i++) {
                temp = temp.getSiguiente();
            }
            nuevo.setSiguiente(temp.getSiguiente());
            temp.setSiguiente(nuevo);
        }
    }
   
 
    public void borrarEn(int posicion) {
        if (listaVacia() || posicion < 0 || posicion >= longitud()) {
            System.out.println("Posición inválida o fuera de rango.");
            return;
        }
        if (posicion == 0) {
            inicio = inicio.getSiguiente();
            if (inicio == null) {
                fin = null;
            }
        } 
        else {
            Nodo temp = inicio;
            for (int i = 0; i < posicion - 1; i++) {
                temp = temp.getSiguiente();
            }
            
            Nodo aBorrar = temp.getSiguiente();
            temp.setSiguiente(aBorrar.getSiguiente());
           
            if (temp.getSiguiente() == null) {
                fin = temp;
            }
        }
    }}