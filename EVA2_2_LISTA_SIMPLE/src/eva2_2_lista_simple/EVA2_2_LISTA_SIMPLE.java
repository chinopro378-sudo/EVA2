package eva2_2_lista_simple;

public class EVA2_2_LISTA_SIMPLE {
  
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        int [] arreglo = new int[1000000];
        
        long ini,fin,tiempo;
        
        ini = System.nanoTime();
        for (int i = 0 ; i < 1000000; i++){
        lista.agregar((int)(Math.random()*100));
    }
        fin = System.nanoTime();
        tiempo = fin - ini;
        System.out.println("Tiempo lista = " + tiempo );
        System.out.println("Tamaño de la lista: " + lista.longitud());
    }
    
}
