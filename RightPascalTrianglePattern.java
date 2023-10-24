1.	import java.util.Scanner;  
2.	public class RightPascalTrianglePattern  
3.	{  
4.	public static void main(String[] args)  
5.	{  
6.	int i, j, rows;  
7.	Scanner sc = new Scanner(System.in);  
8.	System.out.print("Enter the number of rows you want to print: ");  
9.	rows = sc.nextInt();          
10.	for (i= 0; i<= rows-1; i++)  
11.	{  
12.	for (j=0; j<=i; j++)   
13.	{  
14.	System.out.print("*"+ " ");  
15.	}   
16.	System.out.println("");   
17.	}   
18.	for (i=rows-1; i>=0; i--)  
19.	{  
20.	for(j=0; j <= i-1;j++)  
21.	{  
22.	System.out.print("*"+ " ");  
23.	}  
24.	System.out.println("");  
25.	}  
26.	}  
27.	}  
