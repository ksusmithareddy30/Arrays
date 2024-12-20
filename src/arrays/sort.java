package arrays;

import java.util.Arrays;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {7,5,8,10};
        System.out.println("original array:"+Arrays.toString(arr));
        System.out.println("issorted:"+issorted(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array:"+Arrays.toString(arr));
	}
	public static boolean issorted(int[]arr) {
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
        	return false;
	}
}
return true;
         }

}


