import java.util.*;
public class s{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int count=0;
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%k!=0)
            {
              count+=1;  
            }
        }
        System.out.println(count);
    }
}