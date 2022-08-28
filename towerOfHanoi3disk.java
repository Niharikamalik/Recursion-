public class Main
{
	public static void main(String[] args) {
		int n=3;
		f(n,'A','B','C');
	}
	public static void f(int n,char A,char B,char C){
	    if (n==1){
	        System.out.println("move disk 1 form "+A+ " to "+C);
	        return;
	    }
	    f(n-1,A,C,B);
	    System.out.println("move disk "+ n +" form " +A+" to "+C);
	    f(n-1,B,A,C);
	}
}
