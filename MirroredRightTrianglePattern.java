1.	public class MirroredRightTrianglePattern   
2.	{  
3.	public static void main(String[] args)  
4.	{  
5.	int n=7;  
6.	//inner loop  
7.	for (int i= 0; i<= n; i++)  
8.	{  
9.	//outer loop  
10.	for (int j=1; j<=n-i; j++)  
11.	{  
12.	System.out.print(" ");  
13.	}  
14.	for (int k=0;k<=i;k++)  
15.	{  
16.	System.out.print("*");  
17.	}   
18.	System.out.println("");  
19.	}  
20.	}  
21.	}  
