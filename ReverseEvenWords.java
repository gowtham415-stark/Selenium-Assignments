package week1.assignment2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String result = ""; 
		String word = ""; 

		String[] words = test.split(" ");
		for (int i = 0; i < words.length; i++) 
		{

			String charArray = words[i];

			if (i % 2 == 0) 
			{

				for (int j = charArray.length() - 1; j >= 0; j--) 
																
				{
					
					word = word+ charArray.charAt(j);
				}
				result = result + word + " ";

				word = "";
			}

			else
				result = result + words[i] + " ";
		}
		System.out.println(result);
		
	}

}
