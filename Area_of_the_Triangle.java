import java.util.*;
public class area{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double d,s;
        s=(a+b+c)*0.5;
        d=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",d);
    }
}