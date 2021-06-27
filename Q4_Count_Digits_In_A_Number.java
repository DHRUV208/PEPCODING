package getting_Started;
import java.util.*;


public class Q4_Count_Digits_In_A_Number {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		//897
		int count =0;
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println(count);

	}

}
