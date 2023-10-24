1.	import java.util.Scanner;  
2.	public class ReverseNumberExample3  
3.	{  
4.	//method for reverse a number  
5.	public static void reverseNumber(int number)   
6.	{  
7.	if (number < 10)   
8.	{  
9.	//prints the same number if the number is less than 10  
10.	System.out.println(number);  
11.	return;  
12.	}  
13.	else   
14.	{  
15.	System.out.print(number % 10);  
16.	reverseNumber(number/10);  
17.	}  
18.	}  
19.	public static void main(String args[])  
20.	{  
21.	System.out.print("Enter the number that you want to reverse: ");  
22.	Scanner sc = new Scanner(System.in);  
23.	int num = sc.nextInt();  
24.	System.out.print("The reverse of the given number is: ");  
25.	//method calling  
26.	reverseNumber(num);  
27.	}  
28.	}  
