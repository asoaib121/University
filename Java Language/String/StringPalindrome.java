
package String;


public class StringPalindrome {

   
    public static void main(String[] args) {
      String s1="madam";
      StringBuffer sb=new StringBuffer(s1);
      
      String s2= sb.reverse().toString();
      
      if(s1.equals(s2))
      {
      System.out.println("It is a palindrome");
      }
      else
      {
      System.out.println("It is not palindrome");
      }
      
      
    }
    
}
