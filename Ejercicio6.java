/**
 * Importamos clase scanner del paquete java util
 */
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de la clase scanner para poder leer datos desde consola
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Declaramos arreglos para almacenar las edades de muestra
         * Las edades mayores a 25 y menores a 25
         */
        int[] edadMuestra = new int[100];
        int[] menoresEdad = new int[100];
        int[] mayoresEdad = new int[100];

        /**
         * Declaracion de variables para realizar e iterar los arreglos 
         */
        int contadorMenoresEdad=0, contadorMayoresEdad=0, sumatoriaMayoresEdad=0, sumatoriaMenoresEdad=0;
        int promedioMayoresEdad=0, promedioMenoresEdad=0;

        /**
         * Ciclo para llenar de edades aleatorias nuestro arreglo de edades
         */
        for(int i=0; i<edadMuestra.length; i++){
            edadMuestra[i] = (int)(Math.random()*122+1);
            System.out.println("Le edad de muestra "+(i+1)+" es : "+edadMuestra[i]);
        }
        /**
         * Ciclo para poder hallar y guardar en otro arreglo las edades mayores a 25
         */
        for(int i=0; i<edadMuestra.length; i++){
            if(edadMuestra[i]>=25){
                contadorMayoresEdad += 1;
                mayoresEdad[contadorMayoresEdad] = edadMuestra[i];
            }
            else if(edadMuestra[i]<25){
                contadorMenoresEdad += 1;
                menoresEdad[contadorMenoresEdad] = edadMuestra[i];
            }
        }
        /**
         * Ciclos para realizar la sumatoria de edades mayores o menores a 25
         */
        for(int i=0; i<mayoresEdad.length; i++){
            sumatoriaMayoresEdad += mayoresEdad[i];
        }
        for(int i=0; i<menoresEdad.length; i++){
            sumatoriaMenoresEdad += menoresEdad[i];
        }
         
        /**
         * Almacenamos el promedio de edades mayores y menores a 25
         * E imprimos en pantalla los resultados
         */
        promedioMayoresEdad = sumatoriaMayoresEdad/contadorMayoresEdad;
        promedioMenoresEdad = sumatoriaMenoresEdad/contadorMenoresEdad;

        System.out.println("El promedio de edades mayores a 25 años es: "+promedioMayoresEdad);
        System.out.println("El promedio de edades menores a 25 años es: "+promedioMenoresEdad);
    }
}
