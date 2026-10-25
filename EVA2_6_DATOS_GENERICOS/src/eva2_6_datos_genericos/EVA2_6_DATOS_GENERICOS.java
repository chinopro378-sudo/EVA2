
package eva2_6_datos_genericos;

/**
 *
 * @author chino
 */
public class EVA2_6_DATOS_GENERICOS {


    public static void main(String[] args) {
        // Aquí instanciamos la clase genérica pasándole el tipo de dato entre los diamantes <>
        Ejemplo<Listadoble> prueba = new Ejemplo<Listadoble>();
        System.out.println("¡Clase genérica creada y ejecutada correctamente!");
    }
}
class Listadoble {}

class Ejemplo<T> {
    private T dato; // Este atributo ahora es del tipo genérico T

    // Constructor vacío
    public Ejemplo() {
    }

    // Método Getter genérico
    public T getDato() {
        return dato;
    }

    // Método Setter genérico
    public void setDato(T dato) {
        this.dato = dato;
    }
}