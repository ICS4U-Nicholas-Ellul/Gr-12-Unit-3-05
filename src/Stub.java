
public class Stub {

	public static void magicLine(){
		int counter = 9;
		System.out.println("KLJ");
			for(int counterTwo = 1; counterTwo < 6; counterTwo ++){
	
				for(int counterThree = 1;  counterThree < 6;  counterThree ++){
					if(counter + counterTwo + counterThree == 15){
						
						System.out.println(counter + " " + counterTwo + " " + counterThree);
						
					}
				}
				
			}
			
		
		
		
	}
public static void magicLineRecursive(int sum, int leadNumber, int numbersRemaining){
			sum += numbersRemaining;
	
			if(sum == 15 ){
				if(numbersRemaining >0){
					leadNumber -= 1;
				}
				
			}else{
				
				magicLineRecursive(sum, leadNumber, numbersRemaining - 1);
				System.out.println(numbersRemaining);
			}
	}
	
	public static void checkAddition(int[] box){
		
	}
	
	
	public static void magicBox(int[] box, int numbersRemaining){

		/*
		9 5-
		8 6-
		7 7-
		6 8-
		5 9-
		4 2+
		3 3+
		2 4+
		1 5+
		*/
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		magicLine();

	}

}
