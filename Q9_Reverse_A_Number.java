package getting_Started;
import java.util.*;
public class Q9_Reverse_A_Number {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		int n = scn.nextInt();
		
		while(n>0) {
			int lastdigit=n%10;
			System.out.println();
			System.out.println(lastdigit);
			n=n/10;
		}
	}

}
