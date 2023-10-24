1.	import java.util.*;  
2.	public class AlphabetPattern  
3.	{  
4.	public static void main(String[] args)  
5.	{  
6.	int i, j, n=8;  
7.	// Outer for loop for number of lines  
8.	for (i = 0; i<=n; i++)   
9.	{  
10.	// Inner for loop for logic execution  
11.	for (j = 0; j<= n / 2; j++)   
12.	{  
13.	// prints two vertical lines  
14.	if ((j == 0 || j == n / 2) && i != 0 ||  
15.	// print first line of alphabet  
16.	i == 0  && j != n / 2 ||   
17.	// prints middle line  
18.	i == n / 2)   
19.	System.out.print("*");  
20.	else  
21.	System.out.print(" ");  
22.	}  
23.	System.out.println();  
24.	}  
25.	}  
26.	}  
