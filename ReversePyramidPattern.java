1.	public class ReversePyramidPattern  
2.	{  
3.	public static void main(String[] args)  
4.	{  
5.	int rows=8;  
6.	for (int i= 0; i<= rows-1; i++)  
7.	{  
8.	for (int j=0; j<=i; j++)  
9.	{  
10.	System.out.print(" ");  
11.	}  
12.	for (int k=0; k<=rows-1-i; k++)  
13.	{  
14.	System.out.print("*" + " ");  
15.	}  
16.	System.out.println();  
17.	}  
18.	}  
19.	}  
