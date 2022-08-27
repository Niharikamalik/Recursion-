import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
    int m = sc.nextInt ();
      System.out.println (solve (n, m));
  }
  static int solve (int m, int n)
  {
   if (n == 0)
      return 0;
    return m + solve (m, n - 1);
  }

}
