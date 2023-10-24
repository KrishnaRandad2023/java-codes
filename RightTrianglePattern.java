1.	public class RightTrianglePattern   
2.	{   
3.	public static void main(String args[])   
4.	{   
5.	//i for rows and j for columns      
6.	//row denotes the number of rows you want to print  
7.	int i, j, row=6;   
8.	//outer loop for rows  
9.	for(i=0; i<row; i++)   
10.	{   
11.	//inner loop for columns  
12.	for(j=0; j<=i; j++)   
13.	{   
14.	//prints stars   
15.	System.out.print("* ");   
16.	}   
17.	//throws the cursor in a new line after printing each line  
18.	System.out.println();   
19.	}   
20.	}   
21.	}  
