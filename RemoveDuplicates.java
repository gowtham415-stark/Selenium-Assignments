package week1.assignment2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
	int count = 0;
	int j; 
	char[] charArray = text.toCharArray(); 
			{
	for (int i = 0; i < charArray.length; i++) {


		for ( j = 0; j < i; j++) { 
			if (charArray[i] == charArray[j]) {
				break;
			}
		}

		if (j == i) {
			charArray[count++] = charArray[i];
			System.out.print(charArray[i] + " ");
		}
	}
}}}

