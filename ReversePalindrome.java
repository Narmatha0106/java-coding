import java.util.Scanner;

public class ReversePalindrome {
    public static void main (String[] args)
    {
     Scanner Sc=new Scanner(System.in);
     int num=Sc.nextInt();
     int reverse=0,copynum=num;
     while (num>0) 
     { 
      int digit=num%10;
      reverse=reverse*10+digit;
      num=num/10;   
     } 
     if(reverse==copynum)
       System.out.println("Palindrome");
    else
       System.out.println("not a palindrome");
    }
    
}
