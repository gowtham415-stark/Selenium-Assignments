package week1.assignment2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] charArray = test.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (!(i%2 ==0))
			{
				String str = String. valueOf(charArray[i]);
				System.out.println(str.toUpperCase());
					
			}
		}

	}

}
