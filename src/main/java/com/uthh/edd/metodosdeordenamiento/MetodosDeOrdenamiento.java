/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uthh.edd.metodosdeordenamiento;

import java.util.Arrays;

/**
 *
 * @author Chris
 */
public class MetodosDeOrdenamiento {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int[] arregloDesordenado = {64, 34, 25, 12, 22, 11, 90};
        int[] arregloOrdenado = {11, 12, 22, 25, 34, 64, 90};
        
        System.out.println("Burbuja Normal");
        System.out.println("Inicial: " + Arrays.toString(arregloDesordenado));
        System.out.println("Inicial: " + Arrays.toString(arregloOrdenado));

        ordenamientoBurbuja(arregloDesordenado);
        ordenamientoBurbuja(arregloOrdenado);

        System.out.println("Final: " + Arrays.toString(arregloDesordenado));
        System.out.println("Final: " + Arrays.toString(arregloOrdenado));

        System.out.println("\nBurbuja Mejorado");
        System.out.println("Inicial: " + Arrays.toString(arregloDesordenado));
        System.out.println("Inicial: " + Arrays.toString(arregloOrdenado));

        ordenamientoBurbujaMejorado(arregloDesordenado);
        ordenamientoBurbujaMejorado(arregloOrdenado);

        System.out.println("Final: " + Arrays.toString(arregloDesordenado));
        System.out.println("Final: " + Arrays.toString(arregloOrdenado));
        
        
        /*Aqui en mi punto de vista, la diferencia entre un metodo burbuja tradicional y uno mejorado es que 
        el tradicional vuelve a dar vueltas verificando que los numeros se comparen aun si estan ordenados; 
        Mientras el mejorado verifica que si los numeros ya estan ordenado, no es necesario dar vueltas para asi 
        ahorrar mas tiempo*/
    }
    
    //metodo burbuja normal
    public static void ordenamientoBurbuja(int[] arreglo){
        
        //variable que guardara el valor de un arreglo
        int auxiliar;
        //las pasadas que va hacer un arreglo
        for(int i = 0; i < arreglo.length -1; i++){
            
            //van a entrar en cada elemento para hacer su evualuacion de numeros mayores
            for(int j = 0; j < arreglo.length - 1 - i; j++){
                
                if(arreglo[j] > arreglo[j+1]){
                    auxiliar = arreglo[j+1]; //guarda temporalmente el valor del numero de enfrente
                    arreglo[j+1] = arreglo[j]; //pasa el valor en el que esta al que esta enfrente
                    arreglo[j] = auxiliar; //y el valor vecino, pasa al lugar del valor anterior
                    
                }
                
            }
        }
    
    }
    
    //metodo burbuja mejorado
    public static void ordenamientoBurbujaMejorado(int[] arreglo){
    
        int auxiliar;
        boolean huboCambio;
        //las pasadas que va hacer un arreglo
        for(int i = 0; i < arreglo.length -1; i++){
            
            huboCambio = false;
            //van a entrar en cada elemento para hacer su evualuacion de numeros mayores
            for(int j = 0; j < arreglo.length - 1 - i; j++){
                
                if(arreglo[j] > arreglo[j+1]){
                    auxiliar = arreglo[j+1]; //guarda temporalmente el valor del numero de enfrente
                    arreglo[j+1] = arreglo[j]; //pasa el valor en el que esta al que esta enfrente
                    arreglo[j] = auxiliar; //y el valor vecino, pasa al lugar del valor anterior  
                    
                    huboCambio=true; //si en la condicional se detecta cambios, indica que el boleano pasa a verdadero
                }
            }
            //indica que si no hubo cambios, no es necesario volver hacer una pasada mas 
            if(huboCambio == false){ 
                break;
            }
        }
    
    }
    
}
