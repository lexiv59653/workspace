package Calculator;

public class Calculator {
		
		private float numOne;
		
		private float numTwo;
			
	

		public float getNumOne() {
			return numOne;
		
		}
		
		public void setNumOne(float numOne) {
			this.numOne = numOne;
				
		}
		
		public float getNumTwo () {
			return numTwo;
		
		}
		
		public void setNumTwo(float numTwo) {
			this.numTwo = numTwo;
		}
		
					
		
		public Calculator(){
		}
		
		
		public float add() { 
			return numOne + numTwo;
		}
		
		public float divide() {
			return numOne / numTwo;
		}
		
		public float multiply() {
			return numOne * numTwo;
		}
		
		public float subtract() {
			return numOne - numTwo;
		}
		
	
	
	}

