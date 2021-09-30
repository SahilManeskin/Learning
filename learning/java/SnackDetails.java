// Rs.100/pizza
// Rs.20/puffs
// Rs.10/cooldrink

import java.util.Scanner;

public class SnackDetails{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of pizzas bought:");
        int pizzas=sc.nextInt();
        System.out.println("Enter the no of puffs bought:");
        int puffs=sc.nextInt();
        System.out.println("Enter the no of cool drinks bought:");
        int cooldrinks=sc.nextInt();
        System.out.println("Bill Details \nNo of pizzas:"+pizzas);
        System.out.println("No of puffs:"+puffs);
        System.out.println("No of cooldrinks:"+cooldrinks);
        System.out.println("Total price="+((pizzas*100)+(puffs*20)+(cooldrinks*10)));
        System.out.println("ENJOY THE SHOW!!!");
        sc.close();
    }
}