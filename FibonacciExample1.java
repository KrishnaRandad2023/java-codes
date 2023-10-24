  1.	class FibonacciExample1{  
2.	public static void main(String args[])  
3.	{    
4.	 int n1=0,n2=1,n3,i,count=10;    
5.	 System.out.print(n1+" "+n2);//printing 0 and 1    
6.	    
7.	 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
8.	 {    
9.	  n3=n1+n2;    
10.	  System.out.print(" "+n3);    
11.	  n1=n2;    
12.	  n2=n3;    
13.	 }    
14.	  
15.	}}  


//using recursion 
1.	/*class FibonacciExample1{  
2.	 static int n1=0,n2=1,n3=0;    
3.	 static void printFibonacci(int count){    
4.	    if(count>0){    
5.	         n3 = n1 + n2;    
6.	         n1 = n2;    
7.	         n2 = n3;    
8.	         System.out.print(" "+n3);   
9.	         printFibonacci(count-1);    
10.	     }    
11.	 }    
12.	 public static void main(String args[]){    
13.	  int count=10;    
14.	  System.out.print(n1+" "+n2);//printing 0 and 1    
*/
