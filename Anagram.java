import java.util.Scanner;
public class Anagram
{
 public static void main(String[]args)
 {
      Scanner scn=new Scanner(System.in);
      System.out.println("Enter a String");
      String S1=scn.next();
      String S2=scn.next();
      System.out.println(isAnagram(S1,S2));
 }
 public static boolean isAnagram(String S1,String S2)
 {
      
      if(S1.length()!=S2.length())
      return false;
      if(S1.length()==0 && S2.length()==0)
      return true;
      char ch=S1.charAt(0);
      S1=S1.replace(ch+"","");
      S2=S2.replace(ch+"","");
      return isAnagram(S1, S2);
      
 }
}