/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrawAlgoriths;

import Utilities.Enumerators;
import Utilities.Sort;



/**
 *
 * @author juanlht
 * @Description This class extends sort which implements Runnable and must
 * implement the method run
 */
public class QuickSort extends Sort{

    public QuickSort(int[] array) {
        super(array);
        
    }
    
    public void recursiveQuickSort(int left,int right){
       
        int pivot = array[left];//take the first element as pivot
        int i = left;
        int j= right;
        
        while(i<j){
            
            while(array[i]<= pivot && i<j)
                i++;
            while(array[j]>pivot && j>0)
                j--;
            
            
                if(i<j){
                    super.Swap(i, j);
                }  
        }
        
        super.Swap(left, j);//Swap pivot with array[j] element
        //array[left]=rray[j];
        //array[j]=pivot;
        
        if(left<j-1){
            recursiveQuickSort(left, j-1);// Sort the left subarray
        }
        if(j+1 < right){
            recursiveQuickSort(j+1, right);// Sort the right subarray
        }
        if(left==j-1 && right==j+1){
            
        }
        
        
    }
    
    /*Sort class' Method implemented*/
    @Override
    public void OrganizeArray() {
        recursiveQuickSort(0, array.length-1);
    }
    /*Runnable Class' method implemented*/
    @Override
    public void run() {
       
        OrganizeArray();
        System.out.print("QuickSort !!");
        
        
    }
    
}
