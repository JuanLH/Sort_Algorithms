/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import DrawAlgoriths.BinarySearch;
import DrawAlgoriths.BubbleSort;
import DrawAlgoriths.HeapSort;
import DrawAlgoriths.InsertSort;
import DrawAlgoriths.QuickSort;
import Utilities.Enumerators;
import Utilities.ArraysData;
import Utilities.Sort;

/**
 *
 * @author juanlht
 */
public class Run {
    public static void main(String arg[]) throws InterruptedException{
       
        
        long initialtime,finaltime,resultado;
        
        prn("Start");
         /*------------------Running secuential--------------------------------*/
         //Saving initial time for process 
        //PrintArray(ArraysData.arrayS);
        initialtime = System.currentTimeMillis();
        
            HeapSort heap = new HeapSort(ArraysData.array1);
            QuickSort quick = new QuickSort(ArraysData.array1);
            BubbleSort bubble = new BubbleSort(ArraysData.array1);
            InsertSort insert = new InsertSort(ArraysData.array1);
            BinarySearch binary = new BinarySearch(ArraysData.array1,200);
        
            /*heap.OrganizeArray();
            quick.OrganizeArray();
            bubble.OrganizeArray();
            insert.OrganizeArray();
            binary.OrganizeArray();*/
            
            checkTime(insert);
            quick.PrintArray();
            checkTime(heap);
            checkTime(bubble);
            checkTime(quick);
            checkTime(binary);
            
            
        //SAving the final time for the process
        finaltime = System.currentTimeMillis();
        //Get the difefence time
        resultado = finaltime-initialtime;
        prn("Result = "+resultado+" millis seconds");
        
        /*heap.PrintArray();
        quick.PrintArray();
        bubble.PrintArray();
        insert.PrintArray();*/
        
      /*------------------Running by Threats--------------------------------*/
      prn("-----------------------------------------");
      initialtime = System.currentTimeMillis();
            //PrintArray(ArraysData.arrayS2);
            HeapSort P_heap = new HeapSort(ArraysData.array1);
            QuickSort P_quick = new QuickSort(ArraysData.array1);
            BubbleSort P_bubble = new BubbleSort(ArraysData.array1);
            InsertSort P_insert = new InsertSort(ArraysData.array1);
             BinarySearch P_binary = new BinarySearch(ArraysData.array1,200);

            /* Implementing Threds whith constructor Thread (Runnable class);  */
            Thread h = new Thread(P_heap);
            Thread q = new Thread(P_quick);
            Thread b = new Thread(P_bubble);
            Thread ins = new Thread(P_insert);
            Thread bin = new Thread(P_binary);
            

            /*Starting Threads*/
            h.start();
            q.start();
            ins.start();
            b.start();
            bin.start();
        
        finaltime = System.currentTimeMillis();
        resultado = finaltime-initialtime;
        prn("Threads Result = "+resultado+" millis seconds");
        prn("End");
        /*P_quick.PrintArray();
        P_bubble.PrintArray();
        P_insert.PrintArray();
        P_heap.PrintArray();*/
        
        
    }
    
    private static void prn(String text){
        System.out.println(text);
    }
    
    public static void PrintArray(int[] array){
        for(int x=0 ; x<=array.length-1; x++){
            if(x==0)
                System.out.print("[");
            if(x<array.length-1)
                System.out.print(array[x]+",");
            else
                System.out.println(array[x]+"]");
                
        }
    }
    
    public static void checkTime(Sort objeto) throws InterruptedException{
        long initialtime = System.currentTimeMillis();
        objeto.OrganizeArray();
        long finaltime = System.currentTimeMillis();
        long resultado = finaltime - initialtime;
        prn(Long.toString(resultado)+" "+objeto.getClass());
    }
    
}
