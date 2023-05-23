package list;

public class Q3_part2 {
	
	public static void sort(int arr[][]) {
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=1;j<arr.length;j++)
			{
				if(i!=j) {
					int temp=arr[i][j];
					arr[i][j]=arr[j][i];
					arr[j][i]=temp;
				}
			}
		}
	}
	
	public static void display(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");

			}

		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][];
		arr=new int[2][2];
		
		arr[0][0]=22;
		arr[0][1]=13;
		arr[1][0]=9;
		arr[1][1]=41;

		display(arr);
		System.out.println();
		
		sort(arr);
		display(arr);
	}
	
}
