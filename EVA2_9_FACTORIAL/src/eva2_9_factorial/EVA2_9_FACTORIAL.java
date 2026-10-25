package eva2_9_factorial;

/**
 *
 * @author chino
 */
public class EVA2_9_FACTORIAL {

    
    public static void main(String[] args) {
        System.out.println("factorial de 5 ="  );
        System.out.println("factorial de recur (5)" + factorialrecu(5) );
    }
      public static int factorialrecu(int valor) {
    int resu = 1;
    for (int i = 1; i <= valor ; i++){
            resu *=i;
    }
    return resu;
    }
    public static int imprimirRecu(int numero) {
    if (numero == 0 ){
        return 1 ;
    }else {
        return numero * imprimirRecu(numero -1);
    }
}
}

