package javaConcepts;

public class doWhile {

	public static void main(String[] args) {
		String str = "abc";
	    String str2 = "abc";
	    String newString = new String(str);
	    String newString1 = new String(str2);
	    
	    System.out.println("Are " + str + " and " + newString + " the same instance? " + (str == newString));
	    System.out.println("Are " + str + " and " + str2 + " the same instance? " + (str == str2));
		System.out.println("same or not" +(newString==newString1));
	}
}
