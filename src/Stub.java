
/****************************************************************************
 *
 * Created by: Nicholas Ellul
 * Created on: Oct 2016
 * This program finds the solutions to a magic square.
 ****************************************************************************/

import java.util.Iterator;

public class Stub {


	public static void magicLineRecursive(int[] box,int start){

		if(checkMagic(box))
		{
			printArray(box);
			System.out.println();
		}
		else{
				
			for(int counter = start; counter < 9; counter ++)
			{
									
					box = pushToBack(box,start,counter);
					magicLineRecursive(box,start+1);
					box = pushToBack(box,start,counter);
				
			}

		}
	
	}
		

	public static void printArray(int[] box){
		
		System.out.println(box[0]+" "+box[1]+" "+box[2]);
		System.out.println(box[3]+" "+box[4]+" "+box[5]);
		System.out.println(box[6]+" "+box[7]+" "+box[8]);
		
		System.out.println("");
	}

	public static int[] pushToBack(int[] array,int start,int end){
		
 		int temp = array[end];
		array[end] = array[start];
		array[start] = temp;
		
		
		return array;
	}

	public static boolean checkMagic(int [] square) {
		
		int [] rows = new int[8];
		rows[0] = square[0] + square[1] + square[2];
		rows[1] = square[3] + square[4] + square[5];
		rows[2] = square[6] + square[7] + square[8];
		rows[3] = square[0] + square[3] + square[6];
		rows[4] = square[1] + square[4] + square[7];
		rows[5] = square[2] + square[5] + square[8];
		rows[6] = square[0] + square[4] + square[8];
		rows[7] = square[2] + square[4] + square[6];
		
		
		if (rows[0] == rows[1] && rows[1] == rows[2] && rows[2] == rows[3] && rows[3] == rows[4]
				&& rows[4] == rows[5] && rows[5] == rows[6] && rows[6] == rows[7]) {
			
			return true;
			
		}
		else {
			return false;
		}
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//magicLine();
		int[] bob = {1,2,3,4,5,6,7,8,9};
		//pushToBack(bob);
		magicLineRecursive(bob,0);
		System.out.println("done");
	}

}