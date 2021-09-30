import java.util.Scanner;

public class IncomeCal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of hours worked in a day:");
        int hours=sc.nextInt();
        sc.nextLine();
        if(hours>0 && hours <=24){
            int p=hours*100*365;
            System.out.println("Total income in a year:"+p);
        }else{
            System.out.println("Unable to calculate the earnings");
        }
    }
}
