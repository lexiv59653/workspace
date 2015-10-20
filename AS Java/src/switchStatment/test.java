package switchStatment;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			char grade ='C';
			
			switch(grade)
			{
			case 'A':
				System.out.println("excellent!");
				break;
			case 'B':
			case 'C':
				System.out.println("well done");
				break;
			case 'D':
				System.out.println("you passed");
			case 'F':
				System.out.println("better try again");
				break;
				default :
					System.out.println("invalid grade");
					
			}
	System.out.println("your grade is " + grade);
	}

}
