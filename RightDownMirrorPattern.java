1.	public class RightDownMirrorPattern  
2.	{  
3.	public static void main(String args[])  
4.	{  
5.	int row=7;  
6.	for (int i= row; i>= 1; i--)  
7.	{  
8.	for (int j=row; j>i;j--)  
9.	{  
10.	System.out.print(" ");  
11.	}  
12.	for (int k=1;k<=i;k++)  
13.	{  
14.	System.out.print("*");  
15.	}  
16.	System.out.println("");  
17.	}  
18.	}  
19.	}  
