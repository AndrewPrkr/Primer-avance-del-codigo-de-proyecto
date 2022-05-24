/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avance_proyecto;

import java.util.Arrays;

/**
 *
 * @author saeol
 */
public class Avance_proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int array[]= {1,2,3};
        System.out.println(array);
    double mediaresultado, media = 0.0;
    int i;
    for( i = 0; i < array.length; i++ ){
    media = media + array[i];
} 
    mediaresultado = media/ array.length;
        System.out.println("Media:" + mediaresultado);  
        
        
// moda

//mediana
int[] arreglo = {1,2,3};
Arrays.sort(arreglo);

int mediana;
int mitad = arreglo.length / 2;
// Si la longitud es par, se deben promediar los del centro
if (arreglo.length % 2 == 0) {
    mediana = (arreglo[mitad - 1] + arreglo[mitad]) / 2;
} else {
    mediana = arreglo[mitad];
}
        System.out.println("La mediana de los datos es: " + mediana);
    }
    
}
    
