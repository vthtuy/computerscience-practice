limport java.io.*;
import java.util.*;
interface PerformOperation {
 boolean check(int a);
}
class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }

  public PerformOperation isOdd() { 
    //   return (int num) -> {
    //       boolean rs = (num%2 != 0) ? true : false ;
    //         return rs;
    //     };
    return a -> (a % 2 != 0)? true:false;
  }
  public PerformOperation isPrime() {
      return (int num) -> {
        {
            for (int i = 2; i < num/2; i++) {
                if ( num % i == 0 ) {
                    return false;
                }
            }
            return true;
        }
   };
  }
  public PerformOperation isPalindrome() {
       return (int num) -> {
        {
            String s = "" + num;
            int left = 0; int right = s.length() - 1;
             
            while (left < right) {
                //System.out.println("left: " + left + s.charAt(left) + ", right: " + right + s.charAt(right) );
                if (s.charAt(left) != s.charAt(right) ) {
                    
                    return false;
                }
                left++;
                right--;
            }
            
            return true;
        }
   };
  }
   // Write your code here
   
}
public class Solution {

 public static void main(String[] args) throws IOException {
  MyMath ob = new MyMath();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int T = Integer.parseInt(br.readLine());
  PerformOperation op;
  boolean ret = false;
  String ans = null;
  while (T--> 0) {
   String s = br.readLine().trim();
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());
   if (ch == 1) {
    op = ob.isOdd();
    ret = ob.checker(op, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
    op = ob.isPrime();
    ret = ob.checker(op, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.isPalindrome();
    ret = ob.checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
  }
 }
}
