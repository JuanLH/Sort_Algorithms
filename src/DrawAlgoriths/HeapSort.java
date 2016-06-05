/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrawAlgoriths;

import Utilities.Enumerators;
import Utilities.Sort;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juanlht
 */
public class HeapSort extends Sort {

    int N;
    
    public HeapSort(int[] array, Enumerators.Order orden) {
        super(array, orden);
    }
    
    private void sort(){
        heapify();
        for(int i = N; i > 0 ;i--){
            super.Swap(0, i);
            N=N-1;
            maxHeap(0);
        }
        
    }
    
    private void heapify(){
        N=array.length-1;
        for(int i = N/2;i >= 0;i--){
            maxHeap(i);
        }
    }
    
    private void maxHeap(int i){
        
        int left = 2*i;
        int right = 2*i + 1;
        int max = i;
        if (left <= N && array[left] > array[i])
            max = left;

        if (right <= N && array[right] > array[max]) 
            max = right;
        
        if(max != i){
            super.Swap(i, max);
            maxHeap(max);
        }
    }

    @Override
    public void OrganizeArray() {
        sort();
    }

    @Override
    public void run() {
        
        OrganizeArray();
        System.out.println("!!! HeapSort");
       
        
    }
    
}
