package week1.assignment2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String palindrome = "madam";
		String rev = "";
		for (int i =palindrome.length()- 1; i >= 0; i--)
				rev = rev + palindrome.charAt(i);
					 {
						 if(palindrome.equals(rev)) {
							 System.out.println(palindrome+" Its a Palindrome");
						}
						 
					 else{
						 System.out.println(palindrome+"Not a Palindrom");
					 }
				}
		}
	}

