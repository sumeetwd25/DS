package list;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5 , 1 , 7 , 2  ,11 ,15};
			
		int count=1;
		int maxcount=1;
		for(int i=0;i<arr.length-1;i++)
		{
			int j =i+1;
			
			if(arr[i]<arr[j])
			{
			count++;	
			}
			else 
			{
				count=1;
			}
			
			if(maxcount<count) {
				maxcount=count;
			}
		}
		System.out.println("Strictly increasing subarray's max length ="+maxcount);
	}

}
