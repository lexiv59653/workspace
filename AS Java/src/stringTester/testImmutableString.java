package stringTester;

public class testImmutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String myFirstName= "Lexi";
		String myLastName= "Veleva";
		
		System.out.println("my reference is "+ myFirstName);
		// returns "my reference is Lexi"
		
		System.out.println(myFirstName+" "+ myLastName);
		// returns Lexi Veleva
		
		System.out.println(myFirstName.equals(myLastName));
		// returns false
		
		String anotherLexi= new String ("Lexi");
		
		System.out.println(myFirstName.equals(anotherLexi));
		// returns true
		
		String longPhraseOne="floxinoxinihilipilification";
		String longPhraseTwo="floxinoxinihilipilification";
		
		System.out.println(longPhraseOne.equals(longPhraseTwo));
		// returns true
	}

}
