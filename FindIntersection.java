package week1.assignment2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input1 = {3,2,11,4,6,7};
		int[] input2 = {1,2,8,4,9,7};
		for (int i = 0; i < input2.length; i++)
			{
			for (int j = 0; j < input2.length; j++)
			{
				if(input1[i] == input2[j])
				{
				System.out.println(input1[i]);	
				}
								
			}
			}
	
	}

}
