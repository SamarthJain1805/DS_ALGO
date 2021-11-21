package arrays;

public class leftRotateTheArray {
	
	static void lRotateOne(int arr[],int n) {
		 int temp = arr[0];
		for(int i =1;i<n;i++) {
			arr[i-1]=arr[i];                         //for left rotating the array by one place.
		}
			arr[n-1]=temp;
			
	}
	static void lRotateBy_D_Places(int arr[],int n,int d) {
		int temp[] = new int[d];
		for(int i=0;i<d;i++)
			temp[i] = arr[i];
		    
		for(int i=d;i<n;i++)                         //for left rotating the array by d places.
			arr[i-d] = arr[i];
		
		for(int i=0;i<d;i++)
			arr[n-d+i] = temp[i];
		
	}
	
	public static void main(String args[]) 
    { 
       int arr[] = {1, 2, 3, 4, 5}, n = 5,d=2;

       System.out.println("Before Rotation");

       for(int i = 0; i <n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

       System.out.println();

//       lRotateOne(arr, n);
//
//       System.out.println("After Rotation");                 //for rotation of array to 1 places.
//
//       for(int i = 0; i < n; i++)
//       {
//       		System.out.print(arr[i]+" ");
//       }
       
       System.out.println();
       
       lRotateBy_D_Places(arr, n, d);
       
       System.out.println("After Rotation to D places.");
       
       for(int i=0;i<n;i++) {
    	   System.out.print(arr[i]+" ");
       }

    } 
		
				
	}


