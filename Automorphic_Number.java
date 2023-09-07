import java.util.*;
public class s{
    public static void main(String args[]){
        int n,s;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        s=n*n;
        String s1=Integer.toString(n);
        String s2=Integer.toString(s);
        if(s2.endsWith(s1))
System.out.println("Automorphic Number");
else
System.out.println("Not an Automorphic Number");
    }
}