
package eve2_1_referencias;

/**
 *
 * @author bisonte
 */
public class EVE2_1_REFERENCIAS {

    public static void main(String[] args) {
        Ejemplo inicio = new Ejemplo();
        inicio.valor = 100;
        System.out.println("inicio = " + inicio);
        System.out.println("inicio.valor = "+ inicio.valor);
        System.out.println("inicio otro = "+ inicio.otro);
        //CREAR LISTA 
        inicio.otro = new Ejemplo();
        inicio.otro.valor = 200; //segundo objeto
        inicio.otro.otro = new Ejemplo();
        inicio.otro.otro.valor = 300;
        inicio.otro.otro.otro = new Ejemplo();
        inicio.otro.otro.otro.valor = 400;
        
        Ejemplo sig = inicio;
        while(sig != null){
        System.out.print("[" + sig.valor + "]");
        sig = sig.otro;
    }
}
}
class Ejemplo{
    int valor;
    Ejemplo otro;
}
