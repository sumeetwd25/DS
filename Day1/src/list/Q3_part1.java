package list;

public class Q3_part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5 , 1 , 7 , 2  ,11 ,15};
		
		
		int count=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					count++;
					System.out.println(arr[i]+" "+arr[j]);
					
				}
				break;
			}
		}
		System.out.println("Strictly increasing subarrays="+count);
	}

}
