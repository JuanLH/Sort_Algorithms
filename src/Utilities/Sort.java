/*

 */
package Utilities;

import Utilities.Enumerators.Order;

/**
 * @author JuanLH
 * @Description: this is not a completely abstract class but has 
 * unimplemented methods, which is the OrganizeArray (), 
 * This class is made for the purpose of being inherited.
 * 
 * @Runable is an interface for implement Threads
 */



public abstract  class  Sort implements Runnable{
    
    protected  int array[];
    
    
   //Constructor method 
    public Sort(int[] array) {
        this.array = array;//put the array here
        
    }
    
    //This method is capable of printing the array
    public void PrintArray(){
        for(int x=0 ; x<=array.length-1; x++){
            if(x==0)
                System.out.print("[");
            if(x<array.length-1)
                System.out.print(array[x]+",");
            else
                System.out.println(array[x]+"]");
                
        }
    }
    
    //This method swap/exchanges 2 elements in the array
    public void Swap(int posA,int posB){
        int temp = array[posA];
        array[posA]=array[posB];
        array[posB]=temp;
    }
    
    //Implement this method to sort the array
    public abstract void  OrganizeArray(); 
    
    
}
