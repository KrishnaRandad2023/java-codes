1.	public class PrimeExample{    
2.	 public static void main(String args[]){    
3.	  int i,m=0,flag=0;      
4.	  int n=3;//it is the number to be checked    
5.	  m=n/2;      
6.	  if(n==0||n==1){  
7.	   System.out.println(n+" is not prime number");      
8.	  }else{  
9.	   for(i=2;i<=m;i++){      
10.	    if(n%i==0){      
11.	     System.out.println(n+" is not prime number");      
12.	     flag=1;      
13.	     break;      
14.	    }      
15.	   }      
16.	   if(flag==0)  { System.out.println(n+" is prime number"); }  
17.	  }//end of else  
18.	}    
19.	}   

//another way 
1.	/*import java.util.Scanner;  
2.	  
3.	import java.util.Scanner;  
4.	  
5.	public class PrimeExample {  
6.	  
7.	   public static void main(String[] args) {  
8.	       Scanner s = new Scanner(System.in);  
9.	       System.out.print("Enter a number : ");  
10.	       int n = s.nextInt();  
11.	       if (isPrime(n)) {  
12.	           System.out.println(n + " is a prime number");  
13.	       } else {  
14.	           System.out.println(n + " is not a prime number");  
15.	       }  
16.	   }  
17.	  
18.	   public static boolean isPrime(int n) {  
19.	       if (n <= 1) {  
20.	           return false;  
21.	       }  
22.	       for (int i = 2; i < Math.sqrt(n); i++) {  
23.	           if (n % i == 0) {  
24.	               return false;  
25.	           }  
26.	       }  
27.	       return true;  
28.	   }  
29.	}*/
