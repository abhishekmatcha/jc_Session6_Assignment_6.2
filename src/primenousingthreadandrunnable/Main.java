package primenousingthreadandrunnable;


	
	
	public class Main
	{
	    public static void main(String args[])
	    {
	        try
	        {
	           CheckPrime p=new CheckPrime();
	            Thread t1=new Thread(p);
	           CheckPrime p1=new CheckPrime();  
	            t1.start();
	           
	        }
	        catch(Exception e1){}
	    }
	
	

}



