package eva2_11_fibonacci;

/**
 *
 * @author chino
 */
public class EVA2_11_fibonacci {

    public static void main(String[] args) {

    }
    public static int fibonacci(int valor){
        if (valor == 0) {
            return 0;
        } else if (valor == 1) {
            return 1;
        } else {
            return fibonacci(valor - 1) + fibonacci(valor - 2);
        }
    }
}
    

