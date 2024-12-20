package arrays;

public class Numbers extends Thread{
		 
		public void even()
		{
			try
			{
				for(int i=1;i<=10;i++)
				{
					if(i%2==0)
				{
						System.out.println(i+"is even");
				}
						Thread.sleep(3000);
			}
		}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
		
			public void odd()
			{
				try
				{
				for(int i=1;i<=10;i++)
				{
					if(i%2!=0)
				{
						System.out.println(i+"is odd");
				}
						Thread.sleep(3000);
			}
				}
				
				catch(Exception e)
				{
					e.printStackTrace();
				}
					
				}
	
			
			public void run()
			{
				if(Thread.currentThread().getName().equals("Even")) 
				{
		    		even();
		    	}
		        else
		        {
		    	   odd();
		    	}
			}
}



				
