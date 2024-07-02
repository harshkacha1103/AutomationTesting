import java.util.Scanner;

public class Maxminarray {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array: ");
		int n = sc.nextInt();
		int i,sum = 0;
		int arr[] = new int[n];
		
		for(i=0;i<n;i++)
		{
			System.out.println("Enter : ");
			arr[i] = sc.nextInt();
			
		}	
		
			
			int max_element = arr[0], min_element = arr[0];
			
	        for (i = 0; i < n; i++) 
	        {
	            if (arr[i] > max_element) 
	            { 
	                max_element = arr[i];
	            }
	        
	        
	        
	        if (arr[i] < min_element) 
	        {
                min_element = arr[i];
            }
        }

	        System.out.println(" Maximum Number: " + max_element);
	        System.out.println(" Minimum Number: " + min_element);
		
	}
}

