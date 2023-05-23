package list;

public class Q2 {
	
	public static void display(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("  "+arr[i]);
		}
	}
	
	
	public static void sort(int arr[])
	{

		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				
				if(arr[i]<arr[j])
				{
					int temp;
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		
		}
	}
	
	
	public static void thirdlarge(int arr[])

	{
		int largest=arr[0];
		int secondlargest=0;
		int thirdlarge=0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i+1]<largest)
			{
				secondlargest=arr[i+1];
				System.out.println("Second Largest ="+secondlargest);
				break;
			}
			
		}
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i+1]<secondlargest)
			{
				thirdlarge=arr[i+1];
				System.out.println("Third Largest ="+thirdlarge);
				break;
			}
		}
		
	}
		
		
	public static void main(String[] args) {
		
		
		int[] arr= new int[]{12,12,34,34,34,34,5,6,8,9,9,9,0,5,0,8};
					
	
		display(arr);
		System.out.println();
		
		sort(arr);
		display(arr);
		
		System.out.println();
		thirdlarge(arr);
			
		}	
	}


