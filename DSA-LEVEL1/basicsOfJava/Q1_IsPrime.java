package basicsOfJava;

import java.util.Scanner;

public class Q1_IsPrime {

	public static void main(String[] args) {
//		
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		//int factors=0;
		for(int i=0;i<t;i++) {
			
			int n = scn.nextInt();
			int factors=0;
			for(int div=2;div*div<=n;div++) {
			
				if(n % div == 0) {
					
					factors++;
					break;
				}
			
			
				
			}
			if(factors == 0) {
				System.out.println("isPrime");
			}
			else {
				System.out.println("notPrime");
			}
			
		}
		
	}
//	    Scanner scn = new Scanner(System.in);
//	    
//	       // write ur code here
//	       int t=scn.nextInt();
//	      for (int i =1;i<=t;i++){
//	     int n = scn.nextInt();
//	      int factors=0;
//	      
//	      for(int div=2;div*div<=n;div=div+1){
//	       if(n%div==0){
//	           factors=factors+1;
//	           break;
//	           
//	           
//	       }
//	      }
//	            
//	    //   if(factors == 1){
//	    //       System.out.println("prime");
//	    //   }
//	       if(factors==0){
//	           System.out.println("prime");
//	       }
//	       else {
//	           System.out.println("not prime");
//	       }
//	          
//	      }
//	     
	  
}
