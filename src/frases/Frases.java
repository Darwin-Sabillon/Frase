package frases;

import java.util.Scanner;

public class Frases {

    public static void main(String[] args) {
        
        Scanner r = new Scanner(System.in);
        String frase;
        char[] fraseArreglo;
        int contadorCaracter = 0;
        
        System.out.println("Escriba una frase: ");
        frase = r.nextLine();
        
        fraseArreglo = frase.toCharArray();
        
        for (int i = 0; i < fraseArreglo.length; i++) {
            for (int j = 0; j < fraseArreglo.length; j++) {
                if (fraseArreglo[j] == fraseArreglo[i]) {
                    contadorCaracter++;
                }
            }
            System.out.println("Caracter " + fraseArreglo[i] + " - Total: " + contadorCaracter);
            contadorCaracter = 0;
        }
        
    }
    
}
