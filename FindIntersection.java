package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int[] ar1= {3,2,11,4,6,7};
		int[] ar2= {1,2,8,4,9,7};
		
		for(int i=0; i<=(ar1.length-1);i++)
		{
			for(int j=0; j<=(ar2.length-1);j++)
			{
				if(ar1[i]==ar2[j])
				{
					System.out.println(ar1[i]);
				}
			}
		}

	}

}
