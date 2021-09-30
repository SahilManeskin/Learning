import java.util.Scanner;

public class ReverseTheNumber 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int temp = n,rem;
		while(temp != 0){
		    rem = temp % 10;
		    temp = temp / 10;
		    System.out.print(rem);
		}
        // int rev=0;
        // while(n!=0){
        //     rem=n%10;
        //     rev=rev*10+rem;
        //     temp=temp/10;
        // }
		System.out.println();
        sc.close();
	}
}
