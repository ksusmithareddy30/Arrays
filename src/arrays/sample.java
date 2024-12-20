package arrays;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,5,70};
		int smallest=arr[0];
		int biggest=0;
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			if(arr[i]>biggest)
			{
				biggest=arr[i];
			}
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
	
        System.out.println("Sum:"+sum);
        System.out.println("Biggest:"+biggest);
        System.out.println("Smallest:"+smallest);
	 }   

}