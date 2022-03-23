package week1.day2;

import java.util.Arrays;

public class MIssingElementInArray {

	public static void main(String[] args) {
		int[] arr= {1,3,2,4,7,6,8};
		
		Arrays.sort(arr);
		int len= arr.length;
		for (int i=1; i<=len;i++)
			
			if(i!=arr[i-1])
			{
				System.out.println(i);
				break;
			}

	}

}
