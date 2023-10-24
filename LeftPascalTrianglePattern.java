1.	import java.util.Scanner;  
2.	public class LeftPascalTrianglePattern  
3.	{  
4.	public static void main(String[] args)  
5.	{  
6.	int i, j, k, rows;  
7.	Scanner sc = new Scanner(System.in);  
8.	System.out.print("Enter the number of rows you want to print: ");  
9.	rows = sc.nextInt();          
10.	for (i= 1; i<= rows ; i++)  
11.	{  
12.	for (j=i; j <rows ;j++)              
13.	{  
14.	System.out.print(" ");  
15.	}  
16.	for (k=1; k<=i;k++)   
17.	{  
18.	System.out.print("*");   
19.	}   
20.	System.out.println("");   
21.	}   
22.	for (i=rows; i>=1; i--)  
23.	{  
24.	for(j=i; j<=rows;j++)  
25.	{  
26.	System.out.print(" ");  
27.	}  
28.	for(k=1; k<i ;k++)   
29.	{  
30.	System.out.print("*");  
31.	}  
32.	System.out.println("");  
33.	}  
34.	sc.close();  
35.	}  
36.	}  
