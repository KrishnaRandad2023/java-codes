1.	public class PyramidPattern  
2.	{    
3.	public static void main(String args[])   
4.	{    
5.	//i for rows and j for columns      
6.	//row denotes the number of rows you want to print  
7.	int i, j, row = 6;       
8.	//Outer loop work for rows  
9.	for (i=0; i<row; i++)   
10.	{  
11.	//inner loop work for space      
12.	for (j=row-i; j>1; j--)   
13.	{  
14.	//prints space between two stars  
15.	System.out.print(" ");   
16.	}   
17.	//inner loop for columns  
18.	for (j=0; j<=i; j++ )   
19.	{   
20.	//prints star      
21.	System.out.print("* ");   
22.	}   
23.	//throws the cursor in a new line after printing each line  
24.	System.out.println();   
25.	}   
26.	}   
27.	}  
