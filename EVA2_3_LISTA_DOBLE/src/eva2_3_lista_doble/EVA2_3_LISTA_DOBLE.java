
package eva2_3_lista_doble;

public class EVA2_3_LISTA_DOBLE {

    public static void main(String[] args) {
        Listadoble lista = new Listadoble();
        lista.agregar(30);
        lista.agregar(20);
        lista.agregar(30);
        lista.agregar(40);
        
        System.out.print("Lista original: ");
        lista.imprimir(); // [10][20][30][40]
        
        // Borramos el elemento en la posición 2 (que es el valor 30)
        lista.borrarEn(2);
        
        System.out.print("Después de borrar la posición 2: ");
        lista.imprimir(); // [10][20][40]
        
        System.out.println("Longitud actual: " + lista.longitud());
    }
}
