package Activities;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] Arr = {10, 77, 10, 54, -11, 10};
		System.out.println("Original array : "+Arrays.toString(Arr));
		Activity2 a2 = new Activity2();
		System.out.println("Result : "+a2.CheckSum(Arr));
	}
		
		public boolean CheckSum(int [] Arr)
		{
		int num =10 ;
		int ExpectedSum = 30 ;
		int tempSum = 0;
		
		for (int n : Arr)
		{
			if (n == num)
				tempSum+= n;
			else
				break;
		}
		return tempSum == ExpectedSum;
		
	}

}
