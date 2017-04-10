package u1;

import java.util.ArrayList;

public class arrayData {
	
	public static void main(String[] args){
		
		int[] myArray = createArray(100000, 1, 1000);
	}


	public static int linearSearch( int [] a, int x){
		return 0;
		
	}
	
	public static int binarySearch( int [] a, int x){
		return 0;
	}
	
	
	public static int[] createArray(int size, int min, int max){ //Använder metoden från inläming 1
		int[] sizeArray = new int[size];
		if(size <= (max-min)){
			ArrayList<Integer> list = new ArrayList<Integer>();	
			
			while(list.size() < size){
				int element = (int)(Math.random()*(max - min) + min);
				if(!(list.contains(element))){list.add(element);}
			}
			for(int i = 0; i<size; i++){sizeArray[i] = list.get(i);}
		}
		else{sizeArray = null;}
		return sizeArray;
		
	}
	
}
