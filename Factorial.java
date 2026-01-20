import java.util.Scanner;
class Factorial
{
    public static void main(String[]args)
    {
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
           fact=fact*i;
        System.out.println(fact);
        
        

    }
}