public class Main
{
	public static void main(String[] args) {
		int n=2;
		f(n,'A','B','C');
	}
	public static void f(int n,char A,char B,char C){
	    if (n==1){
	        System.out.println("move disk 1 form "+A+ " to "+C);
	        return;
	    }
	    f(n-1,A,B,C);
	    System.out.println("move "+ n +" form " +A+" to "+C);
	    f(n=1,B,A,C);
	}
}
