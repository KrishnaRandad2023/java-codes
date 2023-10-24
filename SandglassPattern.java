1.	import java.util.Scanner;  
2.	public class SandglassPattern  
3.	{  
4.	public static void main(String[] args)  
5.	{  
6.	int i, j, k, n;  
7.	Scanner sc = new Scanner(System.in);  
8.	System.out.print("Enter the number of rows you want to print: ");  
9.	n = sc.nextInt();              
10.	for (i= 0; i<= n-1 ; i++)  
11.	{  
12.	for (j=0; j<i; j++)  
13.	{  
14.	System.out.print(" ");  
15.	}  
16.	for (k=i; k<=n-1; k++)   
17.	{   
18.	System.out.print("*" + " ");   
19.	}   
20.	System.out.println("");   
21.	}   
22.	for (i= n-1; i>= 0; i--)  
23.	{  
24.	for (j=0; j<i; j++)  
25.	{  
26.	System.out.print(" ");  
27.	}  
28.	for (k=i; k<=n-1; k++)  
29.	{  
30.	System.out.print("*" + " ");  
31.	}  
32.	System.out.println("");  
33.	}  
34.	sc.close();  
35.	}  
36.	}  
