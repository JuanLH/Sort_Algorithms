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
public class BinarySearch extends Sort{
    int edad;

    public BinarySearch(int[] array,int edad) {
        super(array);
        this.edad = edad;
    }

    public  int buscar() {
    int inicio = 0;
    int fin = array.length - 1;
    int pos;
    while (inicio <= fin) {
        pos = (inicio+fin) / 2;
        if ( array[pos] == edad )
            return pos;
        else if ( array[pos] < edad ) {
            inicio = pos+1;
        }
        else {
            fin = pos-1;
        }
    }
    return -1;
    }
    
    @Override
    public void OrganizeArray() {
        buscar();
    }

    @Override
    public void run() {
        OrganizeArray();
    }
    
}
