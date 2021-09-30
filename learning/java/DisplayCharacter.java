import java.util.Scanner;

public class DisplayCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digits:");
        int dig1=sc.nextInt();
        int dig2=sc.nextInt();
        int dig3=sc.nextInt();
        int dig4=sc.nextInt();
        char ch1=(char)dig1;
        char ch2=(char)dig2;
        char ch3=(char)dig3;
        char ch4=(char)dig4;
        System.out.println(dig1+"-"+ch1);
        System.out.println(dig2+"-"+ch2);
        System.out.println(dig3+"-"+ch3);
        System.out.println(dig4+"-"+ch4);
        sc.close();
    }
}
