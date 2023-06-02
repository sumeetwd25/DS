package list;

public class Q2 {
	
	public void display(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("  "+arr[i]);
		}
	}
	
	
	public void sort(int arr[])
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
	
	
	public void thirdlarge(int arr[])
	{
		int largest=arr[0];
		int secondlargest=0;
		int thirdlargest=0;
		
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
				thirdlargest=arr[i+1];
				System.out.println("Third Largest ="+thirdlargest);
				break;
			}
		}	
	}
		
		
	public static void main(String[] args) {
		
		Q2 q = new Q2();	//new obj created to use non-static methods
		
		int[] arr= new int[]{12,12,34,34,34,34,5,6,8,9,9,9,0,5,0,8};
					
		q.display(arr);
		System.out.println();
		
		q.sort(arr);
		q.display(arr);
		
		System.out.println();
		q.thirdlarge(arr);
			
		}	
	}


