import java.util.Scanner;
public class s{
    public static void main(String args[]){
        int r1,r2,r3;
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
        r1=sc.nextInt();
        r2=sc.nextInt();
        r3=sc.nextInt();
        if((r1+r2<r3)||(r1+r3<r2)||(r2+r3<r1))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
}