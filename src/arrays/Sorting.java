package arrays;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr= {10,20,30,40};
         
         if(issorted(arr)) 
         {
        	 System.out.println("the array is sorted:");
         }
         else
         {
        	 System.out.println("the array is not sorted:");
         }
	}
         public static boolean issorted(int[]arr){
     		for(int i=0;i<arr.length-1;i++) {
     			if(arr[i]>arr[i+1]) {
             	return false;
     	}
     }
     return true;
              }

     }

	