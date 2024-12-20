package arrays;

public class temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr= {1,0,1,0};
         int j=0; 
         
         int[] temp=new int[arr.length];
         
         for(int i=0;i<arr.length;i++)
         {
        	 if(arr[i]==1)
        	 {
        		 temp[j]=1;
        		 j++;
        	 }
         }
         for(int i=0;i<arr.length;i++)
         {
        	 if (arr[i]==0) {
        	 temp[j]=0;
        	 j++;
         }
         }
         System.arraycopy(temp, 0, arr, 0, arr.length);
         for(int values:arr)
         {
        	 System.out.println(values);
         }
	}

}
