import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int a, b, c, n=0; // a는 고정비용, b는 가변비용, c는 노트북 가격, n은 판매횟수
        
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        n = a / (c-b);
        
        if (n>a)
            System.out.println(-1);
        
        System.out.printf("%d", n+1);
        
            
        
    }
}