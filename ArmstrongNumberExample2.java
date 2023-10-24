1.	import java.util.Scanner;  
2.	import java.lang.Math;  
3.	public class ArmstsrongNumberExample2  
4.	{  
5.	//function to check if the number is Armstrong or not  
6.	static boolean isArmstrong(int n)   
7.	{   
8.	int temp, digits=0, last=0, sum=0;   
9.	//assigning n into a temp variable  
10.	temp=n;   
11.	//loop execute until the condition becomes false  
12.	while(temp>0)    
13.	{   
14.	temp = temp/10;   
15.	digits++;   
16.	}   
17.	temp = n;   
18.	while(temp>0)   
19.	{   
20.	//determines the last digit from the number      
21.	last = temp % 10;   
22.	//calculates the power of a number up to digit times and add the resultant to the sum variable  
23.	sum +=  (Math.pow(last, digits));   
24.	//removes the last digit   
25.	temp = temp/10;   
26.	}  
27.	//compares the sum with n  
28.	if(n==sum)   
29.	//returns if sum and n are equal  
30.	return true;      
31.	//returns false if sum and n are not equal  
32.	else return false;   
33.	}   
34.	//driver code  
35.	public static void  main(String args[])     
36.	{     
37.	int num;   
38.	Scanner sc= new Scanner(System.in);  
39.	System.out.print("Enter the number: ");  
40.	//reads the limit from the user  
41.	num=sc.nextInt();  
42.	if(isArmstrong(num))  
43.	{  
44.	System.out.print("Armstrong ");  
45.	}  
46.	else   
47.	{  
48.	System.out.print("Not Armstrong ");  
49.	}  
50.	}   
51.	}  
