package basicsOfJava;
import java.util.*;
public class Q2_Print_All_Primes_Till_N {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int low = scn.nextInt();

		int high = scn.nextInt();
		for(int n =low;n<=high;n++) {
			int factors=0;
			for(int div =2;div*div<=n;div++) {
				if(n%div==0) {
					factors++;
					break;
				}
				
			}
			if(factors==0) {
				System.out.println(n);
			}
//			if(factors!=0) {
//				System.out.println(n);
//			}
		}
	}

}
