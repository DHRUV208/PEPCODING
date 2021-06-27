package getting_Started;
import java.util.*;

public class Q5_Digits_Of_A_Number {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ndash=n;
		int pow=1;
		while(ndash>=10) {
			ndash=ndash/10;
			pow=pow*10;
		}
		
		while(pow>0) {
			int firstdigit=n/pow;
			System.out.println(firstdigit);
		
			n=n%pow;
			pow=pow/10;
		}
		//lastdigit
		
	}

}
