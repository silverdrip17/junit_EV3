import java.security.PublicKey;
import java.util.Arrays;

public class Cadena {
	public Cadena() {}
    public int longitud(String cadena) {
        return cadena.length();
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public int vocales(String cadena) {
        char vocales[] = {'a','e','i','o','u'};
        char[] letras = cadena.toCharArray();
        int suma = 0;
        for(int i = 0;i<cadena.length();i++) {
            //if (Arrays.asList(vocales).contains(letras[i])){
            //    suma++;
            //}
            char letra = cadena.charAt(i);
            if (letra == 'a' | letra == 'e' | letra == 'i' | letra == 'o' | letra == 'u' ) {
                suma ++;
            }
        }
        return suma;



    }

    public String invertir(String cadena) {
        String invertido = reverse(cadena);
        return invertido;
    }

    public int contarLetra(String cadena, char caracter) {
        char[] letras = cadena.toCharArray();
        int suma = 0;
        for(int i = 0; i<cadena.length();i++) {
            if(letras[i] == caracter) {
                suma++;
            }
        }
        return suma;
    }
}
