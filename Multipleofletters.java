package set1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multipleofletters {
	public static void main(String args[]) throws IOException
	{
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in)); 
		System.out.print("Enter the string  :");
		String str=sc.readLine();
	//System.out.print(str(3));
		for(int i=0;i<=str.length()-1;i=i+2)
			
		{
			int j=0;
			
			String str1=str.substring(i+1, i+2);
		
				
			int k=Integer.parseInt(str1);
			while(j<k)
			{
				System.out.print(str.charAt(i));
                j++;
			}
		}
		
	}



}
