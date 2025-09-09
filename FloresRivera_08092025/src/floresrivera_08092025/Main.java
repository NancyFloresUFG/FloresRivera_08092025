/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package floresrivera_08092025;
import java.util.Scanner;
/*
Nancy Beatriz Flores Rivera - FR100524
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Tamaño dela rreglo
        int cantidad_elementos = 5;
        //Instancia de números desordenados
        int [] numeros_desordenados = new int [cantidad_elementos];
        //Instancia de números ordenados
        int [] numeros_ordenados = new int [cantidad_elementos];
        //Creación del objeto scanner
        Scanner sc = new Scanner (System.in);
        //Notificación al usuario
        System.out.println("Por favor, ingrese: " + cantidad_elementos + " numeros enteros de manera desordenada.");
        //Se recorre el arreglo para números desordenados
        for (int i = 0; i < numeros_desordenados.length; i++){
            //Se solicita al usuario que ingrese un valor
            System.out.print("Digite el elemento " + (i + 1) + " : ");
            //Se digita valor de tipo entero
            numeros_desordenados [i] = sc.nextInt();
        }
        //Se imprime una salida para mostrar lo que ha digitado
        System.out.println("Usted digito los siguientes numeros: ");
        //Se recorre el arreglo de valores digitados
        for (int j = 0; j < numeros_desordenados.length; j++){
            //Se imprimen los números digitados por el usuario almacenados en el arreglo de números desordenados
            System.out.print(numeros_desordenados[j]+" ");
        }
        //Salto de línea
        System.out.println();
        //Invocamos la función para ordenar el arreglo
        numeros_ordenados = ordenar(numeros_desordenados);
        //Salida al usuario
        System.out.println("Los numeros ordenados son: ");
        //Se recorre el arreglo para obtener cada valor ordenado
        for(int k = 0; k< numeros_ordenados.length; k++){
            //Se imprime cada elemento
            System.out.print       (numeros_ordenados [k] + " ");
        }
        
    }
    //Función para ordenar un arreglo unidimensional
    public static int [] ordenar ( int [] arreglo ){
        //Se recorre el arreglo para evaluar cada posición
        for(int i = 0 ; i < arreglo.length - 1 ; i++){
            //Se yhcae un segundo recorrido para comparar la posición actual con la siguiente
            for(int j = 0 ; j < arreglo.length - 1 ; j++){
               // Se evalúa el valor de cada elemento
                if(arreglo[j] > arreglo[j+1]){
                    //Si es mayor se crea una variable para almacenar el valor del elemento mayor
                    int mayor = arreglo[j];
                    //Se cambia la posición actual
                    arreglo[j] = arreglo[j+1];
                    //Se intercambia la posición del siguiente elemento asignando el valor mayor
                    arreglo[j+1] = mayor;
                    
                }
            }
        }
        
        return arreglo;
    }
    
}
