/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import DrawAlgoriths.HeapSort;
import DrawAlgoriths.QuickSort;
import Utilities.Enumerators;
import Utilities.Sort;

/**
 *
 * @author juanlht
 */
public class Run {
    public static void main(String arg[]) throws InterruptedException{
        int array [] = {43456,54,78,45,98,98,345,43,3236,34,933,432,45,567,56,
                        23,34,789,32,1245,64,567,884,432,65,778,100,454,
                        234562,456,45445,890,89,98,300,200,786,56};
        
        int array2 [] = {43456,54,78,45,98,98,345,43,3236,34,933,432,45,567,56,
                        23,34,789,32,1245,64,567,884,432,65,778,100,454,
                        234562,456,45445,890,89,98,300,200,786,56};
        
        
        System.out.println("Start");
        
        
        QuickSort quick = new QuickSort(array, Enumerators.Order.UPWARD);
        HeapSort heap = new HeapSort(array2, Enumerators.Order.FALLING);
        
        Thread h = new Thread(heap);
        Thread q = new Thread(quick);
        
        h.start();
        q.start();
        
        
        
       
        
        
     
      
        
        
       
        
    }
}
