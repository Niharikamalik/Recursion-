import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(f(n));
	}
	public static int f(int n){
	    if(n<=1)return n;
	    return f(n-1)+f(n-2);
	}
}
