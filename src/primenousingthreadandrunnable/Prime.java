package som.workspace.com;

import java.util.*;

public class Prime extends Thread{
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Enter the valid integers for checking a number is prime or not\n");
		int n;
		boolean temp=false;
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				temp=true;
				break;
			}
		}
		 
		if(temp==false)
		{
			System.out.println("The number is prime ");
		}
		else
		{
			System.out.println("The number is not prime ");
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
        {
           Prime p=new Prime();
            Thread t1=new Thread(p);
           Prime p1=new Prime();  
            t1.start();
           
        }
        catch(Exception e1){}
    }


	}


