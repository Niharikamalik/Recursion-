import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(SumDigit(n));
	}
	public static int SumDigit(int n){
	    if(n%10==0)return 0;
	    return SumDigit(n/10)+n%10;
	}
}
