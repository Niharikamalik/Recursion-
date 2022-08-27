public class Main
{
	public static void main(String[] args) {
		String s="ABC";
		printSub(s,"",0);
	}
	public static void printSub(String s , String curr, int i){
	    if (i==s.length()){
	        System.out.print(curr + " ");
	        return;
	    }
	    printSub(s,curr,i+1);
	    printSub(s,curr+s.charAt(i),i+1);
	} 
}
