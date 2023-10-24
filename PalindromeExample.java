1.	class PalindromeExample{  
2.	 public static void main(String args[]){  
3.	  int r,sum=0,temp;    
4.	  int n=454;//It is the number variable to be checked for palindrome  
5.	  
6.	  temp=n;    
7.	  while(n>0){    
8.	   r=n%10;  //getting remainder  
9.	   sum=(sum*10)+r;    
10.	   n=n/10;    
11.	  }    
12.	  if(temp==sum)    
13.	   System.out.println("palindrome number ");    
14.	  else    
15.	   System.out.println("not palindrome");    
16.	}  
17.	}  
