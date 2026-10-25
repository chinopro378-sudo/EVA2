package eva2_10_mcd;

public class EVA2_10_MCD {

    public static void main(String[] args) {
    }
   public static int MCD(int valor1, int valor2){
        if (valor2 == 0) {
            return valor1;
        } else {
            int resu = valor1 / valor2;
            return MCD(valor2, valor1 - (valor2 * resu)); 
        }
    }
}
