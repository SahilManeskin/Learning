import java.util.Scanner;

public class DisplayString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String name=sc.next();
        System.out.println("Enter the number");
        int number=sc.nextInt();
        if(number>0){
            for(int i=0;i<number;i++)
                System.out.println(name);
        }else{
            System.out.println(number+" is not a valid input");
        }
        sc.close();
    } 
}
