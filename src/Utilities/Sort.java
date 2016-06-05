/*

 */
package Utilities;

import Utilities.Enumerators.Order;

/**
 * @author JuanLH
 */



public abstract  class  Sort implements Runnable{
    
    protected  int array[];
    private Order orden;
    
   
    public Sort(int[] array,Order orden) {
        this.array = array;
        this.orden = orden;
        
    }

    public Order getOrden() {
        return orden;
    }

    public int[] getArray() {
        return array;
    }
    
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
    
    public void Swap(int posA,int posB){
        int temp = array[posA];
        array[posA]=array[posB];
        array[posB]=temp;
    }

    public abstract void  OrganizeArray(); //Organize array in order 
    
    
}
