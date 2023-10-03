package com.travellersum.Service.core;

public class NotesCount {
	public void notesCountImplementation(int array[] ,int amount) {
		
		int[] noteCounter=new int[array.length];
		/*logic used
		 * first-> array=10,52,89,1,0
		 * second step:->array=89,52,10,1 sorting in descending order
		 * amount to be paid =900
		 * then -->900/89=10 as / gives quotient 
		 * amount=900-890=10 is remaining amount
		 * hence=10/10=1
		 * output: 89:10
		 *         10:1
		 *         */
		
		
		try {
			for(int i=0;i<array.length;i++) {
				if(amount>=array[i]) {
					noteCounter[i]=amount/array[i]; 
					amount=amount - noteCounter[i]*array[i];
					
					if(amount==0) {
						break;
					}
				}
			}
			if(amount>0) {
				System.out.println("exact amount cannot be given with the highest demoniations");
			}else {
				System.out.println("Your payment approach cannot be given in order to give min no of notes will be");
				for(int i=0;i<array.length;i++) {
					if(noteCounter[i]!=0) {
						System.out.println(array[i] + ":" + noteCounter[i]);
					}
				}
			}
		}catch(ArithmeticException e) {
			System.out.println(e+ " notes of denomination 0 is invalid");
		}
	}
}
