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
public class InsertSort extends Sort {

    public InsertSort(int[] array) {
        super(array);
    }
    
    public void insertionSort(int array[]){
		
		int n=array.length; //n toma la longitud del array
		int j, i, temp;
		
		for(j=1;j<n;j++){
			/*La variable temp toma la pocision de j
			 * mientras i sera la posicion anterior a j
			 * */
			temp=array[j];
			i=j-1;
			
			/*Este while valida si la posicion "i" es mayor que la posicion "temp(j)"
			 * entonces el valor en la posicion "i" se sustituira con el valor en la posicion i++
			 * mientras que i va disminuyendo para seguir validando los demas valores
			 * */
			while((i>-1) && (array[i]>temp)){
				array[i+1]=array[i];
				i--;
			}
			
			array[i+1]=temp;
			
		}
	}

    @Override
    public void OrganizeArray() {
        insertionSort(array);
    }

    @Override
    public void run() {
        OrganizeArray();
        System.out.print("InsertSort !!");
    }
    
}
