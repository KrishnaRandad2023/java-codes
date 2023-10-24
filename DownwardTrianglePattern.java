1.	public class DownwardTrianglePattern  
2.	{  
3.	public static void main(String[] args)  
4.	{  
5.	int rows=7;      
6.	//inner loop  
7.	for (int i= rows-1; i>=0 ; i--)  
8.	{  
9.	//outer loop  
10.	for (int j=0; j<=i; j++)  
11.	{  
12.	//prints star and space  
13.	System.out.print("*" + " ");  
14.	}  
15.	//throws the cursor in the next line after printing each line  
16.	System.out.println();  
17.	}  
18.	}  
19.	}  
