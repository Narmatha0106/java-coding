import java.util.Scanner;
class SecondLargestInArray
{
    static int SecondMax(int[] arr,int size)
    {
     int max=arr[0],SMax=Integer.MIN_VALUE;
     for(int i=1;i<size;i++)
     {
        if(arr[i]>max)
        {
            SMax=max;
            max=arr[i];

        }
        else if(arr[i]>SMax && arr[i]!=max)
            SMax=arr[i];
     
     }
    
    
     return SMax;
    }

    public static void main(String[]args)
    {
        Scanner ip=new Scanner(System.in);
        int size=ip.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
          arr[i]=ip.nextInt();
        int res=SecondLargestInArray.SecondMax(arr,size);
        System.out.println(res);
    }
}