package Calculator;

public class CalculatorController {
		public static void main(String[] args) {
			float nOne, nTwo; 
			
			Calculator lexisCalculator = new Calculator();
			
		
			nOne = Float.parseFloat(args[0]);
			nTwo = Float.parseFloat(args[1]);
			
			lexisCalculator.setNumOne(nOne);
			lexisCalculator.setNumTwo(nTwo);
			
			System.out.println("adding" + lexisCalculator.add());
			System.out.println("dividing" + lexisCalculator.divide());
			System.out.println("multiplying" + lexisCalculator.multiply());
			System.out.println("subtracting" + lexisCalculator.subtract());
			
		}
}
