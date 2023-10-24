1.	import java.util.Scanner;  
2.	public class TrianglePattern  
3.	{  
4.	public static void main(String[] args)  
5.	{  
6.	int i, j, k, rows=9;  
7.	for (i=1; i<= rows ; i++)  
8.	{  
9.	for (j = i; j < rows ; j++)   
10.	{  
11.	System.out.print(" ");  
12.	}     
13.	for (k = 1; k <= (2*i -1) ;k++)   
14.	{  
15.	if(k==1 || i == rows || k==(2*i-1))   
16.	{  
17.	System.out.print("*");  
18.	}  
19.	else   
20.	{  
21.	System.out.print(" ");  
22.	}  
23.	}  
24.	System.out.println("");  
25.	}  
26.	}  
27.	}  
