/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import DrawAlgoriths.HeapSort;
import DrawAlgoriths.QuickSort;
import Utilities.Enumerators;
import Utilities.ArraysData;

/**
 *
 * @author juanlht
 */
public class Run {
    public static void main(String arg[]) throws InterruptedException{
       
        
        long initialtime,finaltime,resultado;
        
        
         /*------------------Running secuential--------------------------------*/
         //Saving initial time for process 
        initialtime = System.currentTimeMillis();
        
            HeapSort heap = new HeapSort(ArraysData.array1, Enumerators.Order.ASCENDING);
            QuickSort quick = new QuickSort(ArraysData.array1, Enumerators.Order.ASCENDING);
            HeapSort heap2 = new HeapSort(ArraysData.array1, Enumerators.Order.ASCENDING);
            QuickSort quick2 = new QuickSort(ArraysData.array1, Enumerators.Order.ASCENDING);
        
            heap.OrganizeArray();
            quick.OrganizeArray();
            heap2.OrganizeArray();
            quick2.OrganizeArray();
        //SAving the final time for the process
        finaltime = System.currentTimeMillis();
        //Get the difefence time
        resultado = finaltime-initialtime;
        prn("Result = "+resultado+" millis seconds");
        
      /*------------------Running by Threats--------------------------------*/
      initialtime = System.currentTimeMillis();
        
            HeapSort P_heap = new HeapSort(ArraysData.array1, Enumerators.Order.ASCENDING);
            QuickSort P_quick = new QuickSort(ArraysData.array1, Enumerators.Order.ASCENDING);
            HeapSort P_heap2 = new HeapSort(ArraysData.array1, Enumerators.Order.ASCENDING);
            QuickSort P_quick2 = new QuickSort(ArraysData.array1, Enumerators.Order.ASCENDING);

            /* Implementing Threds whith constructor Thread (Runnable class);  */
            Thread h = new Thread(P_heap);
            Thread q = new Thread(P_quick);
            Thread h2 = new Thread(P_heap2);
            Thread q2 = new Thread(P_quick2);

            /*Starting Threads*/
            h.start();
            q.start();
            h2.start();
            q2.start();
        
        finaltime = System.currentTimeMillis();
        resultado = finaltime-initialtime;
        prn("Threads Result = "+resultado+" millis seconds");    
    }
    
    private static void prn(String text){
        System.out.println(text);
    }
    
}
