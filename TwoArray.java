import java.util.*;
public class TwoArray{
/*******************************************************************************
Daniel J. Gallegos
********************************************************************************/



public static void main(String[] args){
	int[][] scores = new int[8][8];// create  or declare new two dimensional array
	for(int i = 0; i < 8; i++){		//rows
	
		for(int j = 0; j<8; j++){	//colums	
			scores[i][j] = i*j;			//instantiate it with values in this case a multiple of i*j
			System.out.print(scores[i][j]);		//prints the two dimensional array
		}
	}
	System.out.println(" ");
	System.out.println(scores[4][4]);//prints only the value at row 4 column 4
	/*for(int i = 0; i < 8; i++){			//changes all values in row 3 to 0
		scores[3][i]=0; 
	}*/
		for(int i = 0; i < 8; i++){		//rows
		
			for(int j = 0; j<8; j++){	//colums	
			
			System.out.print(scores[3][j]);//printed row 3 8 times 
		}
	}
	System.out.println("");
	pRow(scores);
	System.out.println("");
	pColumn(scores);
	


}


public static void sort(int[] myArray){
	int[] temp = new int[myArray.length];
	int tmp =0;
	for(int i = 0; i < myArray.length; i++){
		tmp = myArray[i];
		for(int j = i+1; j < myArray.length-1; j++){
			if(tmp > myArray[j]){
				
				tmp = myArray[j];
				myArray[j] = myArray[i];
				myArray[i] = tmp;
				

				System.out.println(" new tmp = " + tmp);
				
			}
		}
		temp [i]= tmp;
	}
	for(int i = 0 ; i < 8; i++){
		System.out.println("This is the sorted array score" + temp[i]);
	
	}	
}

public static void pRow(int[][] myArray){ //should print out a two dimensional array
	for(int k =0; k < myArray.length; k++){
		for(int i = 0; i < 8; i++){		//rows
		 System.out.print(myArray[k][i]);	
		}
		System.out.println("");
	}
}
public static void pColumn(int[][] myArray){		//should print the columns of a two dimensional array
	for(int k = 0; k < myArray.length; k++){
		for(int i = 0; i < 8; i++){		//rows
		 System.out.print(myArray[i][k]);// changing how to print the rows and columns does nothing
		}
		System.out.println("");
	}	
}
}
