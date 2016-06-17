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
 */
public class BubbleSort extends Sort{

    public BubbleSort(int[] array) {
        super(array);
    }
    
    public void BubbleSort( int [ ] array )
    {
        int j;
        boolean flag = true;   // set flag to true to begin first pass
        int temp;   //holding variable

        while ( flag )
        {
               flag= false;    //set flag to false awaiting a possible swap
               for( j=0;  j < array.length -1;  j++ )
               {
                    if ( array[ j ] < array[j+1] )   // change to > for ascending sort
                    {    
                        Swap(j,j+1);
                        flag = true;     
                        //shows a swap occurred
                    }
               }
         }
    }


    @Override
    public void OrganizeArray() {
        BubbleSort(array);
    }

    @Override
    public void run() {
        OrganizeArray();
        System.out.print("BubbleSort !!");
    }
    
}
