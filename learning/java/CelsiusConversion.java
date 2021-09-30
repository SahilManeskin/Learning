import java.util.Scanner;

public class CelsiusConversion {
    public static void main(String[] args) {
        double c=0.0,f=0.0;
        Scanner sc=new Scanner(System.in);
        c=sc.nextDouble();
        f=32+((9*c)/5);
        System.out.format("%.1f",f);
    }
}
