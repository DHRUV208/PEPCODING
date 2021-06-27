package getting_Started;
import java.util.*;
public class Q3_Print_Fibonacci_Numbers_Till_N {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		int prev=0;
		int curr=1;
		for(int i=1;i<=n;i++) {
			int nextfib=prev+curr;
			System.out.println(prev);
			prev=curr;
			curr= nextfib;
			
		}

	}

}
