1.	public class ReverseNumberExample2   
2.	{  
3.	public static void main(String[] args)   
4.	{  
5.	int number = 123456, reverse = 0;  
6.	//we have not mentioned the initialization part of the for loop  
7.	for( ;number != 0; number=number/10)   
8.	{  
9.	int remainder = number % 10;  
10.	reverse = reverse * 10 + remainder;  
11.	}  
12.	System.out.println("The reverse of the given number is: " + reverse);  
13.	}  
14.	}  
