1.	public class ReverseNumberExample1   
2.	{  
3.	public static void main(String[] args)   
4.	{  
5.	int number = 987654, reverse = 0;  
6.	while(number != 0)   
7.	{  
8.	int remainder = number % 10;  
9.	reverse = reverse * 10 + remainder;  
10.	number = number/10;  
11.	}  
12.	System.out.println("The reverse of the given number is: " + reverse);  
13.	}  
14.	}  
